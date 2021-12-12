diff --git a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
index b2f2bb4..ba002a0 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
@@ -129,7 +129,7 @@
     super.onCollectExtraUpdates(uiViewOperationQueue);
     if (mJsEventCount != UNSET) {
       ReactTextUpdate reactTextUpdate =
-          new ReactTextUpdate(getText(), mJsEventCount, false, getPadding(), UNSET);
+          new ReactTextUpdate(getText(), mJsEventCount, false, getPadding(), Float.NaN, UNSET);
       // TODO: the Float.NaN should be replaced with the real line height see D3592781
       uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
     }
