diff --git a/source/com/intellij/uiDesigner/DragSelectionProcessor.java b/source/com/intellij/uiDesigner/DragSelectionProcessor.java
index 4dea365..e3b2f58 100644
--- a/source/com/intellij/uiDesigner/DragSelectionProcessor.java
+++ b/source/com/intellij/uiDesigner/DragSelectionProcessor.java
@@ -193,7 +193,7 @@
       c.getConstraints().restore(myOriginalConstraints[i]);
       c.setBounds(myOriginalBounds[i]);
       final RadContainer originalParent = myOriginalParents[i];
-      if (c.getParent() == originalParent) {
+      if (c.getParent() != originalParent) {
         originalParent.addComponent(c);
       }
     }
