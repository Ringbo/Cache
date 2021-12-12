diff --git a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java
index e48d695..249d632 100644
--- a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java
+++ b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java
@@ -632,7 +632,7 @@
                             bmsg.getMessageParts().remove(mpi);
                         } else if (SOAPBindingUtil.isSOAPBody(content)) {
                             SoapBody sb = SOAPBindingUtil.getSoapBody(content);
-                            if (sb.getParts().size() == 1) {
+                            if (sb.getParts() != null && sb.getParts().size() == 1) {
                                 partName = (String) sb.getParts().get(0);
                             }
 
