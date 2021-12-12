diff --git a/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/IgnoredFileCache.java b/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/IgnoredFileCache.java
index 145aba5..ed40ce0 100644
--- a/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/IgnoredFileCache.java
+++ b/platform/platform-impl/src/com/intellij/openapi/fileTypes/impl/IgnoredFileCache.java
@@ -93,7 +93,7 @@
   }
 
   boolean isFileIgnored(VirtualFile file) {
-    if (myVfsEventNesting == 0 || !(file instanceof NewVirtualFile)) {
+    if (myVfsEventNesting != 0 || !(file instanceof NewVirtualFile)) {
       return isFileIgnoredNoCache(file);
     }
 
