diff --git a/h2o-core/src/test/java/water/parser/ParserTest.java b/h2o-core/src/test/java/water/parser/ParserTest.java
index 5418e67..7395c77 100644
--- a/h2o-core/src/test/java/water/parser/ParserTest.java
+++ b/h2o-core/src/test/java/water/parser/ParserTest.java
@@ -14,7 +14,7 @@
   private final char[] SEPARATORS = new char[] {',', ' '};
 
   // Make a ByteVec with the specific Chunks
-  static Key makeByteVec(String... data) {
+  public static Key makeByteVec(String... data) {
     Futures fs = new Futures();
     long[] espc  = new long[data.length+1];
     for( int i = 0; i < data.length; ++i ) espc[i+1] = espc[i]+data[i].length();
