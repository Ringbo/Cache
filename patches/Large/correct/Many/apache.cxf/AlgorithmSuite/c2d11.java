diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/model/AlgorithmSuite.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/model/AlgorithmSuite.java
index 3201033..09db6e4 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/model/AlgorithmSuite.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/model/AlgorithmSuite.java
@@ -510,7 +510,7 @@
             this.encryptionDerivedKeyLength = 128;
             this.signatureDerivedKeyLength = 128;
             this.minimumSymmetricKeyLength = 128;
-            this.maximumSymmetricKeyLength = 192;
+            this.maximumSymmetricKeyLength = 128;
         } else if (SPConstants.ALGO_SUITE_TRIPLE_DES_SHA256_RSA15.equals(algoSuite)) {
             this.digest = SPConstants.SHA256;
             this.encryption = SPConstants.TRIPLE_DES;
