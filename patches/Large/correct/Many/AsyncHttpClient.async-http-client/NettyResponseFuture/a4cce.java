diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyResponseFuture.java b/src/main/java/com/ning/http/client/providers/netty/NettyResponseFuture.java
index 088b498..c9859e9 100755
--- a/src/main/java/com/ning/http/client/providers/netty/NettyResponseFuture.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyResponseFuture.java
@@ -68,7 +68,7 @@
     private HttpResponse httpResponse;
     private final AtomicReference<ExecutionException> exEx = new AtomicReference<ExecutionException>();
     private final AtomicInteger redirectCount = new AtomicInteger();
-    private Future<?> reaperFuture;
+    private volatile Future<?> reaperFuture;
     private final AtomicBoolean inAuth = new AtomicBoolean(false);
     private final AtomicBoolean statusReceived = new AtomicBoolean(false);
     private final AtomicLong touch = new AtomicLong(System.currentTimeMillis());
