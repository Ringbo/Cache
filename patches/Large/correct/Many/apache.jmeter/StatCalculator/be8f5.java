diff --git a/src/jorphan/org/apache/jorphan/math/StatCalculator.java b/src/jorphan/org/apache/jorphan/math/StatCalculator.java
index 48c6943..42e3954 100644
--- a/src/jorphan/org/apache/jorphan/math/StatCalculator.java
+++ b/src/jorphan/org/apache/jorphan/math/StatCalculator.java
@@ -86,7 +86,7 @@
         }
     }
 
-    public Number getMedian() {
+    public T getMedian() {
         if (count > 0) {
             return values.get((int) (values.size() * .5));
         }
