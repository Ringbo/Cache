diff --git a/benchmarks/src/main/java/okhttp3/benchmarks/ApacheHttpClient.java b/benchmarks/src/main/java/okhttp3/benchmarks/ApacheHttpClient.java
index a5c632f..2fffd7c 100644
--- a/benchmarks/src/main/java/okhttp3/benchmarks/ApacheHttpClient.java
+++ b/benchmarks/src/main/java/okhttp3/benchmarks/ApacheHttpClient.java
@@ -55,7 +55,7 @@
   class ApacheHttpClientRequest implements Runnable {
     private final HttpUrl url;
 
-    public ApacheHttpClientRequest(HttpUrl url) {
+    ApacheHttpClientRequest(HttpUrl url) {
       this.url = url;
     }
 
