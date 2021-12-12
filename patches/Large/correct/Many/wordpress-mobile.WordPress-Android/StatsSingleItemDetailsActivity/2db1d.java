diff --git a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsSingleItemDetailsActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsSingleItemDetailsActivity.java
index c30164f..9be0ced 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsSingleItemDetailsActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsSingleItemDetailsActivity.java
@@ -182,7 +182,7 @@
             if (savedInstanceState.containsKey(ARG_YEARS_EXPANDED_ROWS)) {
                 mYearsIdToExpandedMap = savedInstanceState.getParcelable(ARG_YEARS_EXPANDED_ROWS);
             }
-        } else if (getIntent() != null) {
+        } else if (getIntent() != null && getIntent().getExtras() != null) {
             Bundle extras = getIntent().getExtras();
             mRemoteItemID = extras.getString(ARG_REMOTE_ITEM_ID);
             mRemoteBlogID = extras.getString(ARG_REMOTE_BLOG_ID);
