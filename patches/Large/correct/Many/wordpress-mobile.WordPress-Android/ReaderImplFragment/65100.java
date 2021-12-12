diff --git a/src/org/wordpress/android/ui/reader/ReaderImplFragment.java b/src/org/wordpress/android/ui/reader/ReaderImplFragment.java
index f267094..6c3383e 100644
--- a/src/org/wordpress/android/ui/reader/ReaderImplFragment.java
+++ b/src/org/wordpress/android/ui/reader/ReaderImplFragment.java
@@ -218,7 +218,7 @@
         @Override
         protected Void doInBackground(Void... args) {
 
-            if ( !WordPress.hasValidWPComCredentials(getActivity().getApplicationContext()) ){
+            if (getActivity() == null || !WordPress.hasValidWPComCredentials(getActivity().getApplicationContext()) ){
                 return null;
             }
             
