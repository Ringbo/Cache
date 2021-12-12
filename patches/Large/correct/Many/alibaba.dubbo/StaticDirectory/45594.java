diff --git a/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/directory/StaticDirectory.java b/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/directory/StaticDirectory.java
index 4794b12..e35a404 100644
--- a/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/directory/StaticDirectory.java
+++ b/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/directory/StaticDirectory.java
@@ -85,9 +85,9 @@
         invokers.clear();
     }
 
-    public void buildRouterChain(List<Invoker<T>> groupInvokers) {
+    public void buildRouterChain() {
         RouterChain<T> routerChain = RouterChain.buildChain(getUrl());
-        routerChain.notifyFullInvokers(groupInvokers, getUrl());
+        routerChain.notifyFullInvokers(invokers, getUrl());
         this.setRouterChain(routerChain);
     }
 
