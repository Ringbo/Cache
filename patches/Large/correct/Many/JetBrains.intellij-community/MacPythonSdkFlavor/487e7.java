diff --git a/python/src/com/jetbrains/python/sdk/flavors/MacPythonSdkFlavor.java b/python/src/com/jetbrains/python/sdk/flavors/MacPythonSdkFlavor.java
index 5d241b66..32ccaf6 100644
--- a/python/src/com/jetbrains/python/sdk/flavors/MacPythonSdkFlavor.java
+++ b/python/src/com/jetbrains/python/sdk/flavors/MacPythonSdkFlavor.java
@@ -49,7 +49,7 @@
       if (rootVDir instanceof NewVirtualFile) {
         ((NewVirtualFile)rootVDir).markDirty();
       }
-      rootVDir.refresh(false, false);
+      rootVDir.refresh(true, false);
       for (VirtualFile dir : rootVDir.getChildren()) {
         final String dir_name = dir.getName().toLowerCase();
         if (dir.isDirectory()) {
