diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java
index 971c521..a35ea92 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java
@@ -284,7 +284,7 @@
                     if (getColumnClass(counter) == ParseTreeTableModel.class) {
                         final MouseEvent mouseEvent = (MouseEvent) event;
                         final MouseEvent newMouseEvent = new MouseEvent(tree, mouseEvent.getID(),
-                                mouseEvent.getWhen(), mouseEvent.getModifiers(),
+                                mouseEvent.getWhen(), mouseEvent.getModifiersEx(),
                                 mouseEvent.getX() - getCellRect(0, counter, true).x,
                                 mouseEvent.getY(), mouseEvent.getClickCount(),
                                 mouseEvent.isPopupTrigger());
