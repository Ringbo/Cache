diff --git a/microbench/src/main/java/io/netty/microbench/http2/Http2PriorityTreeBenchmark.java b/microbench/src/main/java/io/netty/microbench/http2/Http2PriorityTreeBenchmark.java
index ed1b6a6..722e48b 100644
--- a/microbench/src/main/java/io/netty/microbench/http2/Http2PriorityTreeBenchmark.java
+++ b/microbench/src/main/java/io/netty/microbench/http2/Http2PriorityTreeBenchmark.java
@@ -53,7 +53,7 @@
     public void setup() throws Http2Exception {
         connection = new DefaultHttp2Connection(false);
         for (int i = 0; i < numStreams; ++i) {
-            connection.local().createStream(toStreamId(i));
+            connection.local().createStream(toStreamId(i), false);
         }
     }
 
