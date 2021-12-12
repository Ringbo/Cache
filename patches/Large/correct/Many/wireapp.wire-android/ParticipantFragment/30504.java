diff --git a/app/src/main/java/com/waz/zclient/pages/main/participants/ParticipantFragment.java b/app/src/main/java/com/waz/zclient/pages/main/participants/ParticipantFragment.java
index 7800dc0..71f663c 100644
--- a/app/src/main/java/com/waz/zclient/pages/main/participants/ParticipantFragment.java
+++ b/app/src/main/java/com/waz/zclient/pages/main/participants/ParticipantFragment.java
@@ -774,7 +774,7 @@
             }
             return;
         }
-        Boolean isTeamSpace = ((BaseActivity) getActivity()).injectJava(UserAccountsController.class).isTeamSpace();
+        Boolean isTeamSpace = ((BaseActivity) getActivity()).injectJava(UserAccountsController.class).isTeamAccount();
         if (isTeamSpace) {
             showAcceptedUser(user);
         } else {
