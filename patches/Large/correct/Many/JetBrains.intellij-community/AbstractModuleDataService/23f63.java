diff --git a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/AbstractModuleDataService.java b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/AbstractModuleDataService.java
index 86a1f8e..fe45eff 100644
--- a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/AbstractModuleDataService.java
+++ b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/AbstractModuleDataService.java
@@ -299,7 +299,7 @@
 
       String buildSystem = projectData != null ? projectData.getOwner().getReadableName() : "build system";
       String content = ExternalSystemBundle.message("orphan.modules.text", buildSystem,
-                                                    StringUtil.shortenTextWithEllipsis(modulesToRestoreText.toString(), 100, 0));
+                                                    StringUtil.shortenTextWithEllipsis(modulesToRestoreText.toString(), 50, 0));
       Notification cleanUpNotification = ORPHAN_MODULE_NOTIFICATION_GROUP.createNotification(content, NotificationType.INFORMATION)
         .setListener((notification, event) -> {
           if (event.getEventType() != HyperlinkEvent.EventType.ACTIVATED) return;
@@ -358,7 +358,7 @@
         GridBagConstraints gbConstraints = new GridBagConstraints();
         JPanel panel = new JPanel(new GridBagLayout());
         gbConstraints.insets = JBUI.insets(4, 0, 10, 8);
-        panel.add(new JLabel(ExternalSystemBundle.message("orphan.modules.dialog.text", buildSystem)), gbConstraints);
+        panel.add(new JLabel(ExternalSystemBundle.message("orphan.modules.dialog.text")), gbConstraints);
         return panel;
       }
     };
