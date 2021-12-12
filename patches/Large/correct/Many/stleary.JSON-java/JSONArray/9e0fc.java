diff --git a/JSONArray.java b/JSONArray.java
index 8647f0a..132d46d 100644
--- a/JSONArray.java
+++ b/JSONArray.java
@@ -1015,7 +1015,7 @@
      * @throws IllegalArgumentException if {@code jsonPointer} has invalid syntax
      */
     public Object optQuery(String jsonPointer) {
-    	return query(new JSONPointer(jsonPointer));
+    	return optQuery(new JSONPointer(jsonPointer));
     }
     
     /**
