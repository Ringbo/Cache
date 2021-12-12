diff --git a/src/java/org/apache/solr/core/Config.java b/src/java/org/apache/solr/core/Config.java
index ce6e7e9..b5b2a4d 100644
--- a/src/java/org/apache/solr/core/Config.java
+++ b/src/java/org/apache/solr/core/Config.java
@@ -144,7 +144,7 @@
   }
 
   public int getInt(String path) {
-    return Integer.parseInt(getVal(path, false));
+    return Integer.parseInt(getVal(path, true));
   }
 
   public int getInt(String path, int def) {
@@ -153,7 +153,7 @@
   }
 
   public boolean getBool(String path) {
-    return Boolean.parseBoolean(getVal(path, false));
+    return Boolean.parseBoolean(getVal(path, true));
   }
 
   public boolean getBool(String path, boolean def) {
@@ -162,7 +162,7 @@
   }
 
   public float getFloat(String path) {
-    return Float.parseFloat(getVal(path, false));
+    return Float.parseFloat(getVal(path, true));
   }
 
   public float getFloat(String path, float def) {
