diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java
index 1c815c1..a588b3f 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java
@@ -118,7 +118,7 @@
     public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
         this.onScrollListener = onScrollListener;
         if (collection != null) {
-            collection.addOnScrollListener(onScrollListener);
+            collection.setOnScrollListener(onScrollListener);
         }
     }
 
