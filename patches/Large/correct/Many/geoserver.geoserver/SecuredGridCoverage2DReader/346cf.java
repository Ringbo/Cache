diff --git a/src/main/src/main/java/org/geoserver/security/decorators/SecuredGridCoverage2DReader.java b/src/main/src/main/java/org/geoserver/security/decorators/SecuredGridCoverage2DReader.java
index 2bc047d..0c117ef 100644
--- a/src/main/src/main/java/org/geoserver/security/decorators/SecuredGridCoverage2DReader.java
+++ b/src/main/src/main/java/org/geoserver/security/decorators/SecuredGridCoverage2DReader.java
@@ -148,8 +148,7 @@
         GridCoverage2D grid = delegate.read(parameters);
 
         // crop if necessary
-        if (rasterFilter != null) {
-            
+        if (rasterFilter != null && grid != null) {
             Geometry coverageBounds = JTS.toGeometry((Envelope) new ReferencedEnvelope(grid.getEnvelope2D()));
             if(coverageBounds.intersects(rasterFilter)) {
                 final ParameterValueGroup param = cropParams.clone();
