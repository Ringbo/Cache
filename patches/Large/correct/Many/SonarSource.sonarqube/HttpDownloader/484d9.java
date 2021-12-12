diff --git a/subprojects/sonar-update-center/sonar-update-center-server/src/main/java/org/sonar/updatecenter/server/HttpDownloader.java b/subprojects/sonar-update-center/sonar-update-center-server/src/main/java/org/sonar/updatecenter/server/HttpDownloader.java
index 44aad96..59026bb 100644
--- a/subprojects/sonar-update-center/sonar-update-center-server/src/main/java/org/sonar/updatecenter/server/HttpDownloader.java
+++ b/subprojects/sonar-update-center/sonar-update-center-server/src/main/java/org/sonar/updatecenter/server/HttpDownloader.java
@@ -63,7 +63,7 @@
   }
 
   File downloadFile(URI fileURI, File toFile, String login, String password) {
-    LOG.error("Download " + fileURI + " in " + toFile);
+    LOG.info("Download " + fileURI + " in " + toFile);
     DefaultHttpClient client = new DefaultHttpClient();
     try {
       if (StringUtils.isNotBlank(login)) {
