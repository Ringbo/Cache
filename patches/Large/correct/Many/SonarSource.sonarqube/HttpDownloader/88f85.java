diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java b/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java
index 7b0e96a..3b8a6a9 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/utils/HttpDownloader.java
@@ -38,7 +38,7 @@
 import java.util.List;
 
 /**
- * This component downloads HTTP files. It currently does not reuse maven proxy configuration on the batch side.
+ * This component downloads HTTP files
  *
  * @since 2.2
  */
@@ -57,9 +57,9 @@
   }
 
   /**
-   * for unit tests
+   * Should be package protected for unit tests only, but public is still required for jacoco 0.2.
    */
-  HttpDownloader() {
+  public HttpDownloader() {
     this(new PropertiesConfiguration(), null);
   }
 
@@ -81,7 +81,7 @@
     this.userAgent = userAgent;
   }
 
-  public String getProxySynthesis(URI uri) {
+  public final String getProxySynthesis(URI uri) {
     return getProxySynthesis(uri, ProxySelector.getDefault());
   }
 
@@ -123,7 +123,7 @@
     }
   }
 
-  public void download(URI uri, File toFile) {
+  public final void download(URI uri, File toFile) {
     InputStream input = null;
     FileOutputStream output = null;
     try {
@@ -143,7 +143,7 @@
     }
   }
 
-  public byte[] download(URI uri) {
+  public final byte[] download(URI uri) {
     InputStream input = null;
     try {
       HttpURLConnection connection = newHttpConnection(uri);
@@ -158,7 +158,7 @@
     }
   }
 
-  public InputStream openStream(URI uri) {
+  public final InputStream openStream(URI uri) {
     try {
       HttpURLConnection connection = newHttpConnection(uri);
       return connection.getInputStream();
