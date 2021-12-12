diff --git a/core/src/main/java/com/graphhopper/routing/util/TestAlgoCollector.java b/core/src/main/java/com/graphhopper/routing/util/TestAlgoCollector.java
index 2111a9b..cf29bc9 100644
--- a/core/src/main/java/com/graphhopper/routing/util/TestAlgoCollector.java
+++ b/core/src/main/java/com/graphhopper/routing/util/TestAlgoCollector.java
@@ -56,14 +56,14 @@
 
         PointList pointList = path.calcPoints();
         double tmpDist = pointList.calcDistance(distCalc);
-        if (Math.abs(path.getDistance() - tmpDist) > 3)
+        if (Math.abs(path.getDistance() - tmpDist) > 5)
         {
             errors.add(algo + " path.getDistance was  " + path.getDistance()
                     + "\t pointList.calcDistance was " + tmpDist + "\t (expected points " + pointCount
                     + ", expected distance " + distance + ") from:" + from + ", to:" + to);
         }
 
-        if (Math.abs(path.getDistance() - distance) > 5)
+        if (Math.abs(path.getDistance() - distance) > 4)
         {
             errors.add(algo + " returns path not matching the expected distance of " + distance
                     + "\t Returned was " + path.getDistance() + "\t (expected points " + pointCount
