diff --git a/core/src/processing/core/PShape.java b/core/src/processing/core/PShape.java
index 05bc4e1..7d6f1d7 100644
--- a/core/src/processing/core/PShape.java
+++ b/core/src/processing/core/PShape.java
@@ -1604,9 +1604,9 @@
     } else if (family == PRIMITIVE) {
       drawPrimitive(g);
     } else if (family == GEOMETRY) {
-      // same as path
-      drawPath(g);
-//      drawGeometry(g);
+      // Not same as path: `kind` matters.
+//      drawPath(g);
+      drawGeometry(g);
     } else if (family == PATH) {
       drawPath(g);
     }
