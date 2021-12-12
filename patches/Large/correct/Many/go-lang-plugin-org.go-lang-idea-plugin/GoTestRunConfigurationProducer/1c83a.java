diff --git a/src/com/goide/runconfig/testing/GoTestRunConfigurationProducer.java b/src/com/goide/runconfig/testing/GoTestRunConfigurationProducer.java
index 3c63ee7..733e4bc 100644
--- a/src/com/goide/runconfig/testing/GoTestRunConfigurationProducer.java
+++ b/src/com/goide/runconfig/testing/GoTestRunConfigurationProducer.java
@@ -89,7 +89,7 @@
         return isPackageContext(contextElement) && 
                StringUtil.notNullize(((GoFile)file).getPackageName()).equals(configuration.getPackage());
       case FILE:
-        if (!FileUtil.pathsEqual(configuration.getFilePath(), file.getVirtualFile().getPath())) {
+        if (file == null || !FileUtil.pathsEqual(configuration.getFilePath(), file.getVirtualFile().getPath())) {
           return false;
         }
         String functionNameFromContext = findFunctionNameFromContext(contextElement);
