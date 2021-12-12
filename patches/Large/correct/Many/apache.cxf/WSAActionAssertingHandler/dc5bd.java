diff --git a/rt/ws/eventing/src/test/java/org/apache/cxf/ws/eventing/integration/notificationapi/assertions/WSAActionAssertingHandler.java b/rt/ws/eventing/src/test/java/org/apache/cxf/ws/eventing/integration/notificationapi/assertions/WSAActionAssertingHandler.java
index 7f30de0..5ae2ad7 100644
--- a/rt/ws/eventing/src/test/java/org/apache/cxf/ws/eventing/integration/notificationapi/assertions/WSAActionAssertingHandler.java
+++ b/rt/ws/eventing/src/test/java/org/apache/cxf/ws/eventing/integration/notificationapi/assertions/WSAActionAssertingHandler.java
@@ -61,7 +61,7 @@
         try {
             Element elm = DOMUtils.getFirstElement(context.getMessage().getSOAPHeader());
             while (elm != null) {
-                if (elm.getTagName().equals("Action") && elm.getNamespaceURI().contains("addressing")) {
+                if (elm.getLocalName().equals("Action") && elm.getNamespaceURI().contains("addressing")) {
                     if (!elm.getTextContent().equals(action)) {
                         throw new RuntimeException("The event sink should have received "
                                 + "WSA-Action: " + action + " but received: "
