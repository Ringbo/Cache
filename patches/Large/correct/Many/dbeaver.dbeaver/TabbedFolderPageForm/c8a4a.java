diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java
index ed0e8f5..5295c29 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java
@@ -328,7 +328,7 @@
                         monitor.beginTask("Load '" + DBValueFormatting.getDefaultValueDisplayString(curPropertySource.getEditableValue(), DBDDisplayFormat.UI) + "' properties", allProps.size());
                         Map<DBPPropertyDescriptor, Object> propValues = new HashMap<>();
                         for (DBPPropertyDescriptor prop : allProps) {
-                            if (monitor.isCanceled()) {
+                            if (monitor.isCanceled() || curPropertySource == null) {
                                 break;
                             }
                             Object value = curPropertySource.getPropertyValue(monitor, prop.getId());
