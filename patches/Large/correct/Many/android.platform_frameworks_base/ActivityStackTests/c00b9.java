diff --git a/services/tests/servicestests/src/com/android/server/am/ActivityStackTests.java b/services/tests/servicestests/src/com/android/server/am/ActivityStackTests.java
index 01425ed..e2b7c06 100644
--- a/services/tests/servicestests/src/com/android/server/am/ActivityStackTests.java
+++ b/services/tests/servicestests/src/com/android/server/am/ActivityStackTests.java
@@ -382,7 +382,7 @@
         final TestActivityStack fullscreenStack2 = createStackForShouldBeVisibleTest(
                 mDefaultDisplay, WINDOWING_MODE_FULLSCREEN, ACTIVITY_TYPE_STANDARD,
                 true /* onTop */);
-        final TestActivityStack pinnedStack = createStackForShouldBeVisibleTest(mDefaultDisplay,
+        final ActivityStack pinnedStack = createStackForShouldBeVisibleTest(mDefaultDisplay,
                 WINDOWING_MODE_PINNED, ACTIVITY_TYPE_STANDARD, true /* onTop */);
 
         homeStack.setIsTranslucent(false);
