diff --git a/src/org/zaproxy/zap/extension/dynssl/SslCertificateUtils.java b/src/org/zaproxy/zap/extension/dynssl/SslCertificateUtils.java
index d16e0a2..bdb7700 100644
--- a/src/org/zaproxy/zap/extension/dynssl/SslCertificateUtils.java
+++ b/src/org/zaproxy/zap/extension/dynssl/SslCertificateUtils.java
@@ -103,19 +103,15 @@
 		
 		KeyStore ks = null;
 		try {
-			certGen.addExtension(X509Extension.subjectKeyIdentifier, true, new SubjectKeyIdentifierStructure(pubKey));
+			certGen.addExtension(X509Extension.subjectKeyIdentifier, false, new SubjectKeyIdentifierStructure(pubKey));
 			certGen.addExtension(X509Extension.basicConstraints, true, new BasicConstraints(true));
 			certGen.addExtension(X509Extension.keyUsage, false, new KeyUsage(KeyUsage.keyCertSign | KeyUsage.digitalSignature | KeyUsage.keyEncipherment | KeyUsage.dataEncipherment | KeyUsage.cRLSign));
 			
-			// TODO check this works on all main browsers and platforms
-			// Start of changed section
-			//certGen.addExtension(X509Extension.extendedKeyUsage, false, new ExtendedKeyUsage(KeyPurposeId.anyExtendedKeyUsage));
 			Vector eku = new Vector(5, 1);
 			eku.add(KeyPurposeId.id_kp_serverAuth);
 			eku.add(KeyPurposeId.id_kp_clientAuth);
 			eku.add(KeyPurposeId.anyExtendedKeyUsage);
 			certGen.addExtension(X509Extension.extendedKeyUsage, false, new ExtendedKeyUsage(eku));
-			// End of changed section
 
 			final ContentSigner sigGen = new JcaContentSignerBuilder("SHA1WithRSAEncryption").setProvider("BC").build(privKey);
 			final X509Certificate cert = new JcaX509CertificateConverter().setProvider("BC").getCertificate(certGen.build(sigGen));
