diff --git a/src/java/org/jivesoftware/util/CertificateManager.java b/src/java/org/jivesoftware/util/CertificateManager.java
index 2468b8c..7e3f688 100644
--- a/src/java/org/jivesoftware/util/CertificateManager.java
+++ b/src/java/org/jivesoftware/util/CertificateManager.java
@@ -990,8 +990,8 @@
      *
      * @param kp           KeyPair that keeps the public and private keys for the new certificate.
      * @param days       time to live
-     * @param issuerBuilder     Issuer CN builder
-     * @param subjectBuilder    Subject CN builder
+     * @param issuerBuilder     IssuerDN builder
+     * @param subjectBuilder    SubjectDN builder
      * @param domain       Domain of the server.
      * @param signAlgoritm Signature algorithm. This can be either a name or an OID.
      * @return X509 V3 Certificate
@@ -1010,7 +1010,7 @@
         BigInteger serial = (new java.math.BigInteger(serno)).abs();
 
         X500Name issuerDN = issuerBuilder.build();
-        X500Name subjectDN = issuerBuilder.build();
+        X500Name subjectDN = subjectBuilder.build();
 
         // builder
         JcaX509v3CertificateBuilder certBuilder = new JcaX509v3CertificateBuilder( //
