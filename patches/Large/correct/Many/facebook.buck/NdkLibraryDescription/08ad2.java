diff --git a/src/com/facebook/buck/android/NdkLibraryDescription.java b/src/com/facebook/buck/android/NdkLibraryDescription.java
index d084ddb..6210e3e 100644
--- a/src/com/facebook/buck/android/NdkLibraryDescription.java
+++ b/src/com/facebook/buck/android/NdkLibraryDescription.java
@@ -68,7 +68,7 @@
 
     try {
       final Path buildRulePath = Paths.get(params.getBuildTarget().getBasePath());
-      final Path rootDirectory = params.getPathRelativizer().apply(buildRulePath);
+      final Path rootDirectory = params.getPathAbsolutifier().apply(buildRulePath);
       Files.walkFileTree(
           rootDirectory,
           EnumSet.of(FileVisitOption.FOLLOW_LINKS),
