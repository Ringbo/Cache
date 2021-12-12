diff --git a/core/src/processing/core/PShape.java b/core/src/processing/core/PShape.java
index 9dde666..b97c468 100644
--- a/core/src/processing/core/PShape.java
+++ b/core/src/processing/core/PShape.java
@@ -1547,7 +1547,9 @@
     } else if (family == PRIMITIVE) {
       drawPrimitive(g);
     } else if (family == GEOMETRY) {
-      drawGeometry(g);
+      // same as path
+      drawPath(g);
+//      drawGeometry(g);
     } else if (family == PATH) {
       drawPath(g);
     }
