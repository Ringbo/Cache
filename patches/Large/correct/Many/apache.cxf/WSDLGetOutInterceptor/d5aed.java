diff --git a/rt/frontend/simple/src/main/java/org/apache/cxf/frontend/WSDLGetOutInterceptor.java b/rt/frontend/simple/src/main/java/org/apache/cxf/frontend/WSDLGetOutInterceptor.java
index 07f835f..cbd9b71 100644
--- a/rt/frontend/simple/src/main/java/org/apache/cxf/frontend/WSDLGetOutInterceptor.java
+++ b/rt/frontend/simple/src/main/java/org/apache/cxf/frontend/WSDLGetOutInterceptor.java
@@ -53,10 +53,11 @@
         }
         message.put(Message.CONTENT_TYPE, "text/xml");
         try {
-            StaxUtils.writeDocument(doc, writer, true,
+            StaxUtils.writeDocument(doc, writer,
                                     !MessageUtils.getContextualBoolean(message, 
                                                                        StaxOutInterceptor.FORCE_START_DOCUMENT, 
-                                                                       false));
+                                                                       false),
+                                    true);
         } catch (XMLStreamException e) {
             throw new Fault(e);
         }
