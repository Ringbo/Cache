diff --git a/library/src/androidTest/java/com/google/android/exoplayer/drm/DrmInitDataTest.java b/library/src/androidTest/java/com/google/android/exoplayer/drm/DrmInitDataTest.java
index af39352..83d9f93 100644
--- a/library/src/androidTest/java/com/google/android/exoplayer/drm/DrmInitDataTest.java
+++ b/library/src/androidTest/java/com/google/android/exoplayer/drm/DrmInitDataTest.java
@@ -71,7 +71,7 @@
     MoreAsserts.assertNotEqual(drmInitData, testInitData);
 
     // Different data in one of the tuples should affect equality.
-    testInitData = new DrmInitData(DATA_1, DATA_1);
+    testInitData = new DrmInitData(DATA_1, DATA_UNIVERSAL);
     MoreAsserts.assertNotEqual(drmInitData, testInitData);
   }
 
