diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSupportingTokenPolicyValidator.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSupportingTokenPolicyValidator.java
index 0fd00a8..716d27b 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSupportingTokenPolicyValidator.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSupportingTokenPolicyValidator.java
@@ -539,7 +539,7 @@
                 CastUtils.cast((List<?>)signedResult.get(
                     WSSecurityEngineResult.TAG_DATA_REF_URIS
                 ));
-            if (sl != null && sl.size() == 1) {
+            if (sl != null && sl.size() >= 1) {
                 for (WSDataRef dataRef : sl) {
                     QName signedQName = dataRef.getName();
                     if (WSSecurityEngine.SIGNATURE.equals(signedQName)
