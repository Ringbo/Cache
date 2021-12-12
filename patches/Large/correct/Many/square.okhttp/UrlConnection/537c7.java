diff --git a/benchmarks/src/main/java/okhttp3/benchmarks/UrlConnection.java b/benchmarks/src/main/java/okhttp3/benchmarks/UrlConnection.java
index f75d160..560534c 100644
--- a/benchmarks/src/main/java/okhttp3/benchmarks/UrlConnection.java
+++ b/benchmarks/src/main/java/okhttp3/benchmarks/UrlConnection.java
@@ -52,7 +52,7 @@
   static class UrlConnectionRequest implements Runnable {
     private final HttpUrl url;
 
-    public UrlConnectionRequest(HttpUrl url) {
+    UrlConnectionRequest(HttpUrl url) {
       this.url = url;
     }
 
