diff --git a/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionMasterPasswordSet.java b/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionMasterPasswordSet.java
index 7ff7c0a..18ba238 100644
--- a/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionMasterPasswordSet.java
+++ b/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionMasterPasswordSet.java
@@ -32,8 +32,7 @@
 
     @Override
     protected Object doExecute() throws Exception {
-        if (!Strings.isNotBlank(newPassword)) {
-
+        if (Strings.isNotBlank(newPassword)) {
             setData(getCurator(), ZkPath.AUTHENTICATION_CRYPT_PASSWORD.getPath(), newPassword);
         }
         return null;
