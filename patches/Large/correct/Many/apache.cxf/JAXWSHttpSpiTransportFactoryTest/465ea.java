diff --git a/rt/frontend/jaxws/src/test/jaxws22/org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactoryTest.java b/rt/frontend/jaxws/src/test/jaxws22/org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactoryTest.java
index 5f2f1d3..cd825b8 100644
--- a/rt/frontend/jaxws/src/test/jaxws22/org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactoryTest.java
+++ b/rt/frontend/jaxws/src/test/jaxws22/org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactoryTest.java
@@ -43,7 +43,7 @@
         control = EasyMock.createNiceControl();
         context = control.createMock(HttpContext.class);
         bus = control.createMock(Bus.class);
-        factory = new JAXWSHttpSpiTransportFactory(bus, context);
+        factory = new JAXWSHttpSpiTransportFactory(context);
     }
     
     @After
@@ -70,7 +70,7 @@
         EndpointInfo endpoint = new EndpointInfo();
         endpoint.setAddress(endpointAddress);
         
-        Destination destination = factory.getDestination(endpoint);
+        Destination destination = factory.getDestination(endpoint, bus);
         assertNotNull(destination);
         assertNotNull(destination.getAddress());
         assertNotNull(destination.getAddress().getAddress());
