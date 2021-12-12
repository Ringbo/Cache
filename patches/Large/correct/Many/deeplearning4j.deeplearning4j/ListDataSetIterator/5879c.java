diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/datasets/iterator/impl/ListDataSetIterator.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/datasets/iterator/impl/ListDataSetIterator.java
index e782747..741b620 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/datasets/iterator/impl/ListDataSetIterator.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/datasets/iterator/impl/ListDataSetIterator.java
@@ -32,16 +32,16 @@
  *
  * @author Adam Gibson
  */
-public class ListDataSetIterator implements DataSetIterator {
+public class ListDataSetIterator<T extends DataSet> implements DataSetIterator {
 
     private static final long serialVersionUID = -7569201667767185411L;
     private int curr = 0;
     private int batch = 10;
-    private List<DataSet> list;
+    private List<T> list;
     @Getter
     private DataSetPreProcessor preProcessor;
 
-    public ListDataSetIterator(Collection<DataSet> coll, int batch) {
+    public ListDataSetIterator(Collection<T> coll, int batch) {
         list = new ArrayList<>(coll);
         this.batch = batch;
 
@@ -52,7 +52,7 @@
      *
      * @param coll the collection to iterate over
      */
-    public ListDataSetIterator(Collection<DataSet> coll) {
+    public ListDataSetIterator(Collection<T> coll) {
         this(coll, 5);
 
     }
