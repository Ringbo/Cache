diff --git a/samples/guide/src/main/java/okhttp3/recipes/Progress.java b/samples/guide/src/main/java/okhttp3/recipes/Progress.java
index f04de79..3056690 100644
--- a/samples/guide/src/main/java/okhttp3/recipes/Progress.java
+++ b/samples/guide/src/main/java/okhttp3/recipes/Progress.java
@@ -72,7 +72,7 @@
     private final ProgressListener progressListener;
     private BufferedSource bufferedSource;
 
-    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
+    ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
       this.responseBody = responseBody;
       this.progressListener = progressListener;
     }
