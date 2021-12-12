diff --git a/core/src/main/java/org/bitcoinj/core/Wallet.java b/core/src/main/java/org/bitcoinj/core/Wallet.java
index 61ab586..6c34019 100644
--- a/core/src/main/java/org/bitcoinj/core/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/core/Wallet.java
@@ -4459,13 +4459,13 @@
         checkState(keychainLock.isHeldByCurrentThread());
         List<Transaction> results = Lists.newLinkedList();
         // TODO: Handle chain replays here.
-        long keyRotationTimestamp = vKeyRotationTimestamp;
+        final long keyRotationTimestamp = vKeyRotationTimestamp;
         if (keyRotationTimestamp == 0) return results;  // Nothing to do.
 
         // We might have to create a new HD hierarchy if the previous ones are now rotating.
         boolean allChainsRotating = true;
         for (DeterministicKeyChain chain : keychain.getDeterministicKeyChains()) {
-            if (chain.getEarliestKeyCreationTime() >= vKeyRotationTimestamp) {
+            if (chain.getEarliestKeyCreationTime() >= keyRotationTimestamp) {
                 allChainsRotating = false;
                 break;
             }
