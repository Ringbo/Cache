diff --git a/plugins/netty/src/main/java/com/navercorp/pinpoint/plugin/netty/NettyPlugin.java b/plugins/netty/src/main/java/com/navercorp/pinpoint/plugin/netty/NettyPlugin.java
index 26354ca..7503dcd 100644
--- a/plugins/netty/src/main/java/com/navercorp/pinpoint/plugin/netty/NettyPlugin.java
+++ b/plugins/netty/src/main/java/com/navercorp/pinpoint/plugin/netty/NettyPlugin.java
@@ -114,7 +114,7 @@
 
             final InstrumentMethod writeMethod2 = InstrumentUtils.findMethod(target, "write", "java.lang.Object", "io.netty.channel.ChannelPromise");
             if (writeMethod2 != null) {
-                writeMethod1.addScopedInterceptor(NettyConstants.INTERCEPTOR_CHANNEL_PIPELINE_WRITE, NettyConstants.SCOPE_WRITE, ExecutionPolicy.BOUNDARY);
+                writeMethod2.addScopedInterceptor(NettyConstants.INTERCEPTOR_CHANNEL_PIPELINE_WRITE, NettyConstants.SCOPE_WRITE, ExecutionPolicy.BOUNDARY);
             }
 
             final InstrumentMethod writeAndFlushMethod1 = InstrumentUtils.findMethod(target, "writeAndFlush", "java.lang.Object");
@@ -168,7 +168,7 @@
 
             final InstrumentMethod addListenerMethod2 = InstrumentUtils.findMethod(target, "addListeners", "io.netty.util.concurrent.GenericFutureListener[]");
             if (addListenerMethod2 != null) {
-                addListenerMethod1.addScopedInterceptor(NettyConstants.INTERCEPTOR_CHANNEL_PROMISE_ADD_LISTENER, NettyConstants.SCOPE, ExecutionPolicy.BOUNDARY);
+                addListenerMethod2.addScopedInterceptor(NettyConstants.INTERCEPTOR_CHANNEL_PROMISE_ADD_LISTENER, NettyConstants.SCOPE, ExecutionPolicy.BOUNDARY);
             }
 
             return target.toBytecode();
