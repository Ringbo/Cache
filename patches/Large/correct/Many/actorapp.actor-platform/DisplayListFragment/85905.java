diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java
index a588b3f..ec19775 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/fragment/DisplayListFragment.java
@@ -52,7 +52,7 @@
         collection.setAdapter(adapter);
 
         if (onScrollListener != null) {
-            collection.addOnScrollListener(onScrollListener);
+            collection.setOnScrollListener(onScrollListener);
         }
 
 //        if (emptyCollection != null) {
