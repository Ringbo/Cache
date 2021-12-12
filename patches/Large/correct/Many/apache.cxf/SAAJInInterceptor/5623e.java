diff --git a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/saaj/SAAJInInterceptor.java b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/saaj/SAAJInInterceptor.java
index 11aed1e..335eeb4 100644
--- a/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/saaj/SAAJInInterceptor.java
+++ b/rt/bindings/soap/src/main/java/org/apache/cxf/binding/soap/saaj/SAAJInInterceptor.java
@@ -127,7 +127,8 @@
                 if (fault.getRole() != null) {
                     soapFault.setFaultActor(fault.getRole());
                 }
-                if (fault.getDetail() != null) {
+                if (fault.getDetail() != null
+                    && fault.getDetail().getFirstChild() != null) {
                     soapFault.addDetail().appendChild(
                         soapMessage.getSOAPPart().importNode(
                             fault.getDetail().getFirstChild(), true));
