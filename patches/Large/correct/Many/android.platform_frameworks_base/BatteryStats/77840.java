diff --git a/core/java/android/os/BatteryStats.java b/core/java/android/os/BatteryStats.java
index 8b3ecae..508fdee 100644
--- a/core/java/android/os/BatteryStats.java
+++ b/core/java/android/os/BatteryStats.java
@@ -4415,7 +4415,7 @@
         if (!checkin) {
             pw.println(header);
         }
-        String[] lineArgs = new String[4];
+        String[] lineArgs = new String[5];
         for (int i=0; i<count; i++) {
             long duration = steps.getDurationAt(i);
             int level = steps.getLevelAt(i);
@@ -4430,7 +4430,7 @@
                         case Display.STATE_ON: lineArgs[2] = "s+"; break;
                         case Display.STATE_DOZE: lineArgs[2] = "sd"; break;
                         case Display.STATE_DOZE_SUSPEND: lineArgs[2] = "sds"; break;
-                        default: lineArgs[1] = "?"; break;
+                        default: lineArgs[2] = "?"; break;
                     }
                 } else {
                     lineArgs[2] = "";
@@ -4441,9 +4441,9 @@
                     lineArgs[3] = "";
                 }
                 if ((modMode&STEP_LEVEL_MODE_DEVICE_IDLE) == 0) {
-                    lineArgs[3] = (initMode&STEP_LEVEL_MODE_DEVICE_IDLE) != 0 ? "i+" : "i-";
+                    lineArgs[4] = (initMode&STEP_LEVEL_MODE_DEVICE_IDLE) != 0 ? "i+" : "i-";
                 } else {
-                    lineArgs[3] = "";
+                    lineArgs[4] = "";
                 }
                 dumpLine(pw, 0 /* uid */, "i" /* category */, header, (Object[])lineArgs);
             } else {
@@ -4459,7 +4459,7 @@
                         case Display.STATE_ON: pw.print("screen-on"); break;
                         case Display.STATE_DOZE: pw.print("screen-doze"); break;
                         case Display.STATE_DOZE_SUSPEND: pw.print("screen-doze-suspend"); break;
-                        default: lineArgs[1] = "screen-?"; break;
+                        default: pw.print("screen-?"); break;
                     }
                     haveModes = true;
                 }
