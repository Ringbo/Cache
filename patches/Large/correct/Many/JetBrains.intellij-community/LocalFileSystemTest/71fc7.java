diff --git a/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/LocalFileSystemTest.java b/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/LocalFileSystemTest.java
index b82f189..9261fc6 100644
--- a/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/LocalFileSystemTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/openapi/vfs/local/LocalFileSystemTest.java
@@ -218,7 +218,7 @@
       assertNotNull(file);
       file.setBinaryContent("hello".getBytes(), 0, 0, requestor);
 
-      final VirtualFile check = LocalFileSystem.getInstance().findFileByIoFile(hardLinkFile);
+      final VirtualFile check = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(hardLinkFile);
       assertNotNull(check);
       assertEquals("hello", VfsUtilCore.loadText(check));
     }
