diff --git a/src/main/java/tachyon/client/TachyonFS.java b/src/main/java/tachyon/client/TachyonFS.java
index e644d9b..7c0f70a 100644
--- a/src/main/java/tachyon/client/TachyonFS.java
+++ b/src/main/java/tachyon/client/TachyonFS.java
@@ -455,7 +455,8 @@
     }
   }
 
-  private synchronized ClientFileInfo getClientFileInfo(String path, boolean useCachedMetadata) { 
+  private synchronized ClientFileInfo getClientFileInfo(String path, boolean useCachedMetadata)
+      throws IOException { 
     connect();
     if (!mConnected) {
       return null;
@@ -566,7 +567,8 @@
     return getFile(path, false);
   }
 
-  public synchronized TachyonFile getFile(String path, boolean useCachedMetadata) {
+  public synchronized TachyonFile getFile(String path, boolean useCachedMetadata) 
+      throws IOException {
     path = CommonUtils.cleanPath(path);
     ClientFileInfo clientFileInfo = getClientFileInfo(path, useCachedMetadata);
     if (clientFileInfo == null) {
