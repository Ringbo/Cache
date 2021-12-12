diff --git a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java
index e3a0164..6c8c433 100644
--- a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java
+++ b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/SoapBindingFactory.java
@@ -712,7 +712,7 @@
 
                 if (mpi != null) {
                     headerInfo.setPart(mpi);
-                    messageParts.remove(mpart);
+                    messageParts.remove(mpi);
                     bmsg.getMessageParts().remove(mpi);
                     bmsg.addExtensor(headerInfo);
                 }
