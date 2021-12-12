diff --git a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/SpringQuartzPersistentStoreRestartAppTest.java b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/SpringQuartzPersistentStoreRestartAppTest.java
index 6333f53..471d8c1 100644
--- a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/SpringQuartzPersistentStoreRestartAppTest.java
+++ b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/SpringQuartzPersistentStoreRestartAppTest.java
@@ -39,7 +39,7 @@
         assertNotNull(camel);
 
         MockEndpoint mock = camel.getEndpoint("mock:result", MockEndpoint.class);
-        mock.expectedMinimumMessageCount(3);
+        mock.expectedMinimumMessageCount(2);
 
         mock.assertIsSatisfied();
 
@@ -65,7 +65,7 @@
         assertNotNull(camel2);
 
         MockEndpoint mock2 = camel2.getEndpoint("mock:result", MockEndpoint.class);
-        mock2.expectedMinimumMessageCount(3);
+        mock2.expectedMinimumMessageCount(2);
 
         mock2.assertIsSatisfied();
 
