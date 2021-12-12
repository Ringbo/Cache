diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java
index c972b80..92e9190 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java
@@ -1084,7 +1084,7 @@
 
     public static ISelectionProvider getSelectionProvider(IServiceLocator serviceLocator)
     {
-        ISelectionProvider selectionProvider = (ISelectionProvider) serviceLocator.getService(IWorkbenchPartSite.class);
+        ISelectionProvider selectionProvider = (ISelectionProvider) serviceLocator.getService(ISelectionProvider.class);
         if (selectionProvider != null) {
             return selectionProvider;
         }
