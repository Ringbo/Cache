diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderSubsActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderSubsActivity.java
index 0b98136..dafdaee 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderSubsActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderSubsActivity.java
@@ -187,7 +187,8 @@
 
         ReaderUpdateService.startService(this,
                 EnumSet.of(UpdateTask.TAGS,
-                           UpdateTask.FOLLOWED_BLOGS));
+                           UpdateTask.FOLLOWED_BLOGS,
+                           UpdateTask.RECOMMENDED_BLOGS));
 
         mHasPerformedUpdate = true;
     }
