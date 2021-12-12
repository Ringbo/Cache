diff --git a/platform/vcs-log/graph/src/com/intellij/vcs/log/newgraph/render/SimpleGraphCellPainter.java b/platform/vcs-log/graph/src/com/intellij/vcs/log/newgraph/render/SimpleGraphCellPainter.java
index c34c5e3..07605c9 100644
--- a/platform/vcs-log/graph/src/com/intellij/vcs/log/newgraph/render/SimpleGraphCellPainter.java
+++ b/platform/vcs-log/graph/src/com/intellij/vcs/log/newgraph/render/SimpleGraphCellPainter.java
@@ -209,11 +209,11 @@
         case NODE:
           assert element instanceof Node;
           Node node = (Node) element;
-          if (isSelected(node)) {
+          if (isMarked(node)) {
             paintCircle(rowElement.getPosition(), MARK_COLOR, true);
             paintCircle(rowElement.getPosition(), getColor(node), false);
           } else {
-            paintCircle(rowElement.getPosition(), getColor(node), isMarked(node));
+            paintCircle(rowElement.getPosition(), getColor(node), isSelected(node));
           }
           break;
         case UP_ARROW:
