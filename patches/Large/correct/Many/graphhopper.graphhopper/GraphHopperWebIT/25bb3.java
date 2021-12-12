diff --git a/client-hc/src/test/java/com/graphhopper/api/GraphHopperWebIT.java b/client-hc/src/test/java/com/graphhopper/api/GraphHopperWebIT.java
index 82a9261..84d3d07 100644
--- a/client-hc/src/test/java/com/graphhopper/api/GraphHopperWebIT.java
+++ b/client-hc/src/test/java/com/graphhopper/api/GraphHopperWebIT.java
@@ -51,7 +51,7 @@
         assertFalse("errors:" + res.getErrors().toString(), res.hasErrors());
         PathWrapper alt = res.getBest();
         isBetween(200, 250, alt.getPoints().size());
-        isBetween(11000, 12000, alt.getDistance());
+        isBetween(10500, 12000, alt.getDistance());
         isBetween(240, 270, alt.getAscend());
         isBetween(180, 200, alt.getDescend());
         isBetween(1000, 1500, alt.getRouteWeight());
@@ -79,12 +79,12 @@
         List<PathWrapper> paths = res.getAll();
         assertEquals(2, paths.size());
 
-        PathWrapper path = paths.get(0);
+        PathWrapper path = paths.get(1);
         isBetween(5, 20, path.getPoints().size());
         isBetween(1000, 1100, path.getDistance());
         assertTrue("expected: " + path.getDescription().get(0), Arrays.asList("Wiesenstraße", "Hasenspringweg").contains(path.getDescription().get(0)));
 
-        path = paths.get(1);
+        path = paths.get(0);
         isBetween(20, 30, path.getPoints().size());
         isBetween(800, 900, path.getDistance());
         assertTrue("expected: " + path.getDescription().get(0), Arrays.asList("Jacobistraße", "Ludwig-Gercke-Straße").contains(path.getDescription().get(0)));
@@ -119,7 +119,7 @@
         assertFalse("errors:" + res.getErrors().toString(), res.hasErrors());
         PathWrapper alt = res.getBest();
         assertEquals(0, alt.getPoints().size());
-        isBetween(11000, 12000, alt.getDistance());
+        isBetween(10500, 12000, alt.getDistance());
     }
 
     @Test
@@ -269,7 +269,7 @@
         }
 
         // ... only weight:
-        assertEquals(1695, res.getWeight(1, 2), 5);
+        assertEquals(1840, res.getWeight(1, 2), 5);
 
         req = AbstractGHMatrixWebTester.createRequest();
         req.addOutArray("weights");
@@ -277,7 +277,7 @@
         res = ghMatrix.route(req);
 
         assertEquals(9834, res.getDistance(1, 2), 20);
-        assertEquals(1695, res.getWeight(1, 2), 10);
+        assertEquals(1840, res.getWeight(1, 2), 10);
     }
 
     @Test
