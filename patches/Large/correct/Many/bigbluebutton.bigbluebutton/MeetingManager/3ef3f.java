diff --git a/bbb-video/src/main/java/org/bigbluebutton/app/video/MeetingManager.java b/bbb-video/src/main/java/org/bigbluebutton/app/video/MeetingManager.java
index 37adc93..88d6079 100755
--- a/bbb-video/src/main/java/org/bigbluebutton/app/video/MeetingManager.java
+++ b/bbb-video/src/main/java/org/bigbluebutton/app/video/MeetingManager.java
@@ -22,7 +22,7 @@
         } else {
             Meeting nm = new Meeting(meetingId);
             nm.addStream(vs);
-            add(m);
+            add(nm);
         }
     }
 
