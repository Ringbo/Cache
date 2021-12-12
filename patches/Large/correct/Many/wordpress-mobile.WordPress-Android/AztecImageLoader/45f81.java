diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/services/AztecImageLoader.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/services/AztecImageLoader.java
index ecb851d..4637765 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/services/AztecImageLoader.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/services/AztecImageLoader.java
@@ -46,7 +46,7 @@
 
             @Override
             public void onErrorResponse(VolleyError error) {
-                callbacks.onImageLoadingFailed();
+                callbacks.onImageFailed();
             }
         }, maxWidth, 0);
     }
