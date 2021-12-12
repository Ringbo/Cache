diff --git a/dubbo-rpc/dubbo-rpc-dubbo/src/main/java/org/apache/dubbo/rpc/protocol/dubbo/DubboInvoker.java b/dubbo-rpc/dubbo-rpc-dubbo/src/main/java/org/apache/dubbo/rpc/protocol/dubbo/DubboInvoker.java
index ece7149..3fed73f 100644
--- a/dubbo-rpc/dubbo-rpc-dubbo/src/main/java/org/apache/dubbo/rpc/protocol/dubbo/DubboInvoker.java
+++ b/dubbo-rpc/dubbo-rpc-dubbo/src/main/java/org/apache/dubbo/rpc/protocol/dubbo/DubboInvoker.java
@@ -87,7 +87,7 @@
         }
         try {
             boolean isOneway = RpcUtils.isOneway(getUrl(), invocation);
-            int timeout = getUrl().getMethodParameter(methodName, TIMEOUT_KEY, DEFAULT_TIMEOUT);
+            int timeout = getUrl().getMethodPositiveParameter(methodName, TIMEOUT_KEY, DEFAULT_TIMEOUT);
             if (isOneway) {
                 boolean isSent = getUrl().getMethodParameter(methodName, Constants.SENT_KEY, false);
                 currentClient.send(inv, isSent);
