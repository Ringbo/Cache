diff --git a/openapi/src/com/intellij/analysis/AnalysisScope.java b/openapi/src/com/intellij/analysis/AnalysisScope.java
index c8affe3..3d0df1c 100644
--- a/openapi/src/com/intellij/analysis/AnalysisScope.java
+++ b/openapi/src/com/intellij/analysis/AnalysisScope.java
@@ -544,7 +544,7 @@
   }
 
   private void processModule(final Set<String> result, final Module module) {
-    final Project project = myModule.getProject();
+    final Project project = module.getProject();
     final ProjectProfileManager profileManager = ProjectProfileManager.getProjectProfileManager(project, Profile.INSPECTION);
     LOG.assertTrue(profileManager != null);
     final VirtualFile[] files = ModuleRootManager.getInstance(module).getContentRoots();
