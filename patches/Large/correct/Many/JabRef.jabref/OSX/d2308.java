diff --git a/src/main/java/net/sf/jabref/gui/desktop/os/OSX.java b/src/main/java/net/sf/jabref/gui/desktop/os/OSX.java
index f883f31..f6489d71 100644
--- a/src/main/java/net/sf/jabref/gui/desktop/os/OSX.java
+++ b/src/main/java/net/sf/jabref/gui/desktop/os/OSX.java
@@ -12,7 +12,7 @@
     public void openFile(String filePath, String fileType) throws IOException {
         ExternalFileType type = ExternalFileTypes.getInstance().getExternalFileTypeByExt(fileType);
 
-        if (type == null && type.getOpenWithApplication().isEmpty()) {
+        if (type != null && !type.getOpenWithApplication().isEmpty()) {
             openFileWithApplication(filePath, type.getOpenWithApplication());
         } else {
             String[] cmd = { "/usr/bin/open", filePath };
