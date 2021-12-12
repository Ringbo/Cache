diff --git a/plugins/github/src/org/jetbrains/plugins/github/ui/GithubSettingsPanel.java b/plugins/github/src/org/jetbrains/plugins/github/ui/GithubSettingsPanel.java
index b1f08bc..1ba076e 100644
--- a/plugins/github/src/org/jetbrains/plugins/github/ui/GithubSettingsPanel.java
+++ b/plugins/github/src/org/jetbrains/plugins/github/ui/GithubSettingsPanel.java
@@ -84,18 +84,18 @@
         try {
           GithubUser user = GithubUtil.checkAuthData(getAuthData());
           if (GithubAuthData.AuthType.TOKEN.equals(getAuthType())) {
-            GithubNotifications.showInfoDialog(myPane, "Connection successful for user " + user.getLogin(), "Success");
+            GithubNotifications.showInfoDialog(myPane, "Success", "Connection successful for user " + user.getLogin());
           }
           else {
-            GithubNotifications.showInfoDialog(myPane, "Connection successful", "Success");
+            GithubNotifications.showInfoDialog(myPane, "Success", "Connection successful");
           }
         }
         catch (GithubAuthenticationException ex) {
-          GithubNotifications.showErrorDialog(myPane, "Can't login using given credentials: " + ex.getMessage(), "Login Failure");
+          GithubNotifications.showErrorDialog(myPane, "Login Failure", "Can't login using given credentials: " + ex.getMessage());
         }
         catch (IOException ex) {
           LOG.info(ex);
-          GithubNotifications.showErrorDialog(myPane, "Can't login: " + GithubUtil.getErrorTextFromException(ex), "Login Failure");
+          GithubNotifications.showErrorDialog(myPane, "Login Failure", "Can't login: " + GithubUtil.getErrorTextFromException(ex));
         }
       }
     });
