diff --git a/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java b/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java
index 2ae69d0..6f6ecaa 100644
--- a/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java
@@ -289,7 +289,7 @@
       if (packages == null) {
         return;
       }
-      if (PyPackageUtil.hasManagement(packages)) {
+      if (!PyPackageUtil.hasManagement(packages)) {
         final int result = Messages.showYesNoDialog(project,
                                                     "Python packaging tools are required for installing packages. Do you want to " +
                                                     "install 'pip' and 'setuptools' for your interpreter?",
