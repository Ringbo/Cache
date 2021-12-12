diff --git a/plugins/google-app-engine/source/com/intellij/appengine/actions/AppEngineUploader.java b/plugins/google-app-engine/source/com/intellij/appengine/actions/AppEngineUploader.java
index 4e0433d..dcc169f 100644
--- a/plugins/google-app-engine/source/com/intellij/appengine/actions/AppEngineUploader.java
+++ b/plugins/google-app-engine/source/com/intellij/appengine/actions/AppEngineUploader.java
@@ -157,7 +157,7 @@
 
     final CompilerManager compilerManager = CompilerManager.getInstance(myProject);
     final CompileScope moduleScope = compilerManager.createModuleCompileScope(myAppEngineFacet.getModule(), true);
-    final CompileScope compileScope = ArtifactCompileScope.createScopeWithArtifacts(moduleScope, Collections.singletonList(myArtifact));
+    final CompileScope compileScope = ArtifactCompileScope.createScopeWithArtifacts(moduleScope, Collections.singletonList(myArtifact), true);
     if (!compilerManager.isUpToDate(compileScope)) {
       ApplicationManager.getApplication().invokeLater(new Runnable() {
         public void run() {
