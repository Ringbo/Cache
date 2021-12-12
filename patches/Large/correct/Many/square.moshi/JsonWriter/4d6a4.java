diff --git a/moshi/src/main/java/com/squareup/moshi/JsonWriter.java b/moshi/src/main/java/com/squareup/moshi/JsonWriter.java
index 7e74f6c..96c86bd 100644
--- a/moshi/src/main/java/com/squareup/moshi/JsonWriter.java
+++ b/moshi/src/main/java/com/squareup/moshi/JsonWriter.java
@@ -138,7 +138,7 @@
 
   /** Returns a new instance that writes UTF-8 encoded JSON to {@code sink}. */
   public static JsonWriter of(BufferedSink sink) {
-    return new JsonUt8Writer(sink);
+    return new JsonUtf8Writer(sink);
   }
 
   JsonWriter() {
