diff --git a/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java b/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java
index c92f398..92ec9d6 100644
--- a/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java
+++ b/client-hc/src/test/java/com/graphhopper/api/AbstractGraphHopperMatrixWebIntegrationTester.java
@@ -56,7 +56,7 @@
         req.addOutArray("times");
 
         MatrixResponse res = ghMatrix.route(req);
-        assertEquals(2350, res.getTime(1, 2) / 1000, 50);
+        assertEquals(2495, res.getTime(1, 2) / 1000, 50);
     }
 
     @Test
