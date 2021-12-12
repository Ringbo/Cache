diff --git a/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java b/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java
index de62618..2b15095 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java
@@ -867,9 +867,10 @@
         if (!syncDone) {
 
             int expectedCount = 0;
-            if (sentHeaders.get(sentHeaders.size() - 1).getNumber() <= bestKnownBlock.getNumber()) {
+            if (sentHeaders.size() > 0 &&
+                    sentHeaders.get(sentHeaders.size() - 1).getNumber() <= bestKnownBlock.getNumber()) {
                 expectedCount = sentHeaders.size();
-            } else if (sentHeaders.get(0).getNumber() > bestKnownBlock.getNumber()) {
+            } else if (sentHeaders.size() > 0 && sentHeaders.get(0).getNumber() > bestKnownBlock.getNumber()) {
                 expectedCount = 0;
             } else {
                 for (int i = 0; i < sentHeaders.size(); i++)
