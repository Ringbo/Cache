diff --git a/moshi/src/main/java/com/squareup/moshi/JsonReader.java b/moshi/src/main/java/com/squareup/moshi/JsonReader.java
index e4b1142..a2c06c3 100644
--- a/moshi/src/main/java/com/squareup/moshi/JsonReader.java
+++ b/moshi/src/main/java/com/squareup/moshi/JsonReader.java
@@ -422,7 +422,7 @@
         ByteString[] result = new ByteString[strings.length];
         Buffer buffer = new Buffer();
         for (int i = 0; i < strings.length; i++) {
-          JsonUt8Writer.string(buffer, strings[i]);
+          JsonUtf8Writer.string(buffer, strings[i]);
           buffer.readByte(); // Skip the leading double quote (but leave the trailing one).
           result[i] = buffer.readByteString();
         }
