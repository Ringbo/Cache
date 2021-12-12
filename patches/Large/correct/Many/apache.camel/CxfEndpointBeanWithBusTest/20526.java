diff --git a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanWithBusTest.java b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanWithBusTest.java
index 7805489..d18af27 100644
--- a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanWithBusTest.java
+++ b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanWithBusTest.java
@@ -43,7 +43,9 @@
         CxfEndpoint endpoint = (CxfEndpoint)camelContext.getEndpoint("cxf:bean:routerEndpoint");
         
         // verify the interceptor that is added by the logging feature
-        assertTrue(endpoint.getBus().getInInterceptors().size() == 1);
+        // Spring 3.0.0 has an issue of SPR-6589 which will call the BusApplicationListener twice for the same event,
+        // so we will get more one InInterceptors here
+        assertTrue(endpoint.getBus().getInInterceptors().size() >= 1);
         assertEquals(LoggingInInterceptor.class, endpoint.getBus().getInInterceptors().get(0).getClass());
     }
 
