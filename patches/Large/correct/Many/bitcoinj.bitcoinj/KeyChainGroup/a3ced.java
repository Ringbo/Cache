diff --git a/core/src/main/java/com/google/bitcoin/wallet/KeyChainGroup.java b/core/src/main/java/com/google/bitcoin/wallet/KeyChainGroup.java
index 00e243e..6c9a760 100644
--- a/core/src/main/java/com/google/bitcoin/wallet/KeyChainGroup.java
+++ b/core/src/main/java/com/google/bitcoin/wallet/KeyChainGroup.java
@@ -157,7 +157,7 @@
         marriedKeysScripts = new LinkedHashMap<ByteString, Script>();
         maybeLookaheadScripts();
 
-        if (!this.currentKeys.isEmpty()) {
+        if (!this.followingKeychains.isEmpty()) {
             DeterministicKey followedWatchKey = getActiveKeyChain().getWatchingKey();
             for (Map.Entry<KeyChain.KeyPurpose, DeterministicKey> entry : this.currentKeys.entrySet()) {
                 Address address = makeP2SHOutputScript(entry.getValue(), followedWatchKey).getToAddress(params);
