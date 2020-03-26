package com.example.cvt_data;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;
import java.util.ArrayList;

public class Bluetoothfunction extends AppCompatActivity {
    Button btnPaired;  //设置蓝牙开关按钮
    ListView devicelist;  //设置列表展示可连接的蓝牙设备

    private BluetoothAdapter myBluetooth = null;
    private Set<BluetoothDevice> pairedDevices;
    public static String EXTRA_ADDRESS = "decive_address";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        btnPaired = (Button) findViewById(R.id.button1);
        devicelist = (ListView) findViewById(R.id.listView1);

        myBluetooth = BluetoothAdapter.getDefaultAdapter();
        if(myBluetooth == null){
            Toast.makeText(getApplicationContext(), "Bluetooth device not available", Toast.LENGTH_LONG).show();
            finish();
        }else if(!myBluetooth.isEnabled()){

        }

    }
}
