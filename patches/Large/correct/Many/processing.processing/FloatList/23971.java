diff --git a/core/src/processing/data/FloatList.java b/core/src/processing/data/FloatList.java
index dd050e1..0238fe7 100644
--- a/core/src/processing/data/FloatList.java
+++ b/core/src/processing/data/FloatList.java
@@ -300,7 +300,7 @@
 
 
   // same as splice
-  public void insert(int index, int[] values) {
+  public void insert(int index, float[] values) {
     if (index < 0) {
       throw new IllegalArgumentException("insert() index cannot be negative: it was " + index);
     }
@@ -328,7 +328,7 @@
   }
 
 
-  public void insert(int index, IntList list) {
+  public void insert(int index, FloatList list) {
     insert(index, list.values());
   }
 
