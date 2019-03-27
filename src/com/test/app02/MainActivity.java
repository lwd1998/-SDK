package com.test.app02;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	private MapView mMapView ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//��ʹ��SDK�����֮ǰ��ʼ��context��Ϣ������ApplicationContext
        //ע��÷���Ҫ��setContentView����֮ǰʵ��
        SDKInitializer.initialize(getApplicationContext());
		setContentView(R.layout.activity_main);
		initView();
	}
	private void initView() {
		mMapView = (MapView) findViewById(R.id.id_bmapView);
	}
	@Override
	protected void onResume() {
		super.onResume();
		//��activityִ��onResumeʱִ��mMapView. onResume ()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onResume();  
	}
@Override
	protected void onPause() {
		super.onPause();
		//��activityִ��onPauseʱִ��mMapView. onPause ()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onPause();  
	}
@Override
	protected void onDestroy() {
		super.onDestroy();
		//��activityִ��onDestroyʱִ��mMapView.onDestroy()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onDestroy();  
	}
}