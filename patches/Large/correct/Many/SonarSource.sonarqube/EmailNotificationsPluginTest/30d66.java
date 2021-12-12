diff --git a/plugins/sonar-email-notifications-plugin/src/test/java/org/sonar/plugins/emailnotifications/EmailNotificationsPluginTest.java b/plugins/sonar-email-notifications-plugin/src/test/java/org/sonar/plugins/emailnotifications/EmailNotificationsPluginTest.java
index eceb69f..aeb4755 100644
--- a/plugins/sonar-email-notifications-plugin/src/test/java/org/sonar/plugins/emailnotifications/EmailNotificationsPluginTest.java
+++ b/plugins/sonar-email-notifications-plugin/src/test/java/org/sonar/plugins/emailnotifications/EmailNotificationsPluginTest.java
@@ -26,6 +26,6 @@
 public class EmailNotificationsPluginTest {
   @Test
   public void should_get_extensions() {
-    assertThat(new EmailNotificationsPlugin().getExtensions()).hasSize(5);
+    assertThat(new EmailNotificationsPlugin().getExtensions()).hasSize(7);
   }
 }
