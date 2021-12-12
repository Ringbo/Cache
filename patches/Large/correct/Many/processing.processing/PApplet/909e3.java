diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index fce0463..7dd8263 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -6174,7 +6174,7 @@
    * @see PApplet#saveJSONObject(JSONObject, String)
    */
   public boolean saveJSONArray(JSONArray json, String filename) {
-    return saveJSONArray(json, filename);
+    return saveJSONArray(json, filename, null);
   }
 
 
