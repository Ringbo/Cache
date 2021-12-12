diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
index 0dff3ee..415f124 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
@@ -1995,7 +1995,7 @@
         dkSign.computeSignature(referenceList, false, null);
         
         if (isSigProtect) {
-            WSEncryptionPart part = new WSEncryptionPart(dkSign.getId(), "Element");
+            WSEncryptionPart part = new WSEncryptionPart(dkSign.getSignatureId(), "Element");
             encryptedTokensList.add(part);
         }
         
