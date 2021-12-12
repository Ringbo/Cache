diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
index 4797ce5..ece3eb0 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
@@ -722,7 +722,7 @@
 
             byte[] msg = new byte[20];
             for (int i = 0; i < msg.length; i++)
-                msg[i] = 32;
+                msg[i] = ' ';
 
             msg[0] = HPlusConstants.COMMAND_ACTION_DISPLAY_TEXT;
 
@@ -730,7 +730,7 @@
 
             if (title != null) {
                 if (title.length() > 17) {
-                    message = title.substring(0, 12);
+                    message = title.substring(0, 17);
                 } else {
                     message = title;
                     for (int i = message.length(); i < 17; i++)
@@ -764,7 +764,7 @@
 
                     msg = msg.clone();
                     for (i = 3; i < msg.length; i++)
-                        msg[i] = 32;
+                        msg[i] = ' ';
 
                     if (message_index < remaining)
                         i = 3;
