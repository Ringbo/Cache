diff --git a/src/main/java/com/alibaba/druid/stat/DruidStatService.java b/src/main/java/com/alibaba/druid/stat/DruidStatService.java
index 894a9d0..e76072e 100644
--- a/src/main/java/com/alibaba/druid/stat/DruidStatService.java
+++ b/src/main/java/com/alibaba/druid/stat/DruidStatService.java
@@ -149,7 +149,7 @@
         }
 
         if (url.startsWith("/weburi-") && url.indexOf(".json") > 0) {
-            String uri = StringUtils.subString(url, "weburi-", ".json");
+            String uri = StringUtils.subString(url, "weburi-", ".json", true);
             return returnJSONResult(RESULT_CODE_SUCCESS, getWebURIStatData(uri));
         }
 
