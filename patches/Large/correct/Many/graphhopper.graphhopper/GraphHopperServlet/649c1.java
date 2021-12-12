diff --git a/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java b/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java
index 50dc2b7..b11b4b9 100644
--- a/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java
+++ b/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java
@@ -195,7 +195,7 @@
             return rsp.getInstructions().createGPX(trackName, time, includeElevation, withRoute, withTrack, withWayPoints);
     }
 
-    String errorsToXML( List<Throwable> list )
+    protected String errorsToXML( List<Throwable> list )
     {
         try
         {
