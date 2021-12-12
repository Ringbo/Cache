diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/database/DatabaseNavigatorTree.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/database/DatabaseNavigatorTree.java
index b23a230..92b0d44 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/database/DatabaseNavigatorTree.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/database/DatabaseNavigatorTree.java
@@ -263,7 +263,7 @@
                     }
                 };
                 UIUtils.runInProgressService(runnable);
-                if (runnable.getResult() != null) {
+                if (runnable.getResult() != null && !treeViewer.getTree().isDisposed()) {
                     showNode(runnable.getResult());
                     treeViewer.expandToLevel(runnable.getResult(), 1);
 /*
