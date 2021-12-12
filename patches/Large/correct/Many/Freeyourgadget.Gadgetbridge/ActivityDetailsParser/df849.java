diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java
index 3ddb2f9..1b11daa 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java
@@ -134,7 +134,7 @@
         return activityTrack;
     }
 
-    private void fixupMissingTimestamps(ActivityTrack activityTrack) throws GBException {
+    private void fixupMissingTimestamps(ActivityTrack activityTrack) {
         try {
             int pointer = 0;
             List<ActivityPoint> activityPointList = activityTrack.getTrackPoints();
@@ -168,7 +168,7 @@
                 }
             }
         } catch (Exception ex) {
-            throw new GBException("Error cleaning activity details: " + ex.getMessage(), ex);
+            LOG.warn("Error cleaning activity details", ex);
         }
     }
 
