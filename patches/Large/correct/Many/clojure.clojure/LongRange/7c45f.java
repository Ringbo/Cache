diff --git a/src/jvm/clojure/lang/LongRange.java b/src/jvm/clojure/lang/LongRange.java
index 125fa45..c956157 100644
--- a/src/jvm/clojure/lang/LongRange.java
+++ b/src/jvm/clojure/lang/LongRange.java
@@ -156,9 +156,9 @@
 }
 
 public int absCount(long start, long end, long step) {
-    double c = (end - start) / step;
+    double c = (double) (end - start) / step;
     int ic = (int) c;
-    if(c < ic)
+    if(c > ic)
         return ic + 1;
     else
         return ic;
