diff --git a/android/core/src/processing/android/core/GLModelParameters.java b/android/core/src/processing/android/core/GLModelParameters.java
index 2cdcdd7..a2ee713 100644
--- a/android/core/src/processing/android/core/GLModelParameters.java
+++ b/android/core/src/processing/android/core/GLModelParameters.java
@@ -1,12 +1,12 @@
 package processing.android.core;
 
 public class GLModelParameters implements GLConstants, PConstants {
-  GLModelParameters() {
+  public GLModelParameters() {
     updateMode = STATIC;    
     drawMode= POINTS;
   }
 
-   GLModelParameters(GLModelParameters src) {
+   public GLModelParameters(GLModelParameters src) {
     updateMode = src.updateMode;    
     drawMode= src.drawMode;
   }
