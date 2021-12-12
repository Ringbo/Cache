diff --git a/h2/src/main/org/h2/value/ValueGeometry.java b/h2/src/main/org/h2/value/ValueGeometry.java
index 73fe5be..49a28b4 100644
--- a/h2/src/main/org/h2/value/ValueGeometry.java
+++ b/h2/src/main/org/h2/value/ValueGeometry.java
@@ -167,7 +167,7 @@
      *
      * @return a copy of the geometry object
      */
-    public Object getGeometry() {
+    public Geometry getGeometry() {
         if (geometry == null) {
             try {
                 geometry = JTSUtils.ewkb2geometry(bytes, getDimensionSystem());
