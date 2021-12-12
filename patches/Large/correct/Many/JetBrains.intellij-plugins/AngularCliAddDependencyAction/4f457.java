diff --git a/AngularJS/src/org/angular2/cli/actions/AngularCliAddDependencyAction.java b/AngularJS/src/org/angular2/cli/actions/AngularCliAddDependencyAction.java
index b39b1c5..30e036a 100644
--- a/AngularJS/src/org/angular2/cli/actions/AngularCliAddDependencyAction.java
+++ b/AngularJS/src/org/angular2/cli/actions/AngularCliAddDependencyAction.java
@@ -234,7 +234,7 @@
       CompletionModuleInfo module = modules.get(0);
       ProcessHandler handler = NpmPackageProjectGenerator.generate(
         node, new NodePackage(Objects.requireNonNull(module.getVirtualFile()).getPath()),
-        pkg -> Objects.requireNonNull(pkg.findBinFile()).getAbsolutePath(),
+        pkg -> Objects.requireNonNull(pkg.findBinFile("ng", null)).getAbsolutePath(),
         cli, VfsUtilCore.virtualToIoFile(cli),
         project, () -> GistManager.getInstance().invalidateData(),
         "Installing " + packageSpec + " for " + cli.getName(),
