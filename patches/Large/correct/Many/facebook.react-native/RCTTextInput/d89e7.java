diff --git a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
index 2319d8e..c76886b 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTTextInput.java
@@ -125,7 +125,8 @@
     super.onCollectExtraUpdates(uiViewOperationQueue);
     if (mJsEventCount != UNSET) {
       ReactTextUpdate reactTextUpdate =
-          new ReactTextUpdate(getText(), mJsEventCount, false, getPadding());
+          new ReactTextUpdate(getText(), mJsEventCount, false, getPadding(), Float.NaN);
+      // TODO: the Float.NaN should be replaced with the real line height see D3592781
       uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
     }
   }
