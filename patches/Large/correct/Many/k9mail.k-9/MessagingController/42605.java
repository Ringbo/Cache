diff --git a/src/com/fsck/k9/controller/MessagingController.java b/src/com/fsck/k9/controller/MessagingController.java
index 798bf58..250be0c 100644
--- a/src/com/fsck/k9/controller/MessagingController.java
+++ b/src/com/fsck/k9/controller/MessagingController.java
@@ -3134,7 +3134,7 @@
         }
 
         notifMgr.notify(K9.FETCHING_EMAIL_NOTIFICATION - account.getAccountNumber(),
-                builder.getNotification());
+                builder.build());
     }
 
     private void notifySendTempFailed(Account account, Exception lastFailure) {
@@ -3175,7 +3175,7 @@
                 K9.NOTIFICATION_LED_BLINK_FAST, true);
 
         notifMgr.notify(K9.SEND_FAILED_NOTIFICATION - account.getAccountNumber(),
-                builder.getNotification());
+                builder.build());
     }
 
     /**
@@ -3220,7 +3220,7 @@
         }
 
         notifMgr.notify(K9.FETCHING_EMAIL_NOTIFICATION - account.getAccountNumber(),
-                builder.getNotification());
+                builder.build());
     }
 
     private void notifyFetchingMailCancel(final Account account) {
