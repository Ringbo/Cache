diff --git a/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java b/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java
index 71ccb31..6a38c9d 100644
--- a/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyPackageRequirementsInspection.java
@@ -256,7 +256,7 @@
         packages = manager.getPackages(PySdkUtil.isRemote(sdk));
       }
       catch (ExecutionException e) {
-        LOG.error(e);
+        LOG.warn(e);
         return null;
       }
       if (packages == null) return null;
