diff --git a/src/com/facebook/buck/apple/AppleBundle.java b/src/com/facebook/buck/apple/AppleBundle.java
index 80de6a6..492cdac 100644
--- a/src/com/facebook/buck/apple/AppleBundle.java
+++ b/src/com/facebook/buck/apple/AppleBundle.java
@@ -213,10 +213,9 @@
     this.sdkName = sdk.getName();
     this.debugInfoFormat = debugInfoFormat;
     bundleBinaryPath = bundleRoot.resolve(binaryPath);
-    dsymPath = bundleBinaryPath
+    dsymPath = bundleRoot
         .getParent()
-        .getParent()
-        .resolve(bundleBinaryPath.getFileName().toString() + ".dSYM");
+        .resolve(bundleRoot.getFileName().toString() + ".dSYM");
     hasBinary = binary.isPresent() && binary.get().getPathToOutput() != null;
 
     if (needCodeSign()) {
