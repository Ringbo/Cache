diff --git a/OsmAnd/src/net/osmand/plus/views/Renderable.java b/OsmAnd/src/net/osmand/plus/views/Renderable.java
index db11f66..af13b65 100644
--- a/OsmAnd/src/net/osmand/plus/views/Renderable.java
+++ b/OsmAnd/src/net/osmand/plus/views/Renderable.java
@@ -117,7 +117,7 @@
                 if (culler != null) {
                     culler.cancel(true);
                 }
-                double cullDistance = Math.pow(2.0, base - zoom);
+                double cullDistance = Math.pow(2.0, base - newZoom);
                 culler = new AsynchronousResampler.RamerDouglasPeucer(this, cullDistance);
 
                 if (zoom < newZoom) {            // if line would look worse (we're zooming in) then...
