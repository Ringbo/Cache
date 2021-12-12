diff --git a/ReactAndroid/src/main/java/com/facebook/react/ReactRootView.java b/ReactAndroid/src/main/java/com/facebook/react/ReactRootView.java
index 1aea191..082c7fe 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/ReactRootView.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/ReactRootView.java
@@ -259,7 +259,7 @@
       mIsAttachedToInstance = false;
       mRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
     }
-    mShouldLogContentAppeared = true;
+    mShouldLogContentAppeared = false;
   }
 
   public void onAttachedToReactInstance() {
