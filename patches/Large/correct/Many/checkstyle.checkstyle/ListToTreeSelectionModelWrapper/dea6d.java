diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java
index e373174..cfbebbb 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ListToTreeSelectionModelWrapper.java
@@ -60,7 +60,7 @@
      *
      * @return the list selection model
      */
-    final ListSelectionModel getListSelectionModel() {
+    protected final ListSelectionModel getListSelectionModel() {
         return listSelectionModel;
     }
 
