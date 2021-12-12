diff --git a/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerPartitionTest.java b/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerPartitionTest.java
index 6417a6c..048d9e7 100644
--- a/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerPartitionTest.java
+++ b/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerPartitionTest.java
@@ -89,7 +89,7 @@
     endCol = 10;
     rowType = RowType.T_DOUBLE_DENSE;
     partitionKey = new PartitionKey(partitionId, matrixId, startRow, startCol, endRow, endCol);
-    serverPartition = new ServerPartition(partitionKey, rowType);
+    serverPartition = new ServerPartition(partitionKey, rowType, 0.0);
     serverPartition.init();
   }
 
@@ -192,7 +192,7 @@
     DataInputStream in = new DataInputStream(new FileInputStream("data"));
     PartitionKey partitionKeyNew = new PartitionKey(2, 1, 1, 2, 8, 10);
     ServerPartition serverPartitionNew =
-        new ServerPartition(partitionKeyNew, RowType.T_DOUBLE_DENSE);
+        new ServerPartition(partitionKeyNew, RowType.T_DOUBLE_DENSE, 0.0);
     serverPartitionNew.init();
     assertNotEquals(((ServerDenseDoubleRow) serverPartition.getRow(6)).getData(),
         ((ServerDenseDoubleRow) serverPartitionNew.getRow(6)).getData());
@@ -242,7 +242,7 @@
     serverPartition.serialize(buf);
     PartitionKey partitionKeyNew = new PartitionKey(2, 1, 1, 2, 8, 10);
     ServerPartition serverPartitionNew =
-        new ServerPartition(partitionKeyNew, RowType.T_DOUBLE_DENSE);
+        new ServerPartition(partitionKeyNew, RowType.T_DOUBLE_DENSE, 0.0);
     assertNotEquals(serverPartition.getPartitionKey().getPartitionId(),
         serverPartitionNew.getPartitionKey().getPartitionId());
     serverPartitionNew.deserialize(buf);
