diff --git a/jme3-core/src/main/java/com/jme3/math/Spline.java b/jme3-core/src/main/java/com/jme3/math/Spline.java
index dccab99..041baa0ba 100644
--- a/jme3-core/src/main/java/com/jme3/math/Spline.java
+++ b/jme3-core/src/main/java/com/jme3/math/Spline.java
@@ -316,7 +316,7 @@
      */
     public void setCurveTension(float curveTension) {
         this.curveTension = curveTension;
-        if(type==SplineType.CatmullRom) {
+        if(type==SplineType.CatmullRom && !getControlPoints().isEmpty()) {            
         	this.computeTotalLentgh();
         }
     }
