diff --git a/plugins/github/src/org/jetbrains/plugins/github/util/GithubNotifications.java b/plugins/github/src/org/jetbrains/plugins/github/util/GithubNotifications.java
index 03b495e..6c94a2a 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/util/GithubNotifications.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/util/GithubNotifications.java
@@ -120,7 +120,7 @@
 
   public static void showErrorDialog(@NotNull Component component, @NotNull String title, @NotNull Exception e) {
     LOG.info(title, e);
-    Messages.showInfoMessage(component, getErrorTextFromException(e), title);
+    Messages.showErrorDialog(component, getErrorTextFromException(e), title);
   }
 
   @Messages.YesNoResult
