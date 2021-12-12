diff --git a/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsInOutTransferExchangeTest.java b/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsInOutTransferExchangeTest.java
index a67e390..e737922 100644
--- a/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsInOutTransferExchangeTest.java
+++ b/components/camel-jms/src/test/java/org/apache/camel/component/jms/JmsInOutTransferExchangeTest.java
@@ -78,7 +78,7 @@
         assertNotNull(transferMessage.getBody(SerializableRequestDto.class));
         assertNotNull(transferMessage.getHeader("requestObject", SerializableRequestDto.class));
         assertEquals(Boolean.TRUE, transferMessage.getHeader("boolean", Boolean.class));
-        assertEquals((Long) 123l, transferMessage.getHeader("long", Long.class));
+        assertEquals((Long) 123L, transferMessage.getHeader("long", Long.class));
         assertEquals((Double) 1.23, transferMessage.getHeader("double", Double.class));
         assertEquals("hello", transferMessage.getHeader("string", String.class));
         assertNotNull(transferExchange.getProperty("requestObjectProperty", SerializableRequestDto.class));
@@ -88,7 +88,7 @@
         assertNotNull(resultMessage.getBody(SerializableResponseDto.class));
         assertNotNull(resultMessage.getHeader("requestObject", SerializableRequestDto.class));
         assertEquals(Boolean.TRUE, resultMessage.getHeader("boolean", Boolean.class));
-        assertEquals((Long) 123l, resultMessage.getHeader("long", Long.class));
+        assertEquals((Long) 123L, resultMessage.getHeader("long", Long.class));
         assertEquals((Double) 1.23, resultMessage.getHeader("double", Double.class));
         assertEquals("hello", resultMessage.getHeader("string", String.class));
         assertNotNull(resultMessage.getHeader("responseHeader", SerializableResponseDto.class));
