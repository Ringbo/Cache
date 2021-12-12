diff --git a/src/main/groovy/lang/IntRange.java b/src/main/groovy/lang/IntRange.java
index 7044c09..18f01b1 100644
--- a/src/main/groovy/lang/IntRange.java
+++ b/src/main/groovy/lang/IntRange.java
@@ -39,7 +39,7 @@
     /**
      * Iterates through each number in an <code>IntRange</code>.
      */
-    private class IntRangeIterator implements Iterator {
+    private class IntRangeIterator implements Iterator<Integer> {
         /**
          * Counts from 0 up to size - 1.
          */
@@ -65,7 +65,7 @@
         /**
          * {@inheritDoc}
          */
-        public Object next() {
+        public Integer next() {
             if (index++ > 0) {
                 if (index > size) {
                     return null;
@@ -247,14 +247,14 @@
     /**
      * {@inheritDoc}
      */
-    public Iterator iterator() {
+    public Iterator<Integer> iterator() {
         return new IntRangeIterator();
     }
 
     /**
      * {@inheritDoc}
      */
-    public List subList(int fromIndex, int toIndex) {
+    public List<Integer> subList(int fromIndex, int toIndex) {
         if (fromIndex < 0) {
             throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
         }
