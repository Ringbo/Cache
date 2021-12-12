diff --git a/src/com/facebook/buck/features/go/GoLinkStep.java b/src/com/facebook/buck/features/go/GoLinkStep.java
index a6a994a..83319e4 100644
--- a/src/com/facebook/buck/features/go/GoLinkStep.java
+++ b/src/com/facebook/buck/features/go/GoLinkStep.java
@@ -26,13 +26,13 @@
 
 public class GoLinkStep extends ShellStep {
 
-  enum LinkMode {
+  enum BuildMode {
     EXECUTABLE("exe");
     // Other gc modes: http://blog.ralch.com/tutorial/golang-sharing-libraries/
 
     private final String buildMode;
 
-    LinkMode(String buildMode) {
+    BuildMode(String buildMode) {
       this.buildMode = buildMode;
     }
 
@@ -48,7 +48,7 @@
   private final ImmutableList<Path> libraryPaths;
   private final GoPlatform platform;
   private final Path mainArchive;
-  private final LinkMode linkMode;
+  private final BuildMode buildMode;
   private final Path output;
 
   public GoLinkStep(
@@ -60,7 +60,7 @@
       ImmutableList<Path> libraryPaths,
       GoPlatform platform,
       Path mainArchive,
-      LinkMode linkMode,
+      BuildMode buildMode,
       Path output) {
     super(workingDirectory);
     this.environment = environment;
@@ -70,7 +70,7 @@
     this.libraryPaths = libraryPaths;
     this.platform = platform;
     this.mainArchive = mainArchive;
-    this.linkMode = linkMode;
+    this.buildMode = buildMode;
     this.output = output;
   }
 
@@ -81,7 +81,7 @@
             .addAll(linkCommandPrefix)
             .addAll(flags)
             .add("-o", output.toString())
-            .add("-buildmode", linkMode.getBuildMode());
+            .add("-buildmode", buildMode.getBuildMode());
 
     for (Path libraryPath : libraryPaths) {
       command.add("-L", libraryPath.toString());
