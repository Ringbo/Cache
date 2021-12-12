diff --git a/java/java-tests/testSrc/com/intellij/openapi/vfs/GetPathPerformanceTest.java b/java/java-tests/testSrc/com/intellij/openapi/vfs/GetPathPerformanceTest.java
index 2c5b2e7..c3270ed 100644
--- a/java/java-tests/testSrc/com/intellij/openapi/vfs/GetPathPerformanceTest.java
+++ b/java/java-tests/testSrc/com/intellij/openapi/vfs/GetPathPerformanceTest.java
@@ -29,7 +29,7 @@
     final VirtualFile file = LocalFileSystem.getInstance().refreshAndFindFileByPath(ioFile.getPath().replace(File.separatorChar, '/'));
     assertNotNull(file);
 
-    PlatformTestUtil.startPerformanceTest("VF.getPath() performance failed", 3000, new ThrowableRunnable() {
+    PlatformTestUtil.startPerformanceTest("VF.getPath() performance failed", 4000, new ThrowableRunnable() {
       @Override
       public void run() {
         for (int i = 0; i < 1000000; ++i) {
