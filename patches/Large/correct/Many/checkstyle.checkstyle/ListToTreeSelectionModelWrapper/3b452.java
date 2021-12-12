diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java
index cba24db..75af5b4 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java
@@ -44,7 +44,7 @@
     /**
      * @param jTreeTable TreeTable to perform updates on.
      */
-    public ListToTreeSelectionModelWrapper(JTreeTable jTreeTable) {
+    ListToTreeSelectionModelWrapper(JTreeTable jTreeTable) {
         treeTable = jTreeTable;
         getListSelectionModel().addListSelectionListener(createListSelectionListener());
     }
