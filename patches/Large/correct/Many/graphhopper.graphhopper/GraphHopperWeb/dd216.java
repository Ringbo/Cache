diff --git a/web/src/main/java/com/graphhopper/http/GraphHopperWeb.java b/web/src/main/java/com/graphhopper/http/GraphHopperWeb.java
index 9d96c51..47e7eee 100644
--- a/web/src/main/java/com/graphhopper/http/GraphHopperWeb.java
+++ b/web/src/main/java/com/graphhopper/http/GraphHopperWeb.java
@@ -201,7 +201,7 @@
             JSONArray point = snappedPoints.getJSONArray(index);
             points.add(WebHelper.toGHPoint(point));
         }
-        pathWrapper.setPoints(points);
+        pathWrapper.setWaypoints(points);
 
         if (tmpCalcPoints)
         {
