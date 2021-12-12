diff --git a/src/ch/csnc/extension/httpclient/SSLContextManager.java b/src/ch/csnc/extension/httpclient/SSLContextManager.java
index ac1df0a..cfdd9d7 100644
--- a/src/ch/csnc/extension/httpclient/SSLContextManager.java
+++ b/src/ch/csnc/extension/httpclient/SSLContextManager.java
@@ -338,7 +338,7 @@
         Security.addProvider(pkcs11);
 
 		// init the key store
-		KeyStore ks = KeyStore.getInstance("PKCS11");
+		KeyStore ks = KeyStore.getInstance("PKCS11", Security.getProvider(pkcs11.getName()));
 		ks.load(null, kspassword == null ? null : kspassword.toCharArray());
 		return addKeyStore(ks, "PKCS#11: " + name, ""); // do not store pin code
 	}
