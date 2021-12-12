diff --git a/plugins/sonar-email-notifications-plugin/src/main/java/org/sonar/plugins/emailnotifications/AlertsEmailTemplate.java b/plugins/sonar-email-notifications-plugin/src/main/java/org/sonar/plugins/emailnotifications/AlertsEmailTemplate.java
index 542d352..a66444a 100644
--- a/plugins/sonar-email-notifications-plugin/src/main/java/org/sonar/plugins/emailnotifications/AlertsEmailTemplate.java
+++ b/plugins/sonar-email-notifications-plugin/src/main/java/org/sonar/plugins/emailnotifications/AlertsEmailTemplate.java
@@ -52,7 +52,7 @@
     String alertName = notification.getFieldValue("alertName");
     String alertText = notification.getFieldValue("alertText");
     String alertLevel = notification.getFieldValue("alertLevel");
-    boolean isNewAlert = Boolean.valueOf(notification.getFieldValue("isNewAlert"));
+    boolean isNewAlert = Boolean.parseBoolean(notification.getFieldValue("isNewAlert"));
 
     // Generate text
     String subject = generateSubject(projectName, alertLevel, isNewAlert);
