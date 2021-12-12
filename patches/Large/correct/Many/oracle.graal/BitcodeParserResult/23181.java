diff --git a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/BitcodeParserResult.java b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/BitcodeParserResult.java
index 3ade99e..4b0b4f0 100644
--- a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/BitcodeParserResult.java
+++ b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/BitcodeParserResult.java
@@ -59,7 +59,7 @@
     public static BitcodeParserResult getFromSource(Source source, ByteBuffer bytes) throws IOException {
         assert bytes != null;
         if (!LLVMScanner.isSupportedFile(bytes)) {
-            throw new IOException("Unsupported file: " + source.toString());
+            throw new IOException("Unsupported file: " + source.getName());
         }
 
         final ModelModule model = LLVMScanner.parse(source, bytes);
