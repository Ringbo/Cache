diff --git a/candy/src/processing/candy/SVG.java b/candy/src/processing/candy/SVG.java
index 93be02a..9c91b44 100755
--- a/candy/src/processing/candy/SVG.java
+++ b/candy/src/processing/candy/SVG.java
@@ -563,7 +563,7 @@
                 this.hasTransform = true;
                 transform = properties.getStringAttribute("transform");
                 transform = transform.substring(7, transform.length() - 2);
-                String tf[] = PApplet.split(transform);
+                String tf[] = PApplet.splitTokens(transform);
 
                 this.transformation = new float[tf.length];
                 for (int i = 0; i < transformation.length; i++)
@@ -1091,8 +1091,7 @@
             this.closed = closed;
 
             if (properties.hasAttribute("points")) {
-                //pointsBuffer = PApplet.split(properties.getStringAttribute("points"), ' ');
-                pointsBuffer = PApplet.split(properties.getStringAttribute("points"));
+                pointsBuffer = PApplet.splitTokens(properties.getStringAttribute("points"));
             }
 
             points = new float[pointsBuffer.length][2];
@@ -1186,7 +1185,7 @@
             //String pathDataKeys[] = PApplet.split(pathDataBuffer, '|');
             // use whitespace constant to get rid of extra spaces and CR or LF
             String pathDataKeys[] =
-                PApplet.split(pathDataBuffer, "|" + PConstants.WHITESPACE);
+                PApplet.splitTokens(pathDataBuffer, "|" + PConstants.WHITESPACE);
             //for (int j = 0; j < pathDataKeys.length; j++) {
             //    PApplet.println(j + "\t" + pathDataKeys[j]);
             //}
