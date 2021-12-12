diff --git a/src/be/ibridge/kettle/spoon/Spoon.java b/src/be/ibridge/kettle/spoon/Spoon.java
index 5b93833..52433b5 100644
--- a/src/be/ibridge/kettle/spoon/Spoon.java
+++ b/src/be/ibridge/kettle/spoon/Spoon.java
@@ -1162,7 +1162,7 @@
         tiPart   = new TreeItem(selectionTree, SWT.NONE); tiPart.setText(STRING_PARTITIONS);
         tiStep   = new TreeItem(selectionTree, SWT.NONE); tiStep.setText(STRING_STEPS);
         tiHops   = new TreeItem(selectionTree, SWT.NONE); tiHops.setText(STRING_HOPS);
-        tiClus   = new TreeItem(selectionTree, SWT.NONE); tiHops.setText(STRING_CLUSTERS);
+        tiClus   = new TreeItem(selectionTree, SWT.NONE); tiClus.setText(STRING_CLUSTERS);
         tiBase   = new TreeItem(selectionTree, SWT.NONE); tiBase.setText(STRING_BASE);
         tiPlug   = new TreeItem(selectionTree, SWT.NONE); tiPlug.setText(STRING_PLUGIN);
         
