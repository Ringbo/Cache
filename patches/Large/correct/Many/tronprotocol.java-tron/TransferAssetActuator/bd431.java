diff --git a/src/main/java/org/tron/core/actuator/TransferAssetActuator.java b/src/main/java/org/tron/core/actuator/TransferAssetActuator.java
index 8eb01c8..7b40e33 100644
--- a/src/main/java/org/tron/core/actuator/TransferAssetActuator.java
+++ b/src/main/java/org/tron/core/actuator/TransferAssetActuator.java
@@ -86,8 +86,7 @@
       // if account with to_address is not existed,  create it.
       ByteString toAddress = transferAssetContract.getToAddress();
       if (!dbManager.getAccountStore().has(toAddress.toByteArray())) {
-        AccountCapsule account = new AccountCapsule(toAddress, null,
-            AccountType.Normal);
+        AccountCapsule account = new AccountCapsule(toAddress, AccountType.Normal);
         dbManager.getAccountStore().put(toAddress.toByteArray(), account);
       }
 
