diff --git a/Easy/BestTimetoBuyandSellStock1.java b/Easy/BestTimetoBuyandSellStock1.java
index dd2cb91..f5e9f95 100644
--- a/Easy/BestTimetoBuyandSellStock1.java
+++ b/Easy/BestTimetoBuyandSellStock1.java
@@ -10,12 +10,12 @@
 
 public class BestTimetoBuyandSellStock {
     public static int maxProfit(int[] prices) {
-        if(prices == null || prices.length == 0 || prices.length == 1){
+        if(prices == null || prices.length < 2){
             return 0;
         }
         int max = 0;
         int minPrice = prices[0];
-        for(int i = 0; i < prices.length; i++){
+        for(int i = 1; i < prices.length; i++){
             minPrice = Math.min(minPrice, prices[i]);
             max = Math.max(max,  prices[i] - minPrice);
         }
