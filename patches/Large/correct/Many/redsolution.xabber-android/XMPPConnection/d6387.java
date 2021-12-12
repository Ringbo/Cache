diff --git a/app/src/main/java/org/jivesoftware/smack/XMPPConnection.java b/app/src/main/java/org/jivesoftware/smack/XMPPConnection.java
index fe9da08..35719ff 100644
--- a/app/src/main/java/org/jivesoftware/smack/XMPPConnection.java
+++ b/app/src/main/java/org/jivesoftware/smack/XMPPConnection.java
@@ -848,7 +848,7 @@
                 throw new IllegalStateException();
             context.init(kms, new TrustManager[]{new XMPPTrustManager(
                     KeyStoreManager.getOrCreateKeyStore(config),
-                    getServiceName(), config.getCertificateListener(),
+                    getHost(), config.getCertificateListener(),
                     chainCheck, domainCheck, allowSelfSigned)}, SECURE_RANDOM);
         }
         Socket plain = socket;
