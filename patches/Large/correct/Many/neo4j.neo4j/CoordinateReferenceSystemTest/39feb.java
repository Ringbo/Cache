diff --git a/community/values/src/test/java/org/neo4j/values/storable/CoordinateReferenceSystemTest.java b/community/values/src/test/java/org/neo4j/values/storable/CoordinateReferenceSystemTest.java
index 759b3ac..d634af2 100644
--- a/community/values/src/test/java/org/neo4j/values/storable/CoordinateReferenceSystemTest.java
+++ b/community/values/src/test/java/org/neo4j/values/storable/CoordinateReferenceSystemTest.java
@@ -116,7 +116,7 @@
         PointValue malmo = geo( 12.994341, 55.611784, 0.0 );
         PointValue malmoHigh = geo( 12.994341, 55.611784, 1000.0 );
         double expected = 27842.0;
-        double expectedHigh = 27860.0;
+        double expectedHigh = 27862.0;
         assertThat( "3D distance should match", crs.getCalculator().distance( cph, malmo ), closeTo( expected, 0.1 ) );
         assertThat( "3D distance should match", crs.getCalculator().distance( cph, malmoHigh ), closeTo( expectedHigh, 0.2 ) );
         assertThat( "3D distance should match", crs.getCalculator().distance( cphHigh, malmo ), closeTo( expectedHigh, 0.2 ) );
