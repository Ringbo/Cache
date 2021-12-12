diff --git a/drools-core/src/main/java/org/drools/core/util/KeyStoreHelper.java b/drools-core/src/main/java/org/drools/core/util/KeyStoreHelper.java
index 6f25957..dd0e4be 100755
--- a/drools-core/src/main/java/org/drools/core/util/KeyStoreHelper.java
+++ b/drools-core/src/main/java/org/drools/core/util/KeyStoreHelper.java
@@ -168,7 +168,7 @@
                                                                  NoSuchAlgorithmException,
                                                                  InvalidKeyException,
                                                                  SignatureException {
-        if( pvtKeyStore == null ) {
+        if( pubKeyStore == null ) {
             throw new RuntimeDroolsException( "Key store with public key not configured. Please configure it properly before using signed serialization." );
         }
         Certificate cert = pubKeyStore.getCertificate( publicKeyAlias );
