diff --git a/python/src/com/jetbrains/python/sdk/PythonSdkUpdater.java b/python/src/com/jetbrains/python/sdk/PythonSdkUpdater.java
index 7e38682..e593af4 100644
--- a/python/src/com/jetbrains/python/sdk/PythonSdkUpdater.java
+++ b/python/src/com/jetbrains/python/sdk/PythonSdkUpdater.java
@@ -165,7 +165,7 @@
                   PyPackageManager.getInstance(sdk12).refreshAndGetPackages(true);
                 }
                 catch (ExecutionException e) {
-                  LOG.error(e);
+                  LOG.warn(e);
                 }
               }
               catch (InvalidSdkException e) {
