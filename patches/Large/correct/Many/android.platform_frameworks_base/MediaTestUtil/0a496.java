diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/MediaTestUtil.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/MediaTestUtil.java
index a80fc13..53eb990 100644
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/MediaTestUtil.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/MediaTestUtil.java
@@ -101,7 +101,9 @@
             Log.v(TAG, e.toString());
         }
         String[] poList = memoryUsage.split("\r|\n|\r\n");
-        String memusage = poList[1].concat("\n");
+        // Skip the first two lines since there
+        // is a new media.log introudced recently.
+        String memusage = poList[2].concat("\n");
         return memusage;
     }
 
