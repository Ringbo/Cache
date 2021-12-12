diff --git a/dubbo-cluster/src/main/java/com/alibaba/dubbo/rpc/cluster/support/wrapper/MockClusterInvoker.java b/dubbo-cluster/src/main/java/com/alibaba/dubbo/rpc/cluster/support/wrapper/MockClusterInvoker.java
index 0a038c7..0269c2b 100644
--- a/dubbo-cluster/src/main/java/com/alibaba/dubbo/rpc/cluster/support/wrapper/MockClusterInvoker.java
+++ b/dubbo-cluster/src/main/java/com/alibaba/dubbo/rpc/cluster/support/wrapper/MockClusterInvoker.java
@@ -83,7 +83,7 @@
                     throw e;
                 } else {
                     if (logger.isWarnEnabled()) {
-                        logger.info("fail-mock: " + invocation.getMethodName() + " fail-mock enabled , url : " + directory.getUrl(), e);
+                        logger.warn("fail-mock: " + invocation.getMethodName() + " fail-mock enabled , url : " + directory.getUrl(), e);
                     }
                     result = doMockInvoke(invocation, e);
                 }
