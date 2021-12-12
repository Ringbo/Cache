diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/WorkbenchContextListener.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/WorkbenchContextListener.java
index e3bf463..128c251 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/WorkbenchContextListener.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/core/WorkbenchContextListener.java
@@ -111,14 +111,14 @@
             contextService.deferUpdates(true);
             if (part instanceof INavigatorModelView) {
                 if (activationNavigator != null) {
-                    log.warn("Double activation of navigator context");
+                    log.debug("Double activation of navigator context");
                     contextService.deactivateContext(activationNavigator);
                 }
                 activationNavigator = contextService.activateContext(NAVIGATOR_CONTEXT_ID);
             }
             if (part instanceof SQLEditorBase) {
                 if (activationSQL != null) {
-                    log.warn("Double activation of SQL context");
+                    log.debug("Double activation of SQL context");
                     contextService.deactivateContext(activationSQL);
                 }
                 activationSQL = contextService.activateContext(SQL_EDITOR_CONTEXT_ID);
