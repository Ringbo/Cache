diff --git a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Status.java b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Status.java
index 3764d10..368367d 100644
--- a/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Status.java
+++ b/AIMSICD/src/main/java/com/SecUpwN/AIMSICD/utils/Status.java
@@ -18,8 +18,6 @@
 public class Status {
     // TODO: Seem we're missing the other colors here: ORANGE and BLACK (skull)
     // See: https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/wiki/Status-Icons
-    // Change names from "IDLE,NORMAL,MEDIUM,ALARM" to:"GRAY,GREEN,YELLOW,ORANGE,RED,BLACK",
-    // to reflect detection Icon colors.
     // Dependencies:  Status.java, CellTracker.java, Icon.java ( + others?)
     // They should be based on the detection scores here: <TBA>
     // -- E:V:A 2015-01-19
@@ -27,11 +25,11 @@
 
     public enum Type {
         ALARM(3), // Which is this?
-        // RUN, // BLACK
+        // SKUL, // BLACK
         // DANGEROUS, // RED
         // HIGH, // ORANGE
         MEDIUM(2), // YELLOW
-        NORMAL(1), // GREEN
+        OK(1), // GREEN
         IDLE(0); // GREY
 
         // Added for sake of deciding if current level is
