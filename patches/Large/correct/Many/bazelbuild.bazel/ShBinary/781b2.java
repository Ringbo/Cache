diff --git a/src/main/java/com/google/devtools/build/lib/bazel/rules/sh/ShBinary.java b/src/main/java/com/google/devtools/build/lib/bazel/rules/sh/ShBinary.java
index 47a15de..0b3d37d 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/rules/sh/ShBinary.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/rules/sh/ShBinary.java
@@ -151,7 +151,7 @@
                   .getFragment(BazelConfiguration.class)
                   .getShellExecutable()
                   .getPathString());
-      dataSize += writeLaunchInfo(launchInfo, "bash_main_file", mainFile.getRunfilesPathString());
+      dataSize += writeLaunchInfo(launchInfo, "bash_main_file", mainFile.getExecPathString());
 
       ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
       // All Windows versions are little endian.
