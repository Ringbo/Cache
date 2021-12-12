diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
index 54fd18c..da76d7c 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/hplus/HPlusSupport.java
@@ -208,7 +208,7 @@
     }
 
     private HPlusSupport setCurrentDate(TransactionBuilder transaction) {
-        Calendar c = GregorianGregorianCalendar.getInstance();
+        Calendar c = GregorianCalendar.getInstance();
         int year = c.get(Calendar.YEAR) - 1900;
         int month = c.get(Calendar.MONTH);
         int day = c.get(Calendar.DAY_OF_MONTH);
