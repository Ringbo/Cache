diff --git a/WordPress/src/main/java/org/wordpress/android/ui/stats/models/InsightsLatestPostModel.java b/WordPress/src/main/java/org/wordpress/android/ui/stats/models/InsightsLatestPostModel.java
index 6c3eb2e..1fefe15 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/stats/models/InsightsLatestPostModel.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/stats/models/InsightsLatestPostModel.java
@@ -41,7 +41,7 @@
         this.mPostURL = firstPostObject.getString("URL");
         this.mPostLikeCount = firstPostObject.getInt("like_count");
 
-        JSONObject discussionObject = response.optJSONObject("discussion");
+        JSONObject discussionObject = firstPostObject.optJSONObject("discussion");
         if (discussionObject != null) {
             this.mPostCommentCount = discussionObject.optInt("comment_count", 0);
         }
