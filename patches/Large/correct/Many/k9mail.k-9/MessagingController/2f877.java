diff --git a/app/core/src/main/java/com/fsck/k9/controller/MessagingController.java b/app/core/src/main/java/com/fsck/k9/controller/MessagingController.java
index d7988f8..9c5db21 100644
--- a/app/core/src/main/java/com/fsck/k9/controller/MessagingController.java
+++ b/app/core/src/main/java/com/fsck/k9/controller/MessagingController.java
@@ -2442,7 +2442,7 @@
         }
         final TracingWakeLock wakeLock = twakeLock;
 
-        for (MessagingListener l : getListeners()) {
+        for (MessagingListener l : getListeners(listener)) {
             l.checkMailStarted(context, account);
         }
         putBackground("checkMail", listener, new Runnable() {
@@ -2478,7 +2478,7 @@
                                 if (wakeLock != null) {
                                     wakeLock.release();
                                 }
-                                for (MessagingListener l : getListeners()) {
+                                for (MessagingListener l : getListeners(listener)) {
                                     l.checkMailFinished(context, account);
                                 }
 
