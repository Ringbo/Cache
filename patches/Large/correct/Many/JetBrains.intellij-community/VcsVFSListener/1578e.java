diff --git a/openapi/src/com/intellij/openapi/vcs/VcsVFSListener.java b/openapi/src/com/intellij/openapi/vcs/VcsVFSListener.java
index 79e9ab9..b2d0b3e 100644
--- a/openapi/src/com/intellij/openapi/vcs/VcsVFSListener.java
+++ b/openapi/src/com/intellij/openapi/vcs/VcsVFSListener.java
@@ -191,7 +191,8 @@
 
   private class MyVirtualFileAdapter extends VirtualFileAdapter {
     public void fileCreated(final VirtualFileEvent event) {
-      if (!isEventIgnored(event) && !myChangeListManager.isIgnoredFile(event.getFile())) {
+      if (!isEventIgnored(event) && !myChangeListManager.isIgnoredFile(event.getFile()) &&
+           (isDirectoryVersioningSupported() || !event.getFile().isDirectory())) {
         myAddedFiles.add(event.getFile());              
       }
     }
