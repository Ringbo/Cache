diff --git a/benchmarks/src/main/java/okhttp3/benchmarks/NettyHttpClient.java b/benchmarks/src/main/java/okhttp3/benchmarks/NettyHttpClient.java
index 01e6f6e..cd7286d 100644
--- a/benchmarks/src/main/java/okhttp3/benchmarks/NettyHttpClient.java
+++ b/benchmarks/src/main/java/okhttp3/benchmarks/NettyHttpClient.java
@@ -137,7 +137,7 @@
     int total;
     long start;
 
-    public HttpChannel(SocketChannel channel) {
+    HttpChannel(SocketChannel channel) {
       this.channel = channel;
     }
 
