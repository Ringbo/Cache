diff --git a/datetimepicker-library/src/com/sleepbot/datetimepicker/time/RadialPickerLayout.java b/datetimepicker-library/src/com/sleepbot/datetimepicker/time/RadialPickerLayout.java
index 09f372f..3794a30 100644
--- a/datetimepicker-library/src/com/sleepbot/datetimepicker/time/RadialPickerLayout.java
+++ b/datetimepicker-library/src/com/sleepbot/datetimepicker/time/RadialPickerLayout.java
@@ -530,8 +530,9 @@
             return;
         }
         
-        //NineOldDroids does not work in this case due to denepency recursion. 
-        animate = animate && Build.VERSION.SDK_INT >= 14; 
+        //NineOldDroids does not work in this case due to dependency recursion.
+        //Don't animate on API 14
+        animate = animate && Build.VERSION.SDK_INT > 14;
 
         int lastIndex = getCurrentItemShowing();
         mCurrentItemShowing = index;
