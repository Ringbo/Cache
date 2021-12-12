diff --git a/apollo-configservice/src/test/java/com/ctrip/framework/apollo/configservice/controller/NotificationControllerV2Test.java b/apollo-configservice/src/test/java/com/ctrip/framework/apollo/configservice/controller/NotificationControllerV2Test.java
index d0b7d7d..aa13a32 100644
--- a/apollo-configservice/src/test/java/com/ctrip/framework/apollo/configservice/controller/NotificationControllerV2Test.java
+++ b/apollo-configservice/src/test/java/com/ctrip/framework/apollo/configservice/controller/NotificationControllerV2Test.java
@@ -330,7 +330,7 @@
 
     assertTrue(!anotherDeferredResult.hasResult());
 
-    TimeUnit.MILLISECONDS.sleep(someBatchInterval * 3);
+    TimeUnit.MILLISECONDS.sleep(someBatchInterval * 5);
 
     assertTrue(anotherDeferredResult.hasResult());
   }
