diff --git a/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/xml/XmlEncInHandler.java b/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/xml/XmlEncInHandler.java
index 05c105c..85d8976 100644
--- a/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/xml/XmlEncInHandler.java
+++ b/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/xml/XmlEncInHandler.java
@@ -102,9 +102,9 @@
             throwFault("CipherValue element is not available", null);
         }
         
-        byte[] decrypedPayload = null;
+        byte[] decryptedPayload = null;
         try {
-            decrypedPayload = decryptPayload(symmetricKeyBytes, cipherValue.getTextContent().trim(),
+            decryptedPayload = decryptPayload(symmetricKeyBytes, cipherValue.getTextContent().trim(),
                                                 algorithm);
         } catch (Exception ex) {
             throwFault("Payload can not be decrypted", ex);
@@ -112,7 +112,7 @@
         
         Document payloadDoc = null;
         try {
-            payloadDoc = DOMUtils.readXml(new InputStreamReader(new ByteArrayInputStream(decrypedPayload),
+            payloadDoc = DOMUtils.readXml(new InputStreamReader(new ByteArrayInputStream(decryptedPayload),
                                                "UTF-8"));
         } catch (Exception ex) {
             throwFault("Payload document can not be created", ex);
