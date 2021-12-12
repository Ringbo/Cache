diff --git a/WordPress/src/main/java/org/wordpress/android/ui/prefs/DotComSiteSettings.java b/WordPress/src/main/java/org/wordpress/android/ui/prefs/DotComSiteSettings.java
index 2be1a11..2da2689 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/prefs/DotComSiteSettings.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/prefs/DotComSiteSettings.java
@@ -586,7 +586,7 @@
             params.put("protect", mJpSettings.jetpackProtectEnabled);
         }
         if (!mJpSettings.whitelistMatches(mRemoteJpSettings.jetpackProtectWhitelist)) {
-            JSONArray whitelistArray = new JSONArray(mJpSettings.jetpackProtectWhitelist);
+            String whitelistArray = mJpSettings.jetpackProtectWhitelist.toString().replace("[", "").replace("]", "");
             params.put("jetpack_protect_global_whitelist", whitelistArray);
         }
         if (mJpSettings.ssoActive != mRemoteJpSettings.ssoActive) {
