diff --git a/packages/SettingsLib/tests/integ/src/com/android/settingslib/wifi/WifiTrackerTest.java b/packages/SettingsLib/tests/integ/src/com/android/settingslib/wifi/WifiTrackerTest.java
index f519a90..d4ce40c 100644
--- a/packages/SettingsLib/tests/integ/src/com/android/settingslib/wifi/WifiTrackerTest.java
+++ b/packages/SettingsLib/tests/integ/src/com/android/settingslib/wifi/WifiTrackerTest.java
@@ -465,9 +465,9 @@
     private void updateScoresAndWaitForAccessPointsChangedCallback() throws InterruptedException {
         // Updating scores can happen together or one after the other, so the latch countdown is set
         // to 2.
-        mAccessPointsChangedLatch = new CountDownLatch(3);
+        mAccessPointsChangedLatch = new CountDownLatch(2);
         updateScores();
-        assertTrue("onAccessPointChanged was not called three times",
+        assertTrue("onAccessPointChanged was not called twice",
             mAccessPointsChangedLatch.await(LATCH_TIMEOUT, TimeUnit.MILLISECONDS));
     }
 
