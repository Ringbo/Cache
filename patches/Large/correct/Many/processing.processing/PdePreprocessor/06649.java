diff --git a/app/src/processing/app/preproc/PdePreprocessor.java b/app/src/processing/app/preproc/PdePreprocessor.java
index 8e70d3b..50dcc16 100644
--- a/app/src/processing/app/preproc/PdePreprocessor.java
+++ b/app/src/processing/app/preproc/PdePreprocessor.java
@@ -441,7 +441,7 @@
 
     } else if (programType == STATIC) {
       out.println("public class " + className + " extends PApplet {");
-      out.print(indent + "public void setup() {");
+      out.println(indent + "public void setup() {");
     }
   }
 
