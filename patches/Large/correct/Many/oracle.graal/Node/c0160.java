diff --git a/graal/com.oracle.max.graal.graph/src/com/oracle/max/graal/graph/Node.java b/graal/com.oracle.max.graal.graph/src/com/oracle/max/graal/graph/Node.java
index ba85133..144c0a3 100644
--- a/graal/com.oracle.max.graal.graph/src/com/oracle/max/graal/graph/Node.java
+++ b/graal/com.oracle.max.graal.graph/src/com/oracle/max/graal/graph/Node.java
@@ -496,11 +496,11 @@
     @Override
     public void formatTo(Formatter formatter, int flags, int width, int precision) {
         if ((flags & FormattableFlags.ALTERNATE) == FormattableFlags.ALTERNATE) {
-            formatter.format(toString(Verbosity.Id));
+            formatter.format("%s", toString(Verbosity.Id));
         } else if ((flags & FormattableFlags.UPPERCASE) == FormattableFlags.UPPERCASE) {
-            formatter.format(toString(Verbosity.Long));
+            formatter.format("%s", toString(Verbosity.Long));
         } else {
-            formatter.format(toString(Verbosity.Short));
+            formatter.format("%s", toString(Verbosity.Short));
         }
 
         boolean neighborsAlternate = ((flags & FormattableFlags.LEFT_JUSTIFY) == FormattableFlags.LEFT_JUSTIFY);
