diff --git a/core/src/processing/data/JSONObject.java b/core/src/processing/data/JSONObject.java
index 78c520c..b01074d 100644
--- a/core/src/processing/data/JSONObject.java
+++ b/core/src/processing/data/JSONObject.java
@@ -1116,12 +1116,12 @@
   }
 
 
-  public JSONObject setJSONObject(String key, String value) {
+  public JSONObject setJSONObject(String key, JSONObject value) {
     return put(key, value);
   }
 
 
-  public JSONObject setJSONArray(String key, String value) {
+  public JSONObject setJSONArray(String key, JSONArray value) {
     return put(key, value);
   }
 
