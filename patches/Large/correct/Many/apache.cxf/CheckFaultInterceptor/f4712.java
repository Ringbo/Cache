diff --git a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/CheckFaultInterceptor.java b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/CheckFaultInterceptor.java
index 001d1ca..44b444b 100644
--- a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/CheckFaultInterceptor.java
+++ b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/CheckFaultInterceptor.java
@@ -59,7 +59,7 @@
                 return;
             }
         } catch (XMLStreamException e) {
-            throw new SoapFault(new Message("XML_STREAM_EXC", LOG), e, 
+            throw new SoapFault(new Message("XML_STREAM_EXC", LOG, e.getMessage()), e, 
                                 message.getVersion().getSender());
         }
         if (message.getVersion().getFault().equals(xmlReader.getName()) && isRequestor(message)) {
