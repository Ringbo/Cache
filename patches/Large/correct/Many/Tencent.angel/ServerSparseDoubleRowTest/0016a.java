diff --git a/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerSparseDoubleRowTest.java b/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerSparseDoubleRowTest.java
index b490598..d56a433 100644
--- a/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerSparseDoubleRowTest.java
+++ b/angel-ps/core/src/test/java/com/tencent/angel/ps/impl/matrix/ServerSparseDoubleRowTest.java
@@ -48,7 +48,7 @@
     rowId = 0;
     startCol = 0;
     endCol = 3;
-    serverSparseDoubleRow = new ServerSparseDoubleRow(rowId, startCol, endCol);
+    serverSparseDoubleRow = new ServerSparseDoubleRow(rowId, startCol, endCol, 0);
   }
 
   @After
@@ -91,7 +91,7 @@
     out.close();
     DataInputStream in = new DataInputStream(new FileInputStream("data"));
     ServerSparseDoubleRow newServerSparseDoubleRow =
-        new ServerSparseDoubleRow(rowId, startCol, endCol);
+        new ServerSparseDoubleRow(rowId, startCol, endCol, 0);
     newServerSparseDoubleRow.readFrom(in);
     in.close();
 
@@ -111,7 +111,7 @@
 
   @Test
   public void testUpdate() throws Exception {
-    serverSparseDoubleRow = new ServerSparseDoubleRow(rowId, startCol, endCol);
+    serverSparseDoubleRow = new ServerSparseDoubleRow(rowId, startCol, endCol, 0);
     ByteBuf buf = Unpooled.buffer(4 + 8 * 3);
     buf.writeInt(3);
     buf.writeDouble(0.00);
@@ -124,7 +124,7 @@
     assertEquals(serverSparseDoubleRow.getData().get(1), newValue1, 0.000);
     assertEquals(serverSparseDoubleRow.getData().get(2), -1, 0.000);
 
-    serverSparseDoubleRow = new ServerSparseDoubleRow(rowId, startCol, endCol);
+    serverSparseDoubleRow = new ServerSparseDoubleRow(rowId, startCol, endCol, 0);
     buf = Unpooled.buffer(4 + 2 * 12);
     buf.writeInt(2);
     LOG.info(buf);
