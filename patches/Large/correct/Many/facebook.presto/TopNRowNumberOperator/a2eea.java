diff --git a/presto-main/src/main/java/com/facebook/presto/operator/TopNRowNumberOperator.java b/presto-main/src/main/java/com/facebook/presto/operator/TopNRowNumberOperator.java
index 03e746e..a91aed7 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/TopNRowNumberOperator.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/TopNRowNumberOperator.java
@@ -315,7 +315,7 @@
                 pageBuilder.declarePosition();
                 for (int i = 0; i < outputChannels.length; i++) {
                     int channel = outputChannels[i];
-                    Type type = types.get(channel);
+                    Type type = types.get(i);
                     type.appendTo(next[channel], 0, pageBuilder.getBlockBuilder(i));
                 }
                 if (generateRowNumber) {
