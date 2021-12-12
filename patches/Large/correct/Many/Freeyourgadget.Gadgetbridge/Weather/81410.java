diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/model/Weather.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/model/Weather.java
index f2c5a9c..1319db1 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/model/Weather.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/model/Weather.java
@@ -433,7 +433,7 @@
                 return 801;
             case 45:  //thundershowers
             case 47:  //isolated thundershowers
-                return 621;
+                return 211;
             case 3200:  //not available
             default:
                 return -1;
