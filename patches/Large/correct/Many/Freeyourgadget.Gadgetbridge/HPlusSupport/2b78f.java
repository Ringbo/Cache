diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
index 8914f19..181b812 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
@@ -653,11 +653,11 @@
             String message = "";
 
             if (title != null) {
-                if (title.length() > 12) {
+                if (title.length() > 17) {
                     message = title.substring(0, 12);
                 } else {
                     message = title;
-                    for (int i = message.length(); i < 12; i++)
+                    for (int i = message.length(); i < 17; i++)
                         message += " ";
                 }
             }
