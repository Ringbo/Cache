diff --git a/src-ui/org/pentaho/di/ui/core/dialog/EnterSelectionDialog.java b/src-ui/org/pentaho/di/ui/core/dialog/EnterSelectionDialog.java
index eeed0b6..56a0bf5 100644
--- a/src-ui/org/pentaho/di/ui/core/dialog/EnterSelectionDialog.java
+++ b/src-ui/org/pentaho/di/ui/core/dialog/EnterSelectionDialog.java
@@ -190,7 +190,7 @@
 			if(Const.isOSX()) {
 				wtfilter.setWidth(100);
 			} else {
-				wtfilter.setWidth(60);
+				wtfilter.setWidth(70);
 			}
 			
 			wfilter = new ToolItem(treeTb, SWT.SEPARATOR);
