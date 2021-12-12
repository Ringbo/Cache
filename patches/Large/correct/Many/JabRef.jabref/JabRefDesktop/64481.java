diff --git a/src/main/java/net/sf/jabref/gui/desktop/JabRefDesktop.java b/src/main/java/net/sf/jabref/gui/desktop/JabRefDesktop.java
index 11abedb..ac252aa 100644
--- a/src/main/java/net/sf/jabref/gui/desktop/JabRefDesktop.java
+++ b/src/main/java/net/sf/jabref/gui/desktop/JabRefDesktop.java
@@ -155,7 +155,7 @@
     private static void openExternalFilePlatformIndependent(ExternalFileType fileType, String filePath) throws IOException {
         Optional<String> application = fileType.getOpenWithApplication();
 
-        if(application.isPresent()) {
+        if(!application.isPresent()) {
             NATIVE_DESKTOP.openFile(filePath, fileType.getExtension());
         } else {
             NATIVE_DESKTOP.openFileWithApplication(filePath, application.get());
