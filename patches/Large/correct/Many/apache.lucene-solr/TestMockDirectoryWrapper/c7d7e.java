diff --git a/lucene/core/src/test/org/apache/lucene/store/TestMockDirectoryWrapper.java b/lucene/core/src/test/org/apache/lucene/store/TestMockDirectoryWrapper.java
index 5a1e3a9..347fbda 100644
--- a/lucene/core/src/test/org/apache/lucene/store/TestMockDirectoryWrapper.java
+++ b/lucene/core/src/test/org/apache/lucene/store/TestMockDirectoryWrapper.java
@@ -55,7 +55,7 @@
   public void testDiskFull() throws IOException {
     // test writeBytes
     MockDirectoryWrapper dir = newMockDirectory();
-    dir.setMaxSizeInBytes(2);
+    dir.setMaxSizeInBytes(3);
     final byte[] bytes = new byte[] { 1, 2};
     IndexOutput out = dir.createOutput("foo", IOContext.DEFAULT);
     out.writeBytes(bytes, bytes.length); // first write should succeed
@@ -73,7 +73,7 @@
     
     // test copyBytes
     dir = newMockDirectory();
-    dir.setMaxSizeInBytes(2);
+    dir.setMaxSizeInBytes(3);
     out = dir.createOutput("foo", IOContext.DEFAULT);
     out.copyBytes(new ByteArrayDataInput(bytes), bytes.length); // first copy should succeed
     // flush() to ensure the written bytes are not buffered and counted
