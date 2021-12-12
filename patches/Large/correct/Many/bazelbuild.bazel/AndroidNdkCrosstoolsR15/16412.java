diff --git a/src/main/java/com/google/devtools/build/lib/bazel/rules/android/ndkcrosstools/r15/AndroidNdkCrosstoolsR15.java b/src/main/java/com/google/devtools/build/lib/bazel/rules/android/ndkcrosstools/r15/AndroidNdkCrosstoolsR15.java
index f90604d..e46315e 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/rules/android/ndkcrosstools/r15/AndroidNdkCrosstoolsR15.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/rules/android/ndkcrosstools/r15/AndroidNdkCrosstoolsR15.java
@@ -74,7 +74,7 @@
       // unified headers sysroot, from ndk15 and up
       toolchainBuilder.addCxxBuiltinIncludeDirectory(
           ndkPaths.createBuiltinSysroot() + "/usr/include");
-      toolchainBuilder.addCompilerFlag(
+      toolchainBuilder.addUnfilteredCxxFlag(
           "-isystem%ndk%/usr/include".replace("%ndk%", ndkPaths.createBuiltinSysroot()));
 
       toolchains.add(toolchainBuilder.build());
