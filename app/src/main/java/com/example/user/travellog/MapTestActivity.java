package com.example.user.travellog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import jp.co.yahoo.android.maps.*;

public class MapTestActivity extends MapActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_test);
        String a = getString(R.string.yahooId);
        MapView mapView = new MapView(this,a);
        MapController c = mapView.getMapController();
        c.setCenter(new GeoPoint(35665721, 139731006)); //初期表示の地図を指定
        c.setZoom(1);                                //初期表示の縮尺を指定
        setContentView(mapView);
    }

    @Override
    protected boolean isRouteDisplayed() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }
}
