diff --git a/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/router/file/FileRouterEngineTest.java b/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/router/file/FileRouterEngineTest.java
index 83a1424..95a50a0 100644
--- a/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/router/file/FileRouterEngineTest.java
+++ b/dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/router/file/FileRouterEngineTest.java
@@ -160,7 +160,7 @@
 
     private void initDic(URL url) {
         dic = new StaticDirectory<>(url, invokers);
-        dic.buildRouterChain(invokers);
+        dic.buildRouterChain();
         dic.getRouterChain().setResidentRouters(Arrays.asList(routerFactory.getRouter(url)));
     }
 
