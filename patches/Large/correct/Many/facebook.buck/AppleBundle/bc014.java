diff --git a/src/com/facebook/buck/apple/AppleBundle.java b/src/com/facebook/buck/apple/AppleBundle.java
index 7f60e00..c93f25c 100644
--- a/src/com/facebook/buck/apple/AppleBundle.java
+++ b/src/com/facebook/buck/apple/AppleBundle.java
@@ -337,7 +337,7 @@
               getProjectFilesystem(),
               bundleRoot.resolve(this.destinations.getExecutablesPath())));
 
-      Path binaryOutputPath = binary.get().getPathToOutput();
+      final Path binaryOutputPath = binary.get().getPathToOutput();
       Preconditions.checkNotNull(binaryOutputPath);
 
       stepsBuilder.add(
@@ -359,8 +359,10 @@
           new Step() {
             @Override
             public int execute(ExecutionContext context) throws IOException, InterruptedException {
-              // Don't strip binaries which are already code-signed.
-              if (!CodeSigning.hasValidSignature(context.getProcessExecutor(), bundleBinaryPath)) {
+              // Don't strip binaries which are already code-signed.  Note: we need to use
+              // binaryOutputPath instead of bundleBinaryPath because codesign will evaluate the
+              // entire .app bundle, even if you pass it the direct path to the embedded binary.
+              if (!CodeSigning.hasValidSignature(context.getProcessExecutor(), binaryOutputPath)) {
                 return (new DefaultShellStep(
                     getProjectFilesystem().getRootPath(),
                     ImmutableList.<String>builder()
