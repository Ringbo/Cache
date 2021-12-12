diff --git a/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/AbstractClusterInvokerTest.java b/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/AbstractClusterInvokerTest.java
index 655e649..0cbe5a3 100644
--- a/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/AbstractClusterInvokerTest.java
+++ b/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/AbstractClusterInvokerTest.java
@@ -455,7 +455,7 @@
     }
 
     private void initDic() {
-        dic.buildRouterChain(invokers);
+        dic.buildRouterChain();
     }
 
     @Test()
