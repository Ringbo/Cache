diff --git a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
index c8bfa3e..2319d8e 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
@@ -124,7 +124,8 @@
   public void onCollectExtraUpdates(UIViewOperationQueue uiViewOperationQueue) {
     super.onCollectExtraUpdates(uiViewOperationQueue);
     if (mJsEventCount != UNSET) {
-      ReactTextUpdate reactTextUpdate = new ReactTextUpdate(getText(), mJsEventCount, false);
+      ReactTextUpdate reactTextUpdate =
+          new ReactTextUpdate(getText(), mJsEventCount, false, getPadding());
       uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
     }
   }
