diff --git a/src/test/java/com/google/maps/DirectionsApiTest.java b/src/test/java/com/google/maps/DirectionsApiTest.java
index 415d4ca..ee26cd7 100644
--- a/src/test/java/com/google/maps/DirectionsApiTest.java
+++ b/src/test/java/com/google/maps/DirectionsApiTest.java
@@ -349,7 +349,7 @@
         .await();
     assertNotNull(result);
     assertEquals("//maps.gstatic.com/mapfiles/transit/iw2/6/fr-paris-metro.png",
-        result.routes[0].legs[0].steps[0].transitDetails.line.vehicle.localIcon);
+        result.routes[0].legs[0].steps[1].transitDetails.line.vehicle.localIcon);
   }
 
 }
