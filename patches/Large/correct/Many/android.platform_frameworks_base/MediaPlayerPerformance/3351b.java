diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/performance/MediaPlayerPerformance.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/performance/MediaPlayerPerformance.java
index 1c60401..be12c7f 100644
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/performance/MediaPlayerPerformance.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/performance/MediaPlayerPerformance.java
@@ -328,7 +328,15 @@
             Log.v(TAG, e.toString());
         }
         String[] poList = memoryUsage.split("\r|\n|\r\n");
-        String memusage = poList[1].concat("\n");
+        // A new media.log is enabled with ro.test_harness is set.
+        // The output of "ps mediaserver" will include the
+        // media.log process in the first line. Update the parsing
+        // to only read the thrid line.
+        // Smaple ps mediaserver output:
+        // USER     PID   PPID  VSIZE  RSS     WCHAN    PC         NAME
+        // media     131   1     13676  4796  ffffffff 400b1bd0 S media.log
+        // media     219   131   37768  6892  ffffffff 400b236c S /system/bin/mediaserver
+        String memusage = poList[2].concat("\n");
         return memusage;
     }
 
