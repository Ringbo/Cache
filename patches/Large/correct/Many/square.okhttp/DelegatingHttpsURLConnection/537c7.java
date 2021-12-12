diff --git a/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/DelegatingHttpsURLConnection.java b/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/DelegatingHttpsURLConnection.java
index 9dd7cfd..a051bf2 100644
--- a/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/DelegatingHttpsURLConnection.java
+++ b/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/DelegatingHttpsURLConnection.java
@@ -41,7 +41,7 @@
 abstract class DelegatingHttpsURLConnection extends HttpsURLConnection {
   private final HttpURLConnection delegate;
 
-  public DelegatingHttpsURLConnection(HttpURLConnection delegate) {
+  DelegatingHttpsURLConnection(HttpURLConnection delegate) {
     super(delegate.getURL());
     this.delegate = delegate;
   }
