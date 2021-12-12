diff --git a/rt/databinding/jaxb/src/test/java/org/apache/cxf/jaxb/JAXBEncoderDecoderTest.java b/rt/databinding/jaxb/src/test/java/org/apache/cxf/jaxb/JAXBEncoderDecoderTest.java
index 3cc4aee..4d6159f 100644
--- a/rt/databinding/jaxb/src/test/java/org/apache/cxf/jaxb/JAXBEncoderDecoderTest.java
+++ b/rt/databinding/jaxb/src/test/java/org/apache/cxf/jaxb/JAXBEncoderDecoderTest.java
@@ -455,8 +455,9 @@
         part.setElementQName(elName);
         part.setTypeClass(OrderException.class);
             
+        //just need a simple generic context to handle the exceptions internal primitives
         JAXBContext exceptionContext = JAXBContext.newInstance(new Class[] {
-            OrderException.class,
+            String.class,
         });
         JAXBEncoderDecoder.marshallException(exceptionContext.createMarshaller(), exception, part, elNode);
         
