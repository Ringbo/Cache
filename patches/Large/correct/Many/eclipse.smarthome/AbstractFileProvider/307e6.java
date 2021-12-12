diff --git a/bundles/automation/org.eclipse.smarthome.automation.provider.file/src/main/java/org/eclipse/smarthome/automation/internal/provider/file/AbstractFileProvider.java b/bundles/automation/org.eclipse.smarthome.automation.provider.file/src/main/java/org/eclipse/smarthome/automation/internal/provider/file/AbstractFileProvider.java
index b5fb002..d92fd00 100644
--- a/bundles/automation/org.eclipse.smarthome.automation.provider.file/src/main/java/org/eclipse/smarthome/automation/internal/provider/file/AbstractFileProvider.java
+++ b/bundles/automation/org.eclipse.smarthome.automation.provider.file/src/main/java/org/eclipse/smarthome/automation/internal/provider/file/AbstractFileProvider.java
@@ -138,7 +138,7 @@
             File[] files = file.listFiles();
             if (files != null) {
                 for (File f : files) {
-                    if (!file.isHidden()) {
+                    if (!f.isHidden()) {
                         importResources(f);
                     }
                 }
