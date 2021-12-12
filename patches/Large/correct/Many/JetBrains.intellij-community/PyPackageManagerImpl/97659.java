diff --git a/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java b/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java
index 9b61fba..5571db9 100644
--- a/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java
+++ b/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java
@@ -474,7 +474,7 @@
 
   private static PyPackage findPackageByName(String name, List<PyPackage> packages) {
     for (PyPackage pkg : packages) {
-      if (name.equals(pkg.getName())) {
+      if (name.equalsIgnoreCase(pkg.getName())) {
         return pkg;
       }
     }
