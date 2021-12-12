diff --git a/lucene/test-framework/src/java/org/apache/lucene/store/BaseDirectoryTestCase.java b/lucene/test-framework/src/java/org/apache/lucene/store/BaseDirectoryTestCase.java
index 4365438..c015351 100644
--- a/lucene/test-framework/src/java/org/apache/lucene/store/BaseDirectoryTestCase.java
+++ b/lucene/test-framework/src/java/org/apache/lucene/store/BaseDirectoryTestCase.java
@@ -1192,7 +1192,7 @@
   }
 
   public void testSeekToEndOfFile() throws IOException {
-    try (Directory dir = newDirectory()) {
+    try (Directory dir = getDirectory(createTempDir())) {
       try (IndexOutput out = dir.createOutput("a", IOContext.DEFAULT)) {
         for (int i = 0; i < 1024; ++i) {
           out.writeByte((byte) 0);
@@ -1208,7 +1208,7 @@
   }
 
   public void testSeekBeyondEndOfFile() throws IOException {
-    try (Directory dir = newDirectory()) {
+    try (Directory dir = getDirectory(createTempDir())) {
       try (IndexOutput out = dir.createOutput("a", IOContext.DEFAULT)) {
         for (int i = 0; i < 1024; ++i) {
           out.writeByte((byte) 0);
