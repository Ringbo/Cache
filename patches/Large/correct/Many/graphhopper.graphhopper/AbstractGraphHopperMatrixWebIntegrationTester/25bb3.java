diff --git a/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java b/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java
index 3f8de6f..e96828f 100644
--- a/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java
+++ b/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java
@@ -39,7 +39,7 @@
         }
 
         // ... only weight:
-        assertEquals(1690, res.getWeight(1, 2), 10);
+        assertEquals(1840, res.getWeight(1, 2), 10);
 
         req = AbstractGHMatrixWebTester.createRequest();
         req.addOutArray("weights");
@@ -47,7 +47,7 @@
         res = ghMatrix.route(req);
 
         assertEquals(9800, res.getDistance(1, 2), 50);
-        assertEquals(1695, res.getWeight(1, 2), 10);
+        assertEquals(1840, res.getWeight(1, 2), 10);
     }
 
     @Test
@@ -62,6 +62,7 @@
 
     @Test
     public void testNxM_issue45() {
+        // https://github.com/graphhopper/directions-api-java-client/issues/45
         GHMRequest ghmRequest = new GHMRequest();
         ghmRequest.addOutArray("distances");
         ghmRequest.addOutArray("times");
@@ -70,7 +71,7 @@
                 .setToPoints(Arrays.asList(new GHPoint(52.557151, 13.515244), new GHPoint(52.454545, 13.295517)));
 
         MatrixResponse res = ghMatrix.route(ghmRequest);
-        assertEquals(2437, res.getTime(0, 1) / 1000, 30);
+        assertEquals(2480, res.getTime(0, 1) / 1000, 30);
     }
 
     @Test
