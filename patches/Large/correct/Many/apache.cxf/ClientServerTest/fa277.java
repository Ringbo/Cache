diff --git a/rt/frontend/simple/src/test/java/org/apache/cxf/frontend/spring/ClientServerTest.java b/rt/frontend/simple/src/test/java/org/apache/cxf/frontend/spring/ClientServerTest.java
index 7ba8938..e635639 100644
--- a/rt/frontend/simple/src/test/java/org/apache/cxf/frontend/spring/ClientServerTest.java
+++ b/rt/frontend/simple/src/test/java/org/apache/cxf/frontend/spring/ClientServerTest.java
@@ -47,7 +47,7 @@
         assertNotNull(greeter);
         
         String result = greeter.sayHello();
-        assertEquals("We get the wrong sayHello result", result, "hello");
+        assertEquals("We get the wrong sayHello result", "hello", result);
         
         
         Client c = ClientProxy.getClient(greeter);
