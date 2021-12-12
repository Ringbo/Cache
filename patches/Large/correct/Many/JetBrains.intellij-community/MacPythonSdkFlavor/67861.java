diff --git a/python/src/com/jetbrains/python/sdk/MacPythonSdkFlavor.java b/python/src/com/jetbrains/python/sdk/MacPythonSdkFlavor.java
index e7a22a8..99e47af 100644
--- a/python/src/com/jetbrains/python/sdk/MacPythonSdkFlavor.java
+++ b/python/src/com/jetbrains/python/sdk/MacPythonSdkFlavor.java
@@ -32,7 +32,7 @@
           if ("Current".equals(dir_name) || dir_name.startsWith("2") || dir_name.startsWith("3")) {
             VirtualFile bin_dir = dir.findChild("bin");
             if (bin_dir != null && bin_dir.isDirectory()) {
-              VirtualFile python_exe = dir.findChild("python");
+              VirtualFile python_exe = bin_dir.findChild("python");
               if (python_exe != null) candidates.add(python_exe.getPath());
             }
           }
