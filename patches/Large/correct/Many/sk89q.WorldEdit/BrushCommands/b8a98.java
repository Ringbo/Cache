diff --git a/src/main/java/com/sk89q/worldedit/commands/BrushCommands.java b/src/main/java/com/sk89q/worldedit/commands/BrushCommands.java
index cf34b19..2f356b4 100644
--- a/src/main/java/com/sk89q/worldedit/commands/BrushCommands.java
+++ b/src/main/java/com/sk89q/worldedit/commands/BrushCommands.java
@@ -82,7 +82,7 @@
             tool.setBrush(new SphereBrush(), "worldedit.brush.sphere");
         }
 
-        player.print(String.format("Sphere brush shape equipped (%d).",
+        player.print(String.format("Sphere brush shape equipped (%.0f).",
                 radius));
     }
 
@@ -126,7 +126,7 @@
             tool.setBrush(new CylinderBrush(height), "worldedit.brush.cylinder");
         }
         
-        player.print(String.format("Cylinder brush shape equipped (%d by %d).",
+        player.print(String.format("Cylinder brush shape equipped (%.0f by %d).",
                 radius, height));
     }
 
@@ -182,7 +182,7 @@
         
         LocalConfiguration config = we.getConfiguration();
 
-        double radius = args.argsLength() > 1 ? args.getDouble(1) : 2;
+        double radius = args.argsLength() > 0 ? args.getDouble(0) : 2;
         if (radius > config.maxBrushRadius) {
             player.printError("Maximum allowed brush radius: "
                     + config.maxBrushRadius);
@@ -195,7 +195,7 @@
         tool.setSize(radius);
         tool.setBrush(new SmoothBrush(iterations), "worldedit.brush.smooth");
 
-        player.print(String.format("Smooth brush equipped (%d x %dx).",
+        player.print(String.format("Smooth brush equipped (%.0f x %dx).",
                 radius, iterations));
     }
     
@@ -213,7 +213,7 @@
         
         LocalConfiguration config = we.getConfiguration();
 
-        double radius = args.argsLength() > 1 ? args.getDouble(1) : 2;
+        double radius = args.argsLength() > 1 ? args.getDouble(1) : 5;
         if (radius > config.maxBrushRadius) {
             player.printError("Maximum allowed brush radius: "
                     + config.maxBrushRadius);
@@ -227,7 +227,7 @@
         tool.setMask(new BlockTypeMask(BlockID.FIRE));
         tool.setBrush(new SphereBrush(), "worldedit.brush.ex");
 
-        player.print(String.format("Extinguisher equipped (%d).",
+        player.print(String.format("Extinguisher equipped (%.0f).",
                 radius));
     }
 }
