diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 5ac46f9..574e27f 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -8487,7 +8487,7 @@
         addEdge(i0, i1,  true, false);
         addEdge(i1, i2, false, false);
         addEdge(i2, i3, false,  false);
-        addEdge(i3, i0, false,  true);
+        addEdge(i3, i0, false, false);
         closeEdge(i3, i0);
       }
     }
