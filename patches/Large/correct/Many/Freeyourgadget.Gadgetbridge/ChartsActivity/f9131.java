diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/charts/ChartsActivity.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/charts/ChartsActivity.java
index fae68b9..115d835 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/charts/ChartsActivity.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/charts/ChartsActivity.java
@@ -343,7 +343,7 @@
         @Override
         public int getCount() {
             // Show 5 total pages.
-            return 6;
+            return 5; // hide "Speed Zones" for now
         }
 
         @Override
