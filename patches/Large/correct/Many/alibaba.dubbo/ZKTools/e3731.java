diff --git a/dubbo-registry/dubbo-registry-api/src/test/java/org/apache/dubbo/registry/ZKTools.java b/dubbo-registry/dubbo-registry-api/src/test/java/org/apache/dubbo/registry/ZKTools.java
index 1072e31..e310349 100644
--- a/dubbo-registry/dubbo-registry-api/src/test/java/org/apache/dubbo/registry/ZKTools.java
+++ b/dubbo-registry/dubbo-registry-api/src/test/java/org/apache/dubbo/registry/ZKTools.java
@@ -43,7 +43,7 @@
                 new ExponentialBackoffRetry(1000, 3));
         client.start();
 
-        testConsumerConfig();
+        testProviderConfig();
 //        testPathCache();
 //        testTreeCache();
 //        testCuratorListener();
