package com.cs504_2;

public class Main {


    public static void main(String[] args) {
	// write your code here
        String adsDataFilePath = "/home/zhujian/IdeaProjects/IndexBuilder/ads_0502.txt";
        String budgetDataFilePath = "/home/zhujian/IdeaProjects/IndexBuilder/budget.txt";
        String memcachedServer = "127.0.0.1";
        String mysqlHost = "127.0.0.1:3306";
        String mysqlDb = "searchAds";
        String mysqlUser = "root";
        String mysqlPass = "root";
        int memcachedPortal = 11211;
        AdsEngine adsEngine = new AdsEngine(adsDataFilePath,budgetDataFilePath,memcachedServer,memcachedPortal,mysqlHost,mysqlDb,mysqlUser,mysqlPass);

        adsEngine.init();
    }
}
