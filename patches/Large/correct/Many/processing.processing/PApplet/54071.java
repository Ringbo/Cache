diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index deaca8e..98ef23a 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -6110,14 +6110,12 @@
 
 
   public JSONObject loadJSONObject(String filename) {
-    //JSONTokener tokener = new JSONTokener(createReader(filename));
-    //return new JSONObject(tokener);
     return new JSONObject(createReader(filename));
   }
 
 
   public boolean saveJSONObject(JSONObject json, String filename) {
-    return saveJSONObject(json, filename);
+    return saveJSONObject(json, filename, null);
   }
 
 
@@ -6132,8 +6130,6 @@
 
 
   public JSONArray loadJSONArray(String filename) {
-//    JSONTokener tokener = new JSONTokener(createReader(filename));
-//    return new JSONArray(tokener);
     return new JSONArray(createReader(filename));
   }
 
