diff --git a/Dart/src/com/jetbrains/lang/dart/DartFileListener.java b/Dart/src/com/jetbrains/lang/dart/DartFileListener.java
index 670da5e..b78a0ad 100644
--- a/Dart/src/com/jetbrains/lang/dart/DartFileListener.java
+++ b/Dart/src/com/jetbrains/lang/dart/DartFileListener.java
@@ -94,7 +94,7 @@
       scheduleDartPackageRootsUpdate(project);
 
       final Module module = ModuleUtilCore.findModuleForFile(pubspec, project);
-      if (module != null) {
+      if (module != null && !module.isDisposed()) {
         DartProjectComponent.excludeBuildAndPackagesFolders(module, pubspec);
       }
     }
