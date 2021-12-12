diff --git a/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java b/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java
index fcd7af5..5c37eb9 100644
--- a/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java
+++ b/python/src/com/jetbrains/python/packaging/PyPackageManagerImpl.java
@@ -171,12 +171,12 @@
     boolean hasSetuptools = false;
     boolean hasPip = false;
     try {
-      hasSetuptools = findPackage(SETUPTOOLS, false) != null;
+      hasSetuptools = findPackage(PACKAGE_SETUPTOOLS, false) != null;
     }
     catch (PyExternalProcessException ignored) {
     }
     try {
-      hasPip = findPackage(PIP, false) != null;
+      hasPip = findPackage(PACKAGE_PIP, false) != null;
     }
     catch (PyExternalProcessException ignored) {
     }
