diff --git a/src/main/java/com/google/devtools/build/lib/rules/objc/IosTest.java b/src/main/java/com/google/devtools/build/lib/rules/objc/IosTest.java
index b4e7c85..7c49f81 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/objc/IosTest.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/objc/IosTest.java
@@ -133,9 +133,12 @@
       // -bundle_loader causes the code in this test to have access to the symbols in the test rig,
       // or more specifically, the flag causes ld to consider the given binary when checking for
       // missing symbols.
+      // -rpath @loader_path/Frameworks allows test bundles to load dylibs from the app's
+      // Frameworks directory.
       extraLinkArgs = new ExtraLinkArgs(
           "-bundle",
-          "-bundle_loader", bundleLoader.getExecPathString());
+          "-bundle_loader", bundleLoader.getExecPathString(),
+          "-Xlinker", "-rpath", "-Xlinker", "@loader_path/Frameworks");
 
       extraLinkInputs = ImmutableList.of(bundleLoader);
       bundleFormat = ReleaseBundlingSupport.XCTEST_BUNDLE_DIR_FORMAT;
