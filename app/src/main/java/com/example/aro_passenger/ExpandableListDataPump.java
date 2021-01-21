package com.example.aro_passenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Hatchback = new ArrayList<String>();
        Hatchback.add("Indica");
        Hatchback.add("Liva");
        Hatchback.add("Bolt");
        Hatchback.add("Ford Figo");

        List<String> Sedan = new ArrayList<String>();
        Sedan.add("Tata Zest");
        Sedan.add("Toyota Etios");
        Sedan.add("Ford Aspire");
        Sedan.add("Swift Desire");
        Sedan.add("Honda Amaze");

        List<String> SUV = new ArrayList<String>();
        SUV.add("Toyota Innova");
        SUV.add("Mahindra Xylo");
        SUV.add("Renault Lodgy");
        SUV.add("Chevrolet Tavera");
        SUV.add("Mahindra Marazzo");

        List<String> XUV = new ArrayList<String>();
        XUV.add("Maruthi Suzuki Ertiga");

        List<String> MUV = new ArrayList<String>();
        MUV.add("Renault Triber");


        expandableListDetail.put("Hatchback", Hatchback);
        expandableListDetail.put("Sedan", Sedan);
        expandableListDetail.put("SUV", SUV);
        expandableListDetail.put("XUV", XUV);
        expandableListDetail.put("MUV", MUV);

        return expandableListDetail;
    }
}
