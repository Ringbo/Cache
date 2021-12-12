diff --git a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/StartBodyInterceptor.java b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/StartBodyInterceptor.java
index f2083d4..04a402f 100644
--- a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/StartBodyInterceptor.java
+++ b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/interceptor/StartBodyInterceptor.java
@@ -62,7 +62,8 @@
                 i = xmlReader.next();
             }
         } catch (XMLStreamException e) {
-            throw new SoapFault(new Message("XML_STREAM_EXC", LOG), e, message.getVersion().getSender());
+            throw new SoapFault(new Message("XML_STREAM_EXC", LOG, e.getMessage()), e, 
+                                message.getVersion().getSender());
         }
 
     }
