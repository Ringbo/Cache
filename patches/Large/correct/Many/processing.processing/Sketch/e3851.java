diff --git a/app/src/processing/app/Sketch.java b/app/src/processing/app/Sketch.java
index 9b57164..febe2cd 100644
--- a/app/src/processing/app/Sketch.java
+++ b/app/src/processing/app/Sketch.java
@@ -678,7 +678,7 @@
         setCurrentCode(0);
 
         // update the tabs
-        editor.repaintHeader();
+        editor.rebuildHeader();
       }
     }
   }
