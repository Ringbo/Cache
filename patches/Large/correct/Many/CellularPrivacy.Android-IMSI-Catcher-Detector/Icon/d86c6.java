diff --git a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Icon.java b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Icon.java
index 3407110..9103a3b 100644
--- a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Icon.java
+++ b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Icon.java
@@ -26,8 +26,6 @@
      */
     // TODO: Seem we're missing the other colors here: ORANGE and BLACK (skull)
     // See: https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/wiki/Status-Icons
-    // Change names from "IDLE,NORMAL,MEDIUM,ALARM" to:"GRAY,GREEN,YELLOW,ORANGE,RED,BLACK",
-    // to reflect detection Icon colors.
     // Dependencies:  Status.java, CellTracker.java, Icon.java ( + others?)
     // They should be based on the detection scores here: <TBA>
     // -- E:V:A 2015-01-19
@@ -38,7 +36,7 @@
                     case IDLE:
                         return R.drawable.flat_idle;
 
-                    case NORMAL:
+                    case OK:
                         return R.drawable.flat_ok;
 
                     case MEDIUM:
@@ -56,7 +54,7 @@
                     case IDLE:
                         return R.drawable.sense_idle;
 
-                    case NORMAL:
+                    case OK:
                         return R.drawable.sense_ok;
 
                     case MEDIUM:
@@ -74,7 +72,7 @@
                     case IDLE:
                         return R.drawable.white_idle;
 
-                    case NORMAL:
+                    case OK:
                         return R.drawable.white_ok;
 
                     case MEDIUM:
