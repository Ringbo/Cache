diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/UserInfo.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/UserInfo.java
index cccb2d7..48439da 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/UserInfo.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/UserInfo.java
@@ -5,9 +5,6 @@
 
 import java.util.Arrays;
 
-/**
- * Created by UgoRaffaele on 30/01/2015.
- */
 public class UserInfo {
 
     private final String btAddress;
@@ -62,7 +59,7 @@
     }
 
     private int calculateUidFrom(String alias) {
-        int uid = 0;
+        int uid;
         try {
             uid = Integer.parseInt(alias);
         } catch (NumberFormatException ex) {
@@ -87,7 +84,7 @@
         sequence[8] = (byte) (type & 0xff);
 
         int aliasFrom = 9;
-        if (mDeviceInfo.isMili1A()) {
+        if (mDeviceInfo.isMili1A() || mDeviceInfo.isMilli1S()) {
             sequence[9] = (byte) (mDeviceInfo.feature & 255);
             sequence[10] = (byte) (mDeviceInfo.appearance & 255);
             aliasFrom = 11;
