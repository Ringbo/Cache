diff --git a/camel-core/src/test/java/org/apache/camel/impl/MultipleLifecycleStrategyTest.java b/camel-core/src/test/java/org/apache/camel/impl/MultipleLifecycleStrategyTest.java
index b29ee07..b014bbf 100644
--- a/camel-core/src/test/java/org/apache/camel/impl/MultipleLifecycleStrategyTest.java
+++ b/camel-core/src/test/java/org/apache/camel/impl/MultipleLifecycleStrategyTest.java
@@ -51,7 +51,7 @@
         context.stop();
 
         List<String> expectedEvents = Arrays.asList("onThreadPoolAdd", "onContextStart", "onServiceAdd", "onServiceAdd", "onServiceAdd", "onServiceAdd", "onServiceAdd",
-             "onServiceAdd", "onServiceAdd", "onComponentAdd", "onEndpointAdd", "onComponentRemove", "onThreadPoolAdd", "onContextStop"); 
+             "onServiceAdd", "onServiceAdd", "onComponentAdd", "onEndpointAdd", "onComponentRemove", "onContextStop");
         
         assertEquals(expectedEvents, dummy1.getEvents());
         assertEquals(expectedEvents, dummy2.getEvents());
