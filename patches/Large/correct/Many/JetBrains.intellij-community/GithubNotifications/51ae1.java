diff --git a/plugins/github/src/org/jetbrains/plugins/github/GithubNotifications.java b/plugins/github/src/org/jetbrains/plugins/github/GithubNotifications.java
index 1f74481..0eecc38 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/GithubNotifications.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/GithubNotifications.java
@@ -44,13 +44,13 @@
   public static void showWarning(@NotNull Project project, @NotNull String title, @NotNull String message) {
     Notification notification = new Notification(GITHUB_NOTIFICATION_GROUP, title, message, NotificationType.WARNING);
     Notificator.getInstance(project).notify(notification);
-    LOG.warn(title + "; " + message);
+    LOG.info(title + "; " + message);
   }
 
   public static void showError(@NotNull Project project, @NotNull String title, @NotNull String message) {
     Notification notification = new Notification(GITHUB_NOTIFICATION_GROUP, title, message, NotificationType.ERROR);
     Notificator.getInstance(project).notify(notification);
-    LOG.warn(title + "; " + message);
+    LOG.info(title + "; " + message);
   }
 
   public static void showError(@NotNull Project project, @NotNull String title, @NotNull String message, @NotNull String logDetails) {
@@ -83,7 +83,7 @@
       new Notification(GITHUB_NOTIFICATION_GROUP, title, prefix + "<a href='" + url + "'>" + highlight + "</a>" + postfix,
                        NotificationType.WARNING, NotificationListener.URL_OPENING_LISTENER);
     Notificator.getInstance(project).notify(notification);
-    LOG.warn(title + "; " + prefix + highlight + postfix + "; " + url);
+    LOG.info(title + "; " + prefix + highlight + postfix + "; " + url);
   }
 
   public static void showErrorURL(@NotNull Project project,
@@ -96,7 +96,7 @@
       new Notification(GITHUB_NOTIFICATION_GROUP, title, prefix + "<a href='" + url + "'>" + highlight + "</a>" + postfix,
                        NotificationType.ERROR, NotificationListener.URL_OPENING_LISTENER);
     Notificator.getInstance(project).notify(notification);
-    LOG.warn(title + "; " + prefix + highlight + postfix + "; " + url);
+    LOG.info(title + "; " + prefix + highlight + postfix + "; " + url);
   }
 
   public static void showInfoDialog(final @Nullable Project project, final @NotNull String title, final @NotNull String message) {
@@ -106,12 +106,12 @@
 
   public static void showWarningDialog(final @Nullable Project project, final @NotNull String title, final @NotNull String message) {
     Messages.showWarningDialog(project, message, title);
-    LOG.warn(title + "; " + message);
+    LOG.info(title + "; " + message);
   }
 
   public static void showErrorDialog(final @Nullable Project project, final @NotNull String title, final @NotNull String message) {
     Messages.showErrorDialog(project, message, title);
-    LOG.warn(title + "; " + message);
+    LOG.info(title + "; " + message);
   }
 
   public static void showErrorDialog(final @Nullable Project project, final @NotNull String title, final @NotNull Exception e) {
