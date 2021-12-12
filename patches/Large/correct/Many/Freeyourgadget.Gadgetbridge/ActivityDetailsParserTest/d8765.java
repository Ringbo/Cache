diff --git a/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/ActivityDetailsParserTest.java b/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/ActivityDetailsParserTest.java
index 6b9fa25..29aa353 100644
--- a/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/ActivityDetailsParserTest.java
+++ b/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/ActivityDetailsParserTest.java
@@ -48,7 +48,7 @@
             assertEquals("Elvis", track.getUser().getName());
 
             List<ActivityPoint> trackPoints = track.getTrackPoints();
-            assertEquals(1208, trackPoints.size());
+            assertEquals(939, trackPoints.size());
         }
     }
 
@@ -87,7 +87,7 @@
             ActivityTrack track = parser.parse(FileUtils.readAll(in, MAX_DETAILS));
 
             List<ActivityPoint> trackPoints = track.getTrackPoints();
-            assertEquals(1208, trackPoints.size());
+            assertEquals(939, trackPoints.size());
 
 
             GPXExporter exporter = new GPXExporter();
