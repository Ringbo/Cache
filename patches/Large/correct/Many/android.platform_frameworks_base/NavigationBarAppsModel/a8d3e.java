diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarAppsModel.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarAppsModel.java
index d527f29..76a9798 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarAppsModel.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarAppsModel.java
@@ -179,7 +179,7 @@
             }
         }
 
-        Slog.e(TAG, "Activity doesn't have category Intent.CATEGORY_LAUNCHER " + component);
+        Slog.i(TAG, "Activity doesn't have category Intent.CATEGORY_LAUNCHER " + component);
         return null;
     }
 
