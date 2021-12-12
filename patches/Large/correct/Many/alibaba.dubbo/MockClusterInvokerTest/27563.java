diff --git a/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/wrapper/MockClusterInvokerTest.java b/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/wrapper/MockClusterInvokerTest.java
index cf5c8a0..f305f91 100644
--- a/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/wrapper/MockClusterInvokerTest.java
+++ b/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/support/wrapper/MockClusterInvokerTest.java
@@ -652,7 +652,7 @@
         }
 
         StaticDirectory<IHelloService> dic = new StaticDirectory<IHelloService>(durl, invokers, null);
-        dic.buildRouterChain(invokers);
+        dic.buildRouterChain();
         AbstractClusterInvoker<IHelloService> cluster = new AbstractClusterInvoker(dic) {
             @Override
             protected Result doInvoke(Invocation invocation, List invokers, LoadBalance loadbalance)
