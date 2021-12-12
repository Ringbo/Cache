diff --git a/WordPress/src/main/java/org/wordpress/android/models/PostsListPost.java b/WordPress/src/main/java/org/wordpress/android/models/PostsListPost.java
index 87b43b8..305b9b8 100644
--- a/WordPress/src/main/java/org/wordpress/android/models/PostsListPost.java
+++ b/WordPress/src/main/java/org/wordpress/android/models/PostsListPost.java
@@ -45,7 +45,7 @@
 
         status = post.getPostStatus();
         isLocalDraft = post.isLocalDraft();
-        hasLocalChanges = post.hasChangedFromLocalDraftToPublished();
+        hasLocalChanges = post.isLocalChange();
         isUploading = post.isUploading();
 
         setDateCreatedGmt(post.getDate_created_gmt());
