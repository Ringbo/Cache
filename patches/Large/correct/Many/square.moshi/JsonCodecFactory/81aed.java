diff --git a/moshi/src/test/java/com/squareup/moshi/JsonCodecFactory.java b/moshi/src/test/java/com/squareup/moshi/JsonCodecFactory.java
index afa4e32..1bab51a 100644
--- a/moshi/src/test/java/com/squareup/moshi/JsonCodecFactory.java
+++ b/moshi/src/test/java/com/squareup/moshi/JsonCodecFactory.java
@@ -35,7 +35,7 @@
 
       @Override JsonWriter newWriter() {
         buffer = new Buffer();
-        return new JsonUt8Writer(buffer);
+        return new JsonUtf8Writer(buffer);
       }
 
       @Override String json() {
