diff --git a/source/com/intellij/openapi/vfs/impl/VirtualFilePointerImpl.java b/source/com/intellij/openapi/vfs/impl/VirtualFilePointerImpl.java
index 11199d6..3418800 100644
--- a/source/com/intellij/openapi/vfs/impl/VirtualFilePointerImpl.java
+++ b/source/com/intellij/openapi/vfs/impl/VirtualFilePointerImpl.java
@@ -22,14 +22,14 @@
   @NonNls private static final String ATTRIBUTE_URL = "url";
 
   VirtualFilePointerImpl(VirtualFile file, VirtualFileManager virtualFileManager) {
-    LOG.assertTrue(file != null);
+    LOG.assertTrue(file != null,"Virtual file should not be null!");
     myFile = file;
     myUrl = null;
     myVirtualFileManager = virtualFileManager;
   }
 
   VirtualFilePointerImpl(String url, VirtualFileManager virtualFileManager) {
-    LOG.assertTrue(url != null);
+    LOG.assertTrue(url != null, "Url should not be null!");
     myFile = null;
     myUrl = url;
     myVirtualFileManager = virtualFileManager;
