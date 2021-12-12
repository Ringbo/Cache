diff --git a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/ReadHeadersInterceptor.java b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/ReadHeadersInterceptor.java
index 9d7862b..a0e9b65 100644
--- a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/ReadHeadersInterceptor.java
+++ b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/ReadHeadersInterceptor.java
@@ -250,7 +250,8 @@
                 }
             }
         } catch (XMLStreamException e) {
-            throw new SoapFault(new Message("XML_STREAM_EXC", LOG), e, message.getVersion().getSender());
+            throw new SoapFault(new Message("XML_STREAM_EXC", LOG, e.getMessage()), e, 
+                                message.getVersion().getSender());
         } finally {
             if (closeNeeded) {
                 StaxUtils.close(xmlReader);
