diff --git a/h2/src/main/org/h2/value/ValueGeometry.java b/h2/src/main/org/h2/value/ValueGeometry.java
index 34ca035..5bdf9ca 100644
--- a/h2/src/main/org/h2/value/ValueGeometry.java
+++ b/h2/src/main/org/h2/value/ValueGeometry.java
@@ -279,7 +279,7 @@
      * @return the well-known-text
      */
     public String getWKT() {
-        return new WKTWriter().write(getGeometryNoCopy());
+        return new WKTWriter(3).write(getGeometryNoCopy());
     }
 
     /**
