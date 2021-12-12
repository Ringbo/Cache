diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index 421ad83..dfc12a3 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -208,7 +208,7 @@
             if (asyncHttpProviderConfig.getProperty(NettyAsyncHttpProviderConfig.EXECUTE_ASYNC_CONNECT) != null) {
                 executeConnectAsync = true;
             } else if (asyncHttpProviderConfig.getProperty(NettyAsyncHttpProviderConfig.DISABLE_NESTED_REQUEST) != null) {
-                DefaultChannelFuture.setUseDeadLockChecker(false);
+                DefaultChannelFuture.setUseDeadLockChecker(true);
             }
         }
     }
