diff --git a/platform/core-impl/src/com/intellij/openapi/editor/ex/util/SegmentArrayWithData.java b/platform/core-impl/src/com/intellij/openapi/editor/ex/util/SegmentArrayWithData.java
index 8463c49..27f65f9 100644
--- a/platform/core-impl/src/com/intellij/openapi/editor/ex/util/SegmentArrayWithData.java
+++ b/platform/core-impl/src/com/intellij/openapi/editor/ex/util/SegmentArrayWithData.java
@@ -31,7 +31,7 @@
   }
 
   public void setElementAt(int i, int startOffset, int endOffset, int data) {
-    if (data < 0 && data > Short.MAX_VALUE) throw new IndexOutOfBoundsException("data out of short range" + data);
+    if (data < 0 || data > Short.MAX_VALUE) throw new IndexOutOfBoundsException("data out of short range" + data);
     setElementAt(i, startOffset, endOffset);
     myData = reallocateArray(myData, i+1);
     myData[i] = (short)data;
