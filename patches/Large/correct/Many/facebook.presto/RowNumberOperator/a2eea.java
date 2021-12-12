diff --git a/presto-main/src/main/java/com/facebook/presto/operator/RowNumberOperator.java b/presto-main/src/main/java/com/facebook/presto/operator/RowNumberOperator.java
index e6a3436..771ffd8 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/RowNumberOperator.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/RowNumberOperator.java
@@ -275,7 +275,7 @@
             pageBuilder.declarePosition();
             for (int i = 0; i < outputChannels.length; i++) {
                 int channel = outputChannels[i];
-                Type type = types.get(channel);
+                Type type = types.get(i);
                 type.appendTo(inputPage.getBlock(channel), currentPosition, pageBuilder.getBlockBuilder(i));
             }
             BIGINT.writeLong(pageBuilder.getBlockBuilder(rowNumberChannel), rowCount + 1);
