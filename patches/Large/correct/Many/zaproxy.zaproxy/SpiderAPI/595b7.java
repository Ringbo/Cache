diff --git a/src/org/zaproxy/zap/extension/spider/SpiderAPI.java b/src/org/zaproxy/zap/extension/spider/SpiderAPI.java
index e0b736b..a1b3379 100644
--- a/src/org/zaproxy/zap/extension/spider/SpiderAPI.java
+++ b/src/org/zaproxy/zap/extension/spider/SpiderAPI.java
@@ -423,7 +423,7 @@
 			ApiResponseList resultUrls = new ApiResponseList(name);
 			SpiderScan scan = (SpiderScan) this.getSpiderScan(params);
 			ApiResponseList resultList = new ApiResponseList("urlsInScope");
-			synchronized (scan.getResults()) {
+			synchronized (scan.getResourcesFound()) {
 				for (SpiderResource sr : scan.getResourcesFound()) {
 					Map<String, String> map = new HashMap<>();
 					map.put("messageId", Integer.toString(sr.getHistoryId()));
