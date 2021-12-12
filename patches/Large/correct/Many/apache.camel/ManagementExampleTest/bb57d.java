diff --git a/examples/camel-example-management/src/test/java/org/apache/camel/example/management/ManagementExampleTest.java b/examples/camel-example-management/src/test/java/org/apache/camel/example/management/ManagementExampleTest.java
index 666d56b..2b3893f 100644
--- a/examples/camel-example-management/src/test/java/org/apache/camel/example/management/ManagementExampleTest.java
+++ b/examples/camel-example-management/src/test/java/org/apache/camel/example/management/ManagementExampleTest.java
@@ -43,8 +43,8 @@
 
         // Find the endpoints
         Set<ObjectName> set = mbeanServer.queryNames(new ObjectName("*:type=endpoints,*"), null);
-        // now there is no managed endpoint for the bean
-        assertEquals(6, set.size()); 
+        // now there is no managed endpoint for the dead queue
+        assertEquals(5, set.size()); 
         
         // Find the routes
         set = mbeanServer.queryNames(new ObjectName("*:type=routes,*"), null);
