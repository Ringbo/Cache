diff --git a/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/DefaultRowUpdaterTest.java b/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/DefaultRowUpdaterTest.java
index 13dd1a1..88bdf4d 100644
--- a/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/DefaultRowUpdaterTest.java
+++ b/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/DefaultRowUpdaterTest.java
@@ -95,7 +95,7 @@
 
   @Test
   public void testUpdateIntDenseToIntSparse() throws Exception {
-    ServerSparseIntRow serverSparseIntRow = new ServerSparseIntRow(rowId, startCol, endCol);
+    ServerSparseIntRow serverSparseIntRow = new ServerSparseIntRow(rowId, startCol, endCol, 0);
     ByteBuf buf = Unpooled.buffer(16);
     buf.writeInt(3);
     buf.writeInt(0);
@@ -111,7 +111,7 @@
 
   @Test
   public void testUpdateIntSparseToIntSparse() throws Exception {
-    ServerSparseIntRow serverSparseIntRow = new ServerSparseIntRow(rowId, startCol, endCol);
+    ServerSparseIntRow serverSparseIntRow = new ServerSparseIntRow(rowId, startCol, endCol, 0);
     ByteBuf buf = Unpooled.buffer(16);
     buf.writeInt(3);
     buf.writeInt(0);
@@ -162,7 +162,7 @@
   @Test
   public void testUpdateDoubleDenseToDoubleSparse() throws Exception {
     ServerSparseDoubleRow serverSparseDoubleRow =
-        new ServerSparseDoubleRow(rowId, startCol, endCol);
+        new ServerSparseDoubleRow(rowId, startCol, endCol, 0);
     ByteBuf buf = Unpooled.buffer(16);
     buf.writeInt(3);
     buf.writeDouble(0.00);
@@ -179,7 +179,7 @@
   @Test
   public void testUpdateDoubleSparseToDoubleSparse() throws Exception {
     ServerSparseDoubleRow serverSparseDoubleRow =
-        new ServerSparseDoubleRow(rowId, startCol, endCol);
+        new ServerSparseDoubleRow(rowId, startCol, endCol, 0);
     ByteBuf buf = Unpooled.buffer(16);
     buf.writeInt(3);
     buf.writeInt(0);
