diff --git a/LayoutPlugin/src/org/gephi/layout/plugin/rotate/ClockwiseRotate.java b/LayoutPlugin/src/org/gephi/layout/plugin/rotate/ClockwiseRotate.java
index 21af04d..e5e7914 100644
--- a/LayoutPlugin/src/org/gephi/layout/plugin/rotate/ClockwiseRotate.java
+++ b/LayoutPlugin/src/org/gephi/layout/plugin/rotate/ClockwiseRotate.java
@@ -38,7 +38,7 @@
     private ClockwiseRotateLayoutUI ui = new ClockwiseRotateLayoutUI();
 
     public Layout buildLayout() {
-        return new RotateLayout(this, -90);
+        return new RotateLayout(this, 90);
     }
 
     public String getName() {
