diff --git a/src/com/facebook/buck/apple/AppleToolchainDiscovery.java b/src/com/facebook/buck/apple/AppleToolchainDiscovery.java
index e35a7c0..b7974f1 100644
--- a/src/com/facebook/buck/apple/AppleToolchainDiscovery.java
+++ b/src/com/facebook/buck/apple/AppleToolchainDiscovery.java
@@ -112,7 +112,7 @@
     }
 
     if (!addedToolchain) {
-      LOG.error(
+      LOG.debug(
           "Failed to resolve info about toolchain %s from plist files %s",
           toolchainDir.toString(),
           Arrays.toString(potentialPlistNames));
