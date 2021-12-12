diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java
index 825d9b1..a3029f8 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java
@@ -657,7 +657,7 @@
     }
 
     @Override
-    public Cell deepClone() {
+    public ExtendedCell deepClone() {
       Cell clonedBaseCell = ((ExtendedCell) this.cell).deepClone();
       return new TagRewriteCell(clonedBaseCell, this.tags);
     }
@@ -838,7 +838,7 @@
     }
 
     @Override
-    public Cell deepClone() {
+    public ExtendedCell deepClone() {
       Cell clonedBaseCell = ((ExtendedCell) this.cell).deepClone();
       if (clonedBaseCell instanceof ByteBufferCell) {
         return new TagRewriteByteBufferCell((ByteBufferCell) clonedBaseCell, this.tags);
@@ -981,7 +981,7 @@
     }
 
     @Override
-    public Cell deepClone() {
+    public ExtendedCell deepClone() {
       Cell clonedBaseCell = ((ExtendedCell) this.cell).deepClone();
       return new ValueAndTagRewriteCell(clonedBaseCell, this.value, this.tags);
     }
@@ -1047,7 +1047,7 @@
     }
 
     @Override
-    public Cell deepClone() {
+    public ExtendedCell deepClone() {
       Cell clonedBaseCell = ((ExtendedCell) this.cell).deepClone();
       if (clonedBaseCell instanceof ByteBufferCell) {
         return new ValueAndTagRewriteByteBufferCell((ByteBufferCell) clonedBaseCell, this.value,
