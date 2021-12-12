diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBand2Service.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBand2Service.java
index b52a7b7..3bb2eb8 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBand2Service.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBand2Service.java
@@ -101,7 +101,7 @@
     /**
      * In some logs it's 0x0...
      */
-    public static final byte AUTH_BYTE = 0x8;
+    public static final byte AUTH_BYTE = 0x00;
 
     // maybe not really activity data, but steps?
     public static final byte COMMAND_FETCH_DATA = 0x02;
