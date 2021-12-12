diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java
index 7d2f95c..57b62b4 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java
@@ -577,7 +577,7 @@
             }
             return new Point(
                 Math.max(MIN_FILTER_TEXT_WIDTH, Math.min(textSize.x + 10, maxWidth)),
-                Math.min(textSize.y + 4, MIN_FILTER_TEXT_HEIGHT));
+                Math.min(textSize.y + 6, MIN_FILTER_TEXT_HEIGHT));
         }
 
         @Override
