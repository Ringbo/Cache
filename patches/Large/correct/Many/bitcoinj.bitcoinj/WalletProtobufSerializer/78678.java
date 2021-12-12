diff --git a/core/src/main/java/com/google/bitcoin/store/WalletProtobufSerializer.java b/core/src/main/java/com/google/bitcoin/store/WalletProtobufSerializer.java
index 7dfbe52..15fce75 100644
--- a/core/src/main/java/com/google/bitcoin/store/WalletProtobufSerializer.java
+++ b/core/src/main/java/com/google/bitcoin/store/WalletProtobufSerializer.java
@@ -403,7 +403,7 @@
             confidence.setDepthInBlocks(confidenceProto.getDepth());
         } else {
             // TEMPORARY CODE FOR MIGRATING 0.5 WALLETS TO 0.6
-            if (chainHeight != 0) {
+            if (chainHeight != 0 && confidenceProto.hasAppearedAtHeight()) {
                 confidence.setDepthInBlocks(chainHeight - confidence.getAppearedAtChainHeight() + 1);
             }
         }
