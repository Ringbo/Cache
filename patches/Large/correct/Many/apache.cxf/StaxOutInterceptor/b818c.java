diff --git a/rt/core/src/main/java/org/apache/cxf/interceptor/StaxOutInterceptor.java b/rt/core/src/main/java/org/apache/cxf/interceptor/StaxOutInterceptor.java
index 156f84d..0875e48 100644
--- a/rt/core/src/main/java/org/apache/cxf/interceptor/StaxOutInterceptor.java
+++ b/rt/core/src/main/java/org/apache/cxf/interceptor/StaxOutInterceptor.java
@@ -59,15 +59,13 @@
         if (os == null || writer != null) {
             return;
         }
-        // assert os != null;
 
-        // TODO: where does encoding constant go?
         String encoding = getEncoding(message);
         
         try {
             writer = getXMLOutputFactory(message).createXMLStreamWriter(os, encoding);
             if (Boolean.TRUE.equals(message.getContextualProperty(FORCE_START_DOCUMENT))) {
-                writer.writeStartDocument(encoding);
+                writer.writeStartDocument(encoding, "1.0");
             }
         } catch (XMLStreamException e) {
             throw new Fault(new org.apache.cxf.common.i18n.Message("STREAM_CREATE_EXC", BUNDLE), e);
