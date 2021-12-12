diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index b32a135..7852fdf 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -164,7 +164,7 @@
 
     private final NettyAsyncHttpProviderConfig asyncHttpProviderConfig;
 
-    private boolean executeConnectAsync = false;
+    private boolean executeConnectAsync = true;
 
     public static final ThreadLocal<Boolean> IN_IO_THREAD = new ThreadLocalBoolean();
 
