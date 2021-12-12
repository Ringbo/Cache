diff --git a/src/com/fsck/k9/activity/setup/AccountSetupOutgoing.java b/src/com/fsck/k9/activity/setup/AccountSetupOutgoing.java
index dec9b17..e075813 100644
--- a/src/com/fsck/k9/activity/setup/AccountSetupOutgoing.java
+++ b/src/com/fsck/k9/activity/setup/AccountSetupOutgoing.java
@@ -149,7 +149,7 @@
             mCurrentSecurityTypeViewPosition = settings.connectionSecurity.ordinal();
             mSecurityTypeView.setSelection(mCurrentSecurityTypeViewPosition, false);
 
-            if (settings.username != null) {
+            if (settings.username != null && !settings.username.isEmpty()) {
                 mUsernameView.setText(settings.username);
                 mRequireLoginView.setChecked(true);
                 mRequireLoginSettingsView.setVisibility(View.VISIBLE);
