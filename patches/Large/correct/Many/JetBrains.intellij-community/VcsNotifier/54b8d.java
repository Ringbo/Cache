diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/VcsNotifier.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/VcsNotifier.java
index 71d1bdf..41547bb 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/VcsNotifier.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/VcsNotifier.java
@@ -92,7 +92,7 @@
 
   @NotNull
   public Notification notifyWeakError(@NotNull String message) {
-    return notify(NOTIFICATION_GROUP_ID, "", message, NotificationType.ERROR, (NotificationAction)null);
+    return notify(NOTIFICATION_GROUP_ID, "", message, NotificationType.ERROR, (NotificationListener)null);
   }
 
   @NotNull
@@ -112,7 +112,7 @@
 
   @NotNull
   public Notification notifyImportantInfo(@NotNull String title, @NotNull String message) {
-    return notify(IMPORTANT_ERROR_NOTIFICATION, title, message, NotificationType.INFORMATION, (NotificationAction)null);
+    return notify(IMPORTANT_ERROR_NOTIFICATION, title, message, NotificationType.INFORMATION, (NotificationListener)null);
   }
 
   @NotNull
@@ -157,7 +157,7 @@
 
   @NotNull
   public Notification notifyImportantWarning(@NotNull String title, @NotNull String message) {
-    return notify(IMPORTANT_ERROR_NOTIFICATION, title, message, NotificationType.WARNING, (NotificationAction)null);
+    return notify(IMPORTANT_ERROR_NOTIFICATION, title, message, NotificationType.WARNING, (NotificationListener)null);
   }
 
   @NotNull
@@ -167,7 +167,7 @@
 
   @NotNull
   public Notification notifyMinorInfo(@NotNull String title, @NotNull String message) {
-    return notifyMinorInfo(title, message, (NotificationAction)null);
+    return notifyMinorInfo(title, message, (NotificationListener)null);
   }
 
   @NotNull
@@ -181,6 +181,6 @@
   }
 
   public Notification logInfo(@NotNull String title, @NotNull String message) {
-    return notify(SILENT_NOTIFICATION, title, message, NotificationType.INFORMATION, (NotificationAction)null);
+    return notify(SILENT_NOTIFICATION, title, message, NotificationType.INFORMATION, (NotificationListener)null);
   }
 }
