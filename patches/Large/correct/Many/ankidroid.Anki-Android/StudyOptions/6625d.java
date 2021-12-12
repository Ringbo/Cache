diff --git a/src/com/ichi2/anki/StudyOptions.java b/src/com/ichi2/anki/StudyOptions.java
index 670769e..69cfc11 100644
--- a/src/com/ichi2/anki/StudyOptions.java
+++ b/src/com/ichi2/anki/StudyOptions.java
@@ -242,7 +242,7 @@
     */    
 	private GestureDetector gestureDetector;
 	View.OnTouchListener gestureListener;
-	public static int sSwipeMinDistance = 150;
+	public static int sSwipeMinDistance = 100;
 	public static int sSwipeMaxOffPath = 70;
 	public static int sSwipeThresholdVelocity = 200;
 
@@ -1481,7 +1481,7 @@
             mNewVersion = true;
         }
 
-        sSwipeMinDistance = preferences.getInt("swipe_sensibility", 100);
+        sSwipeMinDistance = preferences.getInt("swipeSensibility", 100);
         if (sSwipeMinDistance != 100) {
         	sSwipeMaxOffPath = (int) (sSwipeMinDistance * 100 / 70);
         	sSwipeThresholdVelocity = (int) (sSwipeMinDistance * 2);
