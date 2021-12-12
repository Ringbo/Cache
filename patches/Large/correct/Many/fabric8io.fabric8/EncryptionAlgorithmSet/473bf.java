diff --git a/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionAlgorithmSet.java b/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionAlgorithmSet.java
index 3d2cf6d..c23886d 100644
--- a/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionAlgorithmSet.java
+++ b/fabric/fabric-commands/src/main/java/io/fabric8/commands/EncryptionAlgorithmSet.java
@@ -32,7 +32,7 @@
 
     @Override
     protected Object doExecute() throws Exception {
-        if (!Strings.isNotBlank(newAlgorithm)) {
+        if (Strings.isNotBlank(newAlgorithm)) {
             setData(getCurator(), ZkPath.AUTHENTICATION_CRYPT_ALGORITHM.getPath(), newAlgorithm);
         }
         return null;
