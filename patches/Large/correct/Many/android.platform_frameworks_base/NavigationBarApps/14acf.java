diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java
index 86f8f5a..4ac2c31 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarApps.java
@@ -812,7 +812,7 @@
                     removeCallbacks(mShowMenuCallback);
                     break;
             }
-            return true;
+            return false;
         }
     }
 
