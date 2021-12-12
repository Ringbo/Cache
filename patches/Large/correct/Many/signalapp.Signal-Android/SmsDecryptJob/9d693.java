diff --git a/src/org/thoughtcrime/securesms/jobs/SmsDecryptJob.java b/src/org/thoughtcrime/securesms/jobs/SmsDecryptJob.java
index bd8f343..e22905a 100644
--- a/src/org/thoughtcrime/securesms/jobs/SmsDecryptJob.java
+++ b/src/org/thoughtcrime/securesms/jobs/SmsDecryptJob.java
@@ -56,7 +56,7 @@
   @Override
   public void onAdded() {
     if (KeyCachingService.getMasterSecret(context) == null) {
-      MessageNotifier.updateNotification(context, null);
+      MessageNotifier.updateNotification(context, null, -2);
     }
   }
 
