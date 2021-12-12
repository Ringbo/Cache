diff --git a/components/camel-rmi/src/test/java/org/apache/camel/component/rmi/RmiRouteTest.java b/components/camel-rmi/src/test/java/org/apache/camel/component/rmi/RmiRouteTest.java
index da67a8f..07c9922 100644
--- a/components/camel-rmi/src/test/java/org/apache/camel/component/rmi/RmiRouteTest.java
+++ b/components/camel-rmi/src/test/java/org/apache/camel/component/rmi/RmiRouteTest.java
@@ -57,7 +57,7 @@
 
         // START SNIPPET: invoke
         Endpoint endpoint = camelContext.getEndpoint("direct:hello");
-        ISay proxy = ProxyHelper.createProxy(endpoint, ISay.class);
+        ISay proxy = ProxyHelper.createProxy(endpoint, false, ISay.class);
         String rc = proxy.say();
         assertEquals("Good Bye!", rc);
         // END SNIPPET: invoke
