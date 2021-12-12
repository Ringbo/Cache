diff --git a/angel-ps/core/src/main/java/com/tencent/angel/ml/math/vector/SparseLongKeyDoubleVector.java b/angel-ps/core/src/main/java/com/tencent/angel/ml/math/vector/SparseLongKeyDoubleVector.java
index 699b3ad..b594532 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/ml/math/vector/SparseLongKeyDoubleVector.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/ml/math/vector/SparseLongKeyDoubleVector.java
@@ -527,7 +527,7 @@
     ObjectIterator<Long2DoubleMap.Entry> iter =
       indexToValueMap.long2DoubleEntrySet().fastIterator();
     while (iter.hasNext()) {
-      if(iter.next().getDoubleValue() > 0.0)
+      if(iter.next().getDoubleValue() != 0.0)
         counter++;
     }
 
