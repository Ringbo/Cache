diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/EnvironmentBackedRecursivePackageProvider.java b/src/main/java/com/google/devtools/build/lib/skyframe/EnvironmentBackedRecursivePackageProvider.java
index 7256ada..8f3f4e8 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/EnvironmentBackedRecursivePackageProvider.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/EnvironmentBackedRecursivePackageProvider.java
@@ -144,12 +144,21 @@
     if (blacklistedSubdirectories.contains(directory)) {
       return ImmutableList.of();
     }
-    PathFragment.checkAllPathsAreUnder(blacklistedSubdirectories, directory);
+    ImmutableSet filteredBlacklistedSubdirectories =
+        ImmutableSet.copyOf(
+            Iterables.filter(
+                blacklistedSubdirectories,
+                path -> !path.equals(directory) && path.startsWith(directory)));
 
     LinkedHashSet<PathFragment> packageNames = new LinkedHashSet<>();
     for (Root root : roots) {
-      RecursivePkgValue lookup = (RecursivePkgValue) env.getValue(RecursivePkgValue.key(
-          repository, RootedPath.toRootedPath(root, directory), blacklistedSubdirectories));
+      RecursivePkgValue lookup =
+          (RecursivePkgValue)
+              env.getValue(
+                  RecursivePkgValue.key(
+                      repository,
+                      RootedPath.toRootedPath(root, directory),
+                      filteredBlacklistedSubdirectories));
       if (lookup == null) {
         // Typically a null value from Environment.getValue(k) means that either the key k is
         // missing a dependency or an exception was thrown during evaluation of k. Here, if this
