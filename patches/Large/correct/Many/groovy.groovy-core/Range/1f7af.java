diff --git a/src/main/groovy/lang/Range.java b/src/main/groovy/lang/Range.java
index d226173..e19ea1e 100644
--- a/src/main/groovy/lang/Range.java
+++ b/src/main/groovy/lang/Range.java
@@ -34,14 +34,14 @@
      *
      * @return the lower value in the range.
      */
-    Comparable getFrom();
+    T getFrom();
 
     /**
      * The upper value in the range.
      *
      * @return the upper value in the range
      */
-    Comparable getTo();
+    T getTo();
 
     /**
      * Indicates whether this is a reverse range which iterates backwards
