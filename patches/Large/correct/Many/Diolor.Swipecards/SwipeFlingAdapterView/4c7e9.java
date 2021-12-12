diff --git a/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java b/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java
index ad499fa..34d6d4f 100644
--- a/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java
+++ b/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java
@@ -113,7 +113,7 @@
 
         mInLayout = false;
         
-        if(adapterCount < MAX_VISIBLE) mFlingListener.onAdapterAboutToEmpty(adapterCount);
+        if(adapterCount < MIN_ADAPTER_STACK) mFlingListener.onAdapterAboutToEmpty(adapterCount);
     }
 
 
