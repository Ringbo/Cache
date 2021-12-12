diff --git a/src/com/facebook/buck/apple/AppleCxxPlatform.java b/src/com/facebook/buck/apple/AppleCxxPlatform.java
index 4cb8474..fc20b56 100644
--- a/src/com/facebook/buck/apple/AppleCxxPlatform.java
+++ b/src/com/facebook/buck/apple/AppleCxxPlatform.java
@@ -105,7 +105,7 @@
     cflagsBuilder.add("-isysroot", sdkPaths.sdkPath().toString());
     cflagsBuilder.add("-arch", targetArchitecture);
     switch (targetPlatform) {
-      case MACOS:
+      case MACOSX:
         cflagsBuilder.add("-mmacosx-version-min=" + targetVersion);
         break;
       case IPHONESIMULATOR:
