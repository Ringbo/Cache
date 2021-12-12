diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/project/ProjectExportWizard.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/project/ProjectExportWizard.java
index 35e4677..44b3266 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/project/ProjectExportWizard.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/project/ProjectExportWizard.java
@@ -287,7 +287,7 @@
         exportData.archiveStream.closeEntry();
 
         // Export resources
-        for (IResource child : project.members()) {
+        for (IResource child : project.members(IContainer.INCLUDE_HIDDEN)) {
             exportResourceTree(monitor, exportData, projectPath, child);
         }
 
