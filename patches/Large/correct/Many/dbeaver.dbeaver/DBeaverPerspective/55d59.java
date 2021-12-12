diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
index 38286de..5668b99 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
@@ -68,7 +68,7 @@
             BOTTOM_BOTTOM_LEFT,
             IPageLayout.BOTTOM,
             0.7f,
-            editorArea);
+            FOLDER_NAVIGATION);
         bottomLeft.addView(ProjectExplorerView.VIEW_ID);
         bottomLeft.addPlaceholder(DatabaseBrowserView.VIEW_ID);
 
