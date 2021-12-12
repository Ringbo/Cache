diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java b/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java
index 3b8a6a9..c1c3beb 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java
@@ -81,7 +81,7 @@
     this.userAgent = userAgent;
   }
 
-  public final String getProxySynthesis(URI uri) {
+  public String getProxySynthesis(URI uri) {
     return getProxySynthesis(uri, ProxySelector.getDefault());
   }
 
@@ -123,7 +123,7 @@
     }
   }
 
-  public final void download(URI uri, File toFile) {
+  public void download(URI uri, File toFile) {
     InputStream input = null;
     FileOutputStream output = null;
     try {
@@ -143,7 +143,7 @@
     }
   }
 
-  public final byte[] download(URI uri) {
+  public byte[] download(URI uri) {
     InputStream input = null;
     try {
       HttpURLConnection connection = newHttpConnection(uri);
@@ -158,7 +158,7 @@
     }
   }
 
-  public final InputStream openStream(URI uri) {
+  public InputStream openStream(URI uri) {
     try {
       HttpURLConnection connection = newHttpConnection(uri);
       return connection.getInputStream();
