diff --git a/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java b/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java
index fae163f..5d95f88 100644
--- a/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java
+++ b/src/org/thoughtcrime/securesms/jobs/PushDecryptJob.java
@@ -64,7 +64,7 @@
   @Override
   public void onAdded() {
     if (KeyCachingService.getMasterSecret(context) == null) {
-      MessageNotifier.updateNotification(context, null);
+      MessageNotifier.updateNotification(context, null, -2);
     }
   }
 
