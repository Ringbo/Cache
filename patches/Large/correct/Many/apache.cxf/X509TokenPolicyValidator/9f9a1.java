diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/X509TokenPolicyValidator.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/X509TokenPolicyValidator.java
index 1117a2a..5dd4582 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/X509TokenPolicyValidator.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyvalidators/X509TokenPolicyValidator.java
@@ -94,8 +94,8 @@
         }
 
         String requiredType = X509_V3_VALUETYPE;
-        if (SPConstants.WSS_X509_PKI_PATH_V1_TOKEN10.equals(requiredType)
-            || SPConstants.WSS_X509_PKI_PATH_V1_TOKEN11.equals(requiredType)) {
+        if (SPConstants.WSS_X509_PKI_PATH_V1_TOKEN10.equals(requiredVersionAndType)
+            || SPConstants.WSS_X509_PKI_PATH_V1_TOKEN11.equals(requiredVersionAndType)) {
             requiredType = PKI_VALUETYPE;
         }
 
