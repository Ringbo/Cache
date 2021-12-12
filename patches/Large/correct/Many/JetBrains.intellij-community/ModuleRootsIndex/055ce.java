diff --git a/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleRootsIndex.java b/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleRootsIndex.java
index 523e09a..d9ae521 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleRootsIndex.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/incremental/ModuleRootsIndex.java
@@ -45,7 +45,7 @@
         myRootToModuleMap.put(root, descriptor);
         moduleRoots.add(descriptor);
       }
-      for (String r : module.getExcludes()) {
+      for (String r : module.getOwnExcludes()) {
         final File root = new File(FileUtil.toCanonicalPath(r));
         myExcludedRoots.add(root);
       }
