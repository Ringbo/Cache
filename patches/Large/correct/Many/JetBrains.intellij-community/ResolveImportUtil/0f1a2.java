diff --git a/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java b/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
index 1d880b4..fd8649d 100644
--- a/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
+++ b/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
@@ -569,7 +569,7 @@
         components.set(0, "datetime");
         return PyQualifiedName.fromComponents(components);
       }
-      else if (head.equals("ntpath") || head.equals("posixpath")) {
+      else if (head.equals("ntpath") || head.equals("posixpath") || head.equals("path")) {
         final List<String> result = new ArrayList<String>();
         result.add("os");
         components.set(0, "path");
