diff --git a/ReactAndroid/src/main/java/com/facebook/react/uimanager/events/Event.java b/ReactAndroid/src/main/java/com/facebook/react/uimanager/events/Event.java
index d54e6ab..4da9ed7 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/uimanager/events/Event.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/uimanager/events/Event.java
@@ -39,7 +39,7 @@
    */
   protected void init(int viewTag) {
     mViewTag = viewTag;
-    mTimestampMs = SystemClock.nanoTime();
+    mTimestampMs = SystemClock.uptimeMillis();
     mInitialized = true;
   }
 
