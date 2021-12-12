diff --git a/src/test/java/com/google/maps/RoadsApiIntegrationTest.java b/src/test/java/com/google/maps/RoadsApiIntegrationTest.java
index d30ac7b..b9c9752 100644
--- a/src/test/java/com/google/maps/RoadsApiIntegrationTest.java
+++ b/src/test/java/com/google/maps/RoadsApiIntegrationTest.java
@@ -67,7 +67,7 @@
       sc.assertParamValue(join('|', path), "path");
       sc.assertParamValue("false", "interpolate");
       assertEquals(7, points.length);
-      assertEquals(-33.865233402568428, points[0].location.lat, 0.0001);
+      assertEquals(-33.86523340256843, points[0].location.lat, 0.0001);
       assertEquals(151.19288612197704, points[0].location.lng, 0.0001);
       assertEquals("ChIJjXkMCDauEmsRp5xab4Ske6k", points[0].placeId);
     }
@@ -191,7 +191,7 @@
       assertEquals("/v1/nearestRoads", sc.path());
       sc.assertParamValue(join('|', path), "points");
       assertEquals(13, points.length);
-      assertEquals(-33.865436156120467, points[0].location.lat, 0.0001);
+      assertEquals(-33.86543615612047, points[0].location.lat, 0.0001);
       assertEquals(151.1930101572747, points[0].location.lng, 0.0001);
       assertEquals("ChIJ0XXACjauEmsRUduC5Wd9ARM", points[0].placeId);
     }
