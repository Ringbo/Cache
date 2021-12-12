diff --git a/python/src/com/jetbrains/python/sdk/flavors/WinPythonSdkFlavor.java b/python/src/com/jetbrains/python/sdk/flavors/WinPythonSdkFlavor.java
index 2c45c83..86e0b40 100644
--- a/python/src/com/jetbrains/python/sdk/flavors/WinPythonSdkFlavor.java
+++ b/python/src/com/jetbrains/python/sdk/flavors/WinPythonSdkFlavor.java
@@ -75,7 +75,7 @@
       if (rootVDir instanceof NewVirtualFile) {
         ((NewVirtualFile)rootVDir).markDirty();
       }
-      rootVDir.refresh(false, false);
+      rootVDir.refresh(true, false);
       for (VirtualFile dir : rootVDir.getChildren()) {
         if (dir.isDirectory() && dir.getName().toLowerCase().startsWith(dir_prefix)) {
           VirtualFile python_exe = dir.findChild(exe_name);
