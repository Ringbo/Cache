diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
index 415f124..1606d48 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder.java
@@ -2260,7 +2260,7 @@
         private final Object tokenImplementation;
         private final List<WSEncryptionPart> signedParts;
         
-        public SupportingToken(AbstractToken token, Object tokenImplementation,
+        SupportingToken(AbstractToken token, Object tokenImplementation,
                                List<WSEncryptionPart> signedParts) {
             this.token = token;
             this.tokenImplementation = tokenImplementation;
