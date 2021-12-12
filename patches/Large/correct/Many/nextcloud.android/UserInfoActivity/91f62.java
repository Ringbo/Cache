diff --git a/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java b/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java
index ddc9c5d..5ee470c 100644
--- a/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java
+++ b/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java
@@ -276,7 +276,7 @@
         }
         
         if (userInfo.getPhone() == null && userInfo.getEmail() == null && userInfo.getAddress() == null
-                && userInfo.getTwitter() == null & userInfo.getWebpage() == null) {
+                && userInfo.getTwitter() == null & userInfo.getWebsite() == null) {
 
             setErrorMessageForMultiList(getString(R.string.userinfo_no_info_headline),
                     getString(R.string.userinfo_no_info_text), R.drawable.ic_user);
@@ -296,7 +296,7 @@
         addToListIfNeeded(result, R.drawable.ic_phone, userInfo.getPhone(), R.string.user_info_phone);
         addToListIfNeeded(result, R.drawable.ic_email, userInfo.getEmail(), R.string.user_info_email);
         addToListIfNeeded(result, R.drawable.ic_map_marker, userInfo.getAddress(), R.string.user_info_address);
-        addToListIfNeeded(result, R.drawable.ic_web, DisplayUtils.beautifyURL(userInfo.getWebpage()),
+        addToListIfNeeded(result, R.drawable.ic_web, DisplayUtils.beautifyURL(userInfo.getWebsite()),
                     R.string.user_info_website);
         addToListIfNeeded(result, R.drawable.ic_twitter, DisplayUtils.beautifyTwitterHandle(userInfo.getTwitter()),
                     R.string.user_info_twitter);
