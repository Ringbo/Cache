diff --git a/okhttp-android-support/src/main/java/okhttp3/internal/huc/JavaApiConverter.java b/okhttp-android-support/src/main/java/okhttp3/internal/huc/JavaApiConverter.java
index 350d549..1dec85c 100644
--- a/okhttp-android-support/src/main/java/okhttp3/internal/huc/JavaApiConverter.java
+++ b/okhttp-android-support/src/main/java/okhttp3/internal/huc/JavaApiConverter.java
@@ -568,7 +568,7 @@
     private final Request request;
     private final Response response;
 
-    public CacheHttpURLConnection(Response response) {
+    CacheHttpURLConnection(Response response) {
       super(response.request().url().url());
       this.request = response.request();
       this.response = response;
@@ -835,7 +835,7 @@
   private static final class CacheHttpsURLConnection extends DelegatingHttpsURLConnection {
     private final CacheHttpURLConnection delegate;
 
-    public CacheHttpsURLConnection(CacheHttpURLConnection delegate) {
+    CacheHttpsURLConnection(CacheHttpURLConnection delegate) {
       super(delegate);
       this.delegate = delegate;
     }
