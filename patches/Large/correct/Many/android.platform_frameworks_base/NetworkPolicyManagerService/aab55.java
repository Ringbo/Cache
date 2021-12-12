diff --git a/services/java/com/android/server/net/NetworkPolicyManagerService.java b/services/java/com/android/server/net/NetworkPolicyManagerService.java
index 9067fae..0da5cc6 100644
--- a/services/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -572,8 +572,7 @@
         switch (type) {
             case TYPE_WARNING: {
                 final CharSequence title = res.getText(R.string.data_usage_warning_title);
-                final CharSequence body = res.getString(R.string.data_usage_warning_body,
-                        Formatter.formatFileSize(mContext, policy.warningBytes));
+                final CharSequence body = res.getString(R.string.data_usage_warning_body);
 
                 builder.setSmallIcon(R.drawable.ic_menu_info_details);
                 builder.setTicker(title);
