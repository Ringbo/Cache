diff --git a/components/camel-jaxb/src/main/java/org/apache/camel/converter/jaxb/JaxbDataFormat.java b/components/camel-jaxb/src/main/java/org/apache/camel/converter/jaxb/JaxbDataFormat.java
index b58ae57..7654c27 100644
--- a/components/camel-jaxb/src/main/java/org/apache/camel/converter/jaxb/JaxbDataFormat.java
+++ b/components/camel-jaxb/src/main/java/org/apache/camel/converter/jaxb/JaxbDataFormat.java
@@ -266,11 +266,11 @@
         try {
             Object answer;
 
-            XMLStreamReader xmlReader;
+            final XMLStreamReader xmlReader;
             if (needFiltering(exchange)) {
-                xmlReader = typeConverter.convertTo(XMLStreamReader.class, createNonXmlFilterReader(exchange, stream));
+                xmlReader = typeConverter.convertTo(XMLStreamReader.class, exchange, createNonXmlFilterReader(exchange, stream));
             } else {
-                xmlReader = typeConverter.convertTo(XMLStreamReader.class, stream);
+                xmlReader = typeConverter.convertTo(XMLStreamReader.class, exchange, stream);
             }
             String partClassFromHeader = exchange.getIn().getHeader(JaxbConstants.JAXB_PART_CLASS, String.class);
             if (partialClass != null || partClassFromHeader != null) {
