diff --git a/core/src/main/java/org/bitcoinj/core/Wallet.java b/core/src/main/java/org/bitcoinj/core/Wallet.java
index 41ea194..14e558d 100644
--- a/core/src/main/java/org/bitcoinj/core/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/core/Wallet.java
@@ -648,11 +648,11 @@
 
     /** See {@link org.bitcoinj.wallet.DeterministicKeyChain#setLookaheadSize(int)} for more info on this. */
     public void setKeychainLookaheadSize(int lookaheadSize) {
-        lock.lock();
+        keychainLock.lock();
         try {
             keychain.setLookaheadSize(lookaheadSize);
         } finally {
-            lock.unlock();
+            keychainLock.unlock();
         }
     }
 
