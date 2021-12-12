diff --git a/src/org/zaproxy/zap/extension/autoupdate/ExtensionAutoUpdate.java b/src/org/zaproxy/zap/extension/autoupdate/ExtensionAutoUpdate.java
index e3206ce..195a571 100644
--- a/src/org/zaproxy/zap/extension/autoupdate/ExtensionAutoUpdate.java
+++ b/src/org/zaproxy/zap/extension/autoupdate/ExtensionAutoUpdate.java
@@ -789,7 +789,7 @@
 
         if (latestVersionInfo != null) {
             AddOn addOn = latestVersionInfo.getAddOn(ao.getId());
-            if (AddOn.InstallationStatus.DOWNLOADING == addOn.getInstallationStatus()) {
+            if (addOn != null && AddOn.InstallationStatus.DOWNLOADING == addOn.getInstallationStatus()) {
                 addOn.setInstallationStatus(AddOn.InstallationStatus.INSTALLED);
             }
         }
