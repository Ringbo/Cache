diff --git a/jps/model-serialization/src/org/jetbrains/jps/model/serialization/PathMacroUtil.java b/jps/model-serialization/src/org/jetbrains/jps/model/serialization/PathMacroUtil.java
index 9a19346..742eb64 100644
--- a/jps/model-serialization/src/org/jetbrains/jps/model/serialization/PathMacroUtil.java
+++ b/jps/model-serialization/src/org/jetbrains/jps/model/serialization/PathMacroUtil.java
@@ -58,7 +58,7 @@
     // rather than the .idea directory itself is considered the module root
     // (so that a Ruby IDE project doesn't break if its directory is moved together with the .idea directory)
     String moduleDirParent = PathUtilRt.getParentPath(moduleDir);
-    if (!StringUtil.isEmpty(moduleDirParent) && PathUtilRt.getFileName(moduleDirParent).equals(DIRECTORY_STORE_NAME)) {
+    if (!StringUtil.isEmpty(moduleDirParent) && PathUtilRt.getFileName(moduleDir).equals(DIRECTORY_STORE_NAME)) {
       moduleDir = moduleDirParent;
     }
     moduleDir = toSystemIndependentName(moduleDir);
