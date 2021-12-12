diff --git a/robospice/src/com/octo/android/robospice/request/CachedSpiceRequest.java b/robospice/src/com/octo/android/robospice/request/CachedSpiceRequest.java
index 1244c8c..d755ee1 100644
--- a/robospice/src/com/octo/android/robospice/request/CachedSpiceRequest.java
+++ b/robospice/src/com/octo/android/robospice/request/CachedSpiceRequest.java
@@ -10,12 +10,12 @@
 
 public class CachedSpiceRequest< RESULT > extends SpiceRequest< RESULT > {
 
-    private String requestCacheKey = UUID.randomUUID().toString();
+    private Object requestCacheKey = UUID.randomUUID().toString();
     private long cacheDuration;
     private SpiceRequest< RESULT > spiceRequest;
     private boolean isProcessable = true;
 
-    public CachedSpiceRequest( SpiceRequest< RESULT > contentRequest, String requestCacheKey, long cacheDuration ) {
+    public CachedSpiceRequest( SpiceRequest< RESULT > contentRequest, Object requestCacheKey, long cacheDuration ) {
         super( contentRequest.getResultType() );
         this.requestCacheKey = requestCacheKey;
         this.cacheDuration = cacheDuration;
@@ -86,7 +86,7 @@
         spiceRequest.publishProgress( progress );
     }
 
-    public String getRequestCacheKey() {
+    public Object getRequestCacheKey() {
         return requestCacheKey;
     }
 
