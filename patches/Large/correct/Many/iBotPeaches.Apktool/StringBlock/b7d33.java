diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/StringBlock.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/StringBlock.java
index 4bfeb19..c1656d2 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/StringBlock.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/StringBlock.java
@@ -41,7 +41,7 @@
      * be at the chunk type.
      */
     public static StringBlock read(ExtDataInput reader) throws IOException {
-        reader.skipCheckInt(CHUNK_STRINGPOOL_TYPE);
+        reader.skipCheckChunkTypeInt(CHUNK_STRINGPOOL_TYPE, CHUNK_NULL_TYPE);
         int chunkSize = reader.readInt();
 
         // ResStringPool_header
