diff --git a/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerAdapter.java
index 883969e..72d0c2a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerAdapter.java
@@ -41,7 +41,7 @@
     /*
      * used by this adapter to communicate with the owning fragment
      */
-    protected interface PhotoPickerAdapterListener {
+    interface PhotoPickerAdapterListener {
         void onItemTapped(Uri mediaUri);
         void onSelectedCountChanged(int count);
         void onAdapterLoaded(boolean isEmpty);
@@ -135,7 +135,7 @@
         }
     }
 
-    public boolean isEmpty() {
+    private boolean isEmpty() {
         return mMediaList.size() == 0;
     }
 
