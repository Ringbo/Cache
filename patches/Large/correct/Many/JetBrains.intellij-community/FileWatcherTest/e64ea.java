diff --git a/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/FileWatcherTest.java b/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/FileWatcherTest.java
index ed5412b..c5fb489 100644
--- a/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/FileWatcherTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/FileWatcherTest.java
@@ -493,7 +493,7 @@
       myAccept = true;
       assertTrue(FileUtil.delete(rootDir));
       assertTrue(rootDir.mkdir());
-      if (SystemInfo.isLinux) TimeoutUtil.sleep(1100);  // implementation specific
+      if (SystemInfo.isLinux) TimeoutUtil.sleep(1500);  // implementation specific
       assertTrue(file1.createNewFile());
       assertTrue(file2.createNewFile());
       assertEvent(VFileContentChangeEvent.class, file1.getPath(), file2.getPath());
