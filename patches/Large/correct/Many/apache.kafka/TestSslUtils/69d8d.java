diff --git a/clients/src/test/java/org/apache/kafka/test/TestSslUtils.java b/clients/src/test/java/org/apache/kafka/test/TestSslUtils.java
index 90b6d8d..b2de0e6 100644
--- a/clients/src/test/java/org/apache/kafka/test/TestSslUtils.java
+++ b/clients/src/test/java/org/apache/kafka/test/TestSslUtils.java
@@ -89,7 +89,7 @@
 
     public static KeyPair generateKeyPair(String algorithm) throws NoSuchAlgorithmException {
         KeyPairGenerator keyGen = KeyPairGenerator.getInstance(algorithm);
-        keyGen.initialize(1024);
+        keyGen.initialize(2048);
         return keyGen.genKeyPair();
     }
 
