diff --git a/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java b/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
index 5fa0c29..bc40c25 100644
--- a/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
+++ b/python/src/com/jetbrains/python/psi/resolve/ResolveImportUtil.java
@@ -565,7 +565,7 @@
         components.set(0, "datetime");
         return PyQualifiedName.fromComponents(components);
       }
-      else if (head.equals("ntpath") | head.equals("posixpath")) {
+      else if (head.equals("ntpath") || head.equals("posixpath")) {
         final List<String> result = new ArrayList<String>();
         result.add("os");
         components.set(0, "path");
