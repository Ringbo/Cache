diff --git a/src/org/thoughtcrime/securesms/ApplicationContext.java b/src/org/thoughtcrime/securesms/ApplicationContext.java
index 68a515a..9be8ded 100644
--- a/src/org/thoughtcrime/securesms/ApplicationContext.java
+++ b/src/org/thoughtcrime/securesms/ApplicationContext.java
@@ -265,7 +265,7 @@
   private void initializePendingMessages() {
     if (TextSecurePreferences.getNeedsMessagePull(this)) {
       Log.i(TAG, "Scheduling a message fetch.");
-      ApplicationContext.getInstance(this).getJobManager().add(new PushNotificationReceiveJob());
+      ApplicationContext.getInstance(this).getJobManager().add(new PushNotificationReceiveJob(this));
       TextSecurePreferences.setNeedsMessagePull(this, false);
     }
   }
