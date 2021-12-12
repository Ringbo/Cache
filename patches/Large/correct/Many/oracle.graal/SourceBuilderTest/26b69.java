diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/source/SourceBuilderTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/source/SourceBuilderTest.java
index 767a6c9..4c59bde 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/source/SourceBuilderTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/source/SourceBuilderTest.java
@@ -124,7 +124,7 @@
     }
 
     @Test
-    public void ioExceptionWhenFildDoesntExist() throws IOException {
+    public void ioExceptionWhenFileDoesntExist() throws Exception {
         File file = File.createTempFile("Hello", ".java").getCanonicalFile();
         file.delete();
         assertFalse("Doesn't exist", file.exists());
@@ -142,7 +142,7 @@
     }
 
     @Test
-    public void ioExceptionWhenReaderThrowsIt() throws IOException {
+    public void ioExceptionWhenReaderThrowsIt() throws Exception {
         final IOException ioEx = new IOException();
         Reader reader = new Reader() {
             @Override
