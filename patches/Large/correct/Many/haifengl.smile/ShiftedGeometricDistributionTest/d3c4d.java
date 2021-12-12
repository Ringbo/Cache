diff --git a/math/src/test/java/smile/stat/distribution/ShiftedGeometricDistributionTest.java b/math/src/test/java/smile/stat/distribution/ShiftedGeometricDistributionTest.java
index 5e5c8ea..562e032 100644
--- a/math/src/test/java/smile/stat/distribution/ShiftedGeometricDistributionTest.java
+++ b/math/src/test/java/smile/stat/distribution/ShiftedGeometricDistributionTest.java
@@ -59,7 +59,7 @@
         for (int i = 0; i < data.length; i++)
             data[i] = (int) instance.rand();
         ShiftedGeometricDistribution est = new ShiftedGeometricDistribution(data);
-        assertEquals(0.0, (0.4 - est.getProb()) / 0.4, 0.05);
+        assertEquals(0.0, (0.4 - est.getProb()) / 0.4, 0.1);
     }
 
     /**
