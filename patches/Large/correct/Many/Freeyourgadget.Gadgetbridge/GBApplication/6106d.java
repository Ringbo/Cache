diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/GBApplication.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/GBApplication.java
index c3e7d44..294ca36 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/GBApplication.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/GBApplication.java
@@ -156,7 +156,7 @@
                 return true;
             }
         }
-        return true;
+        return false;
     }
 
     public static void setupLogging(boolean enabled) {
