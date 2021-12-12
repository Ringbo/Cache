diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/utils/GenericRowColumnDataFileReader.java b/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/utils/GenericRowColumnDataFileReader.java
index 467fb39..419b389 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/utils/GenericRowColumnDataFileReader.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/indexsegment/utils/GenericRowColumnDataFileReader.java
@@ -173,7 +173,7 @@
    * @return
    */
   public float getFloat(int row, int col) {
-    assert getColumnSizes()[col] == 8;
+    assert getColumnSizes()[col] == 4;
     int offset = computeOffset(row, col);
     return byteBuffer.getFloat(offset);
   }
