diff --git a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
index 0cd455b..42a358f 100644
--- a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
+++ b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
@@ -389,13 +389,10 @@
                     neighboringCellInfo = cellInfoList;
                 } catch (InterruptedException e) {
                     // TODO: Add a more valuable message here!
-                    // normal
                 }
             }
         }
 
-        //commented because I got NPE here
-        // TODO: Who are you?? --EVA
         //log.debug(mTAG + ": neighbouringCellInfo size: " + neighboringCellInfo.size());
 
         // Add NC list to DBi_measure:nc_list
@@ -965,7 +962,7 @@
      *      See:  https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/wiki/Status-Icons
      *      and:  https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/issues/11#issuecomment-44670204
      *
-     *      Change names from "IDLE,NORMAL,MEDIUM,ALARM" to:"GRAY,GREEN,YELLOW,ORANGE,RED,BLACK",
+     *      Change names from "IDLE,OK,MEDIUM,ALARM" to:"GRAY,GREEN,YELLOW,ORANGE,RED,BLACK",
      *      to reflect detection Icon colors. They should be based on the detection scores here:
      *      <TBA>
      *
@@ -1007,7 +1004,7 @@
             Status.setCurrentStatus(Status.Type.MEDIUM, this.context, mVibrateEnabled, mVibrateMinThreatLevel);
             contentText = context.getString(R.string.cell_id_doesnt_exist_in_db);
         } else if (mTrackingFemtocell || mTrackingCell || mMonitoringCell) {
-            Status.setCurrentStatus(Status.Type.NORMAL, this.context, mVibrateEnabled, mVibrateMinThreatLevel);
+            Status.setCurrentStatus(Status.Type.OK, this.context, mVibrateEnabled, mVibrateMinThreatLevel);
             if (mTrackingFemtocell) {
                 contentText = context.getString(R.string.femtocell_detection_active);
             } else if (mTrackingCell) {
@@ -1025,7 +1022,7 @@
                 tickerText = context.getResources().getString(R.string.app_name_short) + " " + context.getString(R.string.status_idle);
                 break;
 
-            case NORMAL: // GREEN
+            case OK: // GREEN
                 tickerText = context.getResources().getString(R.string.app_name_short) + " " + context.getString(R.string.status_good);
                 break;
 
