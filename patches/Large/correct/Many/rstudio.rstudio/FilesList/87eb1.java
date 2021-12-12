diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/files/ui/FilesList.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/files/ui/FilesList.java
index 1285625..598231d 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/files/ui/FilesList.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/files/ui/FilesList.java
@@ -140,13 +140,13 @@
                                 SafeHtmlUtils.fromSafeConstant("<br/>"));
       filesCellTable_.setColumnWidth(iconColumn, 20, Unit.PX);
     
-      sortHandler_.setComparator(iconColumn, new FoldersOnBottomComparator() {
+      sortHandler_.setComparator(iconColumn, new FilesListComparator() {
          @Override
-         public int doItemCompare(FileSystemItem arg0, FileSystemItem arg1)
+         public int doCompare(FileSystemItem arg0, FileSystemItem arg1)
          {
-            if (arg0 == parentPath_)
+            if (arg0.isDirectory() && !arg1.isDirectory())
                return 1;
-            else if (arg1 == parentPath_)
+            else if (arg1.isDirectory() && !arg0.isDirectory())
                return -1;
             else
                return arg0.getExtension().compareTo(arg1.getExtension());
