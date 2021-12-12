diff --git a/angel-ps/mllib/src/main/java/com/tencent/angel/ml/psf/compress/QuantifyFloatFunc.java b/angel-ps/mllib/src/main/java/com/tencent/angel/ml/psf/compress/QuantifyFloatFunc.java
index 8705066..42b06f9 100644
--- a/angel-ps/mllib/src/main/java/com/tencent/angel/ml/psf/compress/QuantifyFloatFunc.java
+++ b/angel-ps/mllib/src/main/java/com/tencent/angel/ml/psf/compress/QuantifyFloatFunc.java
@@ -63,7 +63,7 @@
 
   private void update(ServerRow row, float[] arraySlice) {
     switch (row.getRowType()) {
-      case T_DOUBLE_DENSE:
+      case T_FLOAT_DENSE:
         doUpdate((ServerIntFloatRow) row, arraySlice);
         return;
       default:
