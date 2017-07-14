# IndexBuilder

## Introduction
This is an independent IndexBuilder application moved out from SearchAds Server. with this application, we can create the index in advance, to acceleate the speed of SearchAds server.

## Dependency

1. jackson
2. lucenne
3. spymemecached.

## Before start

Create two tables, ad and campaign in your mysql database;
```
SearchAd DB
Ad
AdID
CampaignID
Keywords
Bid
price
thumbnail
Description
Brand
detail_url
Category
Title
```
```
Campaign
CampaignID
Budget*
```
## File
1. ads_0502.txt 
2. budget.txt

## How to run
```
git clone https://github.com/mrjzhu/IndexBuilder.git

```

```
cd IndexBuilder/IndexBuilder/out/artifacts/IndexBuilder_jar/
```
```
java -jar IndexBuilder.jar
```
## Result

The inverted Index store in memached,
and other Ads data and Campaign Data store in mysql database;

## note

1. All the file path in main function are based on my local machine, you need to change it if you wanna run.
2. The memcached port,  mysqlHost, mysqlPort, mysqlUsername and password are based on my machine, you need to change it.
