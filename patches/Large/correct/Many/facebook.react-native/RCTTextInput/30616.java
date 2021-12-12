diff --git a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
index 63582ca..601bd2d 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
@@ -128,7 +128,7 @@
     super.onCollectExtraUpdates(uiViewOperationQueue);
     if (mJsEventCount != UNSET) {
       ReactTextUpdate reactTextUpdate =
-          new ReactTextUpdate(getText(), mJsEventCount, false, getPadding(), Float.NaN, UNSET);
+          new ReactTextUpdate(getText(), mJsEventCount, false, getPadding(), UNSET);
       // TODO: the Float.NaN should be replaced with the real line height see D3592781
       uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
     }
