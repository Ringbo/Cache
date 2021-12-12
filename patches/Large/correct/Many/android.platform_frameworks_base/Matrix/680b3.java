diff --git a/tools/layoutlib/bridge/src/android/graphics/Matrix.java b/tools/layoutlib/bridge/src/android/graphics/Matrix.java
index 3f9a993..18c0e17 100644
--- a/tools/layoutlib/bridge/src/android/graphics/Matrix.java
+++ b/tools/layoutlib/bridge/src/android/graphics/Matrix.java
@@ -179,7 +179,7 @@
         mValues[5] = dy;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
     }
 
     /**
@@ -200,7 +200,7 @@
         mValues[5] = -py;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
 
         // scale
         addTransform(new float[] { sx, 0, 0, 0, sy, 0, 0, 0, 1 });
@@ -219,7 +219,7 @@
         mValues[5] = 0;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
     }
 
     /**
@@ -240,7 +240,7 @@
         mValues[5] = -py;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
 
         // scale
         double rad = Math.toRadians(degrees);
@@ -268,7 +268,7 @@
         mValues[5] = 0;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
     }
 
     /**
@@ -289,7 +289,7 @@
         mValues[5] = -py;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
 
         // scale
         addTransform(new float[] { cosValue, -sinValue, 0, sinValue, cosValue, 0, 0, 0, 1 }); 
@@ -308,7 +308,7 @@
         mValues[5] = 0;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
     }
 
     /**
@@ -329,7 +329,7 @@
         mValues[5] = -py;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
 
         // scale
         addTransform(new float[] { 1, kx, 0, ky, 1, 0, 0, 0, 1 });
@@ -348,7 +348,7 @@
         mValues[5] = 0;
         mValues[6] = 0;
         mValues[7] = 0;
-        mValues[7] = 1;
+        mValues[8] = 1;
     }
 
     /**
