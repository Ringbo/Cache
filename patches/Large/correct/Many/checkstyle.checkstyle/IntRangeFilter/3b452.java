diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntRangeFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntRangeFilter.java
index ee52398..d024171 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntRangeFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntRangeFilter.java
@@ -38,7 +38,7 @@
      * @param lowerBound the lower bound of the range.
      * @param upperBound the upper bound of the range.
      */
-    public IntRangeFilter(int lowerBound, int upperBound) {
+    IntRangeFilter(int lowerBound, int upperBound) {
         this.lowerBound = lowerBound;
         this.upperBound = upperBound;
     }
