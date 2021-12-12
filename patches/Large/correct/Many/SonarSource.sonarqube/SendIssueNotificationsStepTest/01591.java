diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/SendIssueNotificationsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/SendIssueNotificationsStepTest.java
index b846287..92ea188 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/SendIssueNotificationsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/SendIssueNotificationsStepTest.java
@@ -87,7 +87,7 @@
   }
 
   @Test
-  public void do_not_send_notifications_if_no_subscribers() throws IOException {
+  public void do_not_send_notifications_if_no_subscribers() {
     when(notifService.hasProjectSubscribersForTypes(PROJECT_UUID, SendIssueNotificationsStep.NOTIF_TYPES)).thenReturn(false);
 
     sut.execute();
