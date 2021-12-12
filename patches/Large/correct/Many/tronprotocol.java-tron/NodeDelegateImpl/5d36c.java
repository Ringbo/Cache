diff --git a/src/main/java/org/tron/core/net/node/NodeDelegateImpl.java b/src/main/java/org/tron/core/net/node/NodeDelegateImpl.java
index 0958fa8..6d8ab2a 100755
--- a/src/main/java/org/tron/core/net/node/NodeDelegateImpl.java
+++ b/src/main/java/org/tron/core/net/node/NodeDelegateImpl.java
@@ -102,9 +102,10 @@
 
     if (blockChainSummary.isEmpty() ||
         (blockChainSummary.size() == 1
-        && blockChainSummary.get(0).equals(dbManager.getHeadBlockId()))) {
+        && blockChainSummary.get(0).equals(dbManager.getGenesisBlockId()))) {
       unForkedBlockId = dbManager.getGenesisBlockId();
-    } else if (blockChainSummary.size() == 1) {
+    } else if (blockChainSummary.size() == 1
+        && blockChainSummary.get(0).getNum() == 0) {
      return new LinkedList<BlockId>(){{
         add(dbManager.getGenesisBlockId());
       }};
