diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java
index 1b11daa..6cec7e5 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/huami/amazfitbip/ActivityDetailsParser.java
@@ -140,7 +140,7 @@
             List<ActivityPoint> activityPointList = activityTrack.getTrackPoints();
             Date gpsStartTime = null;
             List<ActivityPoint> entriesToFixUp = new ArrayList<>();
-            while (pointer < activityPointList.size() + 1) {
+            while (pointer < activityPointList.size() - 1) {
                 ActivityPoint activityPoint = activityPointList.get(pointer);
                 if (activityPoint.getLocation() == null) {
                     pointer++;
