package com.example.user.travellog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.user.travellog.Entry.JsonStringConverter;
import com.example.user.travellog.Entry.Spot;
import com.example.user.travellog.Entry.Travel;

import jp.co.yahoo.android.maps.*;

public class MapTestActivity extends MapActivity {
    public Travel travel;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_test);

        travel = (Travel) getIntent().getSerializableExtra("travel");

        /*マップ表示*/
        String app_id =getString(R.string.yahooId);
        MapView mapView = new MapView(this,app_id);
        MapController c = mapView.getMapController();
        c.setCenter(travel.toGeoPoint()); //初期表示の地図を指定
        c.setZoom(1);                                //初期表示の縮尺を指定

        /*ルート表示*/
        GeoPoint[] routes = new GeoPoint[travel.getRoutes().size()];
        for(int i = 0; i < travel.getRoutes().size(); i++){
            routes[i] = travel.getRoutes().get(i).toGeoPoint();
        }

        mapView.getOverlays().add(new PolygonOverlay(routes));

        /*立ち寄った場所表示*/
        for(Spot s : travel.getSpots()){
            PinOverlay pin = new PinOverlay(PinOverlay.PIN_VIOLET);
            pin.addPoint(s.toGeoPoint(), s.getSpotName(), s.getSpotName());

            PopupOverlay pop = new PopupOverlay();
            pin.setOnFocusChangeListener(pop);
            mapView.getOverlays().add(pin);
            mapView.getOverlays().add(pop);
        }

        ((FrameLayout)findViewById(R.id.map)).addView(mapView);
        ((TextView)findViewById(R.id.travel_title)).setText(travel.getTravelDate() + "   " + travel.getAreaName());
        ((Button)findViewById(R.id.toSpotList)).setOnClickListener(new OnNoteBtnClickListener());
//        setContentView(mapView);
    }

    public class OnNoteBtnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MapTestActivity.this, SpotListActivity.class);
            intent.putExtra("travel",travel);
            startActivity(intent);
        }
    }

    @Override
    protected boolean isRouteDisplayed() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }
}
