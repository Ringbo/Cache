diff --git a/src/main/groovy/lang/IntRange.java b/src/main/groovy/lang/IntRange.java
index 7e8e04d..3344580 100644
--- a/src/main/groovy/lang/IntRange.java
+++ b/src/main/groovy/lang/IntRange.java
@@ -184,14 +184,14 @@
     /**
      * {@inheritDoc}
      */
-    public Comparable getFrom() {
+    public Integer getFrom() {
         return Integer.valueOf(from);
     }
 
     /**
      * {@inheritDoc}
      */
-    public Comparable getTo() {
+    public Integer getTo() {
         return Integer.valueOf(to);
     }
 
