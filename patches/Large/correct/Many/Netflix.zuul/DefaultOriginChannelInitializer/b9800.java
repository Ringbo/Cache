diff --git a/zuul-core/src/main/java/com/netflix/zuul/netty/connectionpool/DefaultOriginChannelInitializer.java b/zuul-core/src/main/java/com/netflix/zuul/netty/connectionpool/DefaultOriginChannelInitializer.java
index a22d878..4bf8ec3 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/netty/connectionpool/DefaultOriginChannelInitializer.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/netty/connectionpool/DefaultOriginChannelInitializer.java
@@ -63,7 +63,7 @@
                 false,
                 false
         ));
-        pipeline.addLast(new PassportStateHttpClientHandler());
+        pipeline.addLast(PassportStateHttpClientHandler.PASSPORT_STATE_HTTP_CLIENT_HANDLER_NAME, new PassportStateHttpClientHandler());
         pipeline.addLast("originNettyLogger", nettyLogger);
         pipeline.addLast(httpMetricsHandler);
         addMethodBindingHandler(pipeline);
