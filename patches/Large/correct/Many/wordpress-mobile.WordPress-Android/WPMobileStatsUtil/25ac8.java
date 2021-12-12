diff --git a/src/org/wordpress/android/util/WPMobileStatsUtil.java b/src/org/wordpress/android/util/WPMobileStatsUtil.java
index 39c6e6d..ae213b3 100644
--- a/src/org/wordpress/android/util/WPMobileStatsUtil.java
+++ b/src/org/wordpress/android/util/WPMobileStatsUtil.java
@@ -121,7 +121,7 @@
 
         // Register super properties
         boolean connected = WordPress.hasValidWPComCredentials(WordPress.getContext());
-        int numBlogs = WordPress.wpDB.getAccounts().size();
+        int numBlogs = WordPress.wpDB.getShownAccounts().size();
         try {
             JSONObject properties = new JSONObject();
             properties.put("platform", "Android");
