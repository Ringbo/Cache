diff --git a/media/java/android/media/update/MediaController2Provider.java b/media/java/android/media/update/MediaController2Provider.java
index 05790c1..71bc64a 100644
--- a/media/java/android/media/update/MediaController2Provider.java
+++ b/media/java/android/media/update/MediaController2Provider.java
@@ -52,7 +52,7 @@
     void prepareFromSearch_impl(String query, Bundle extras);
     void prepareMediaId_impl(String mediaId, Bundle extras);
     void playFromSearch_impl(String query, Bundle extras);
-    void playFromUri_impl(String uri, Bundle extras);
+    void playFromUri_impl(Uri uri, Bundle extras);
     void playFromMediaId_impl(String mediaId, Bundle extras);
 
     void setRating_impl(Rating2 rating);
