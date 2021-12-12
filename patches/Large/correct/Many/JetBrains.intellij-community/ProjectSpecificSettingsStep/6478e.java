diff --git a/python/ide/src/com/jetbrains/python/newProject/actions/ProjectSpecificSettingsStep.java b/python/ide/src/com/jetbrains/python/newProject/actions/ProjectSpecificSettingsStep.java
index 6952315..cd886b8 100644
--- a/python/ide/src/com/jetbrains/python/newProject/actions/ProjectSpecificSettingsStep.java
+++ b/python/ide/src/com/jetbrains/python/newProject/actions/ProjectSpecificSettingsStep.java
@@ -181,7 +181,7 @@
               return false;
             }
             if (!PyPackageUtil.hasManagement(packages)) {
-              warningList.add("Python packaging tools and " + warningList);
+              warningList.add("Python packaging tools and " + frameworkName + " will be installed on the selected interpreter");
             }
           } else {
             warningList.add(frameworkName + " is not installed on the selected interpreter");
