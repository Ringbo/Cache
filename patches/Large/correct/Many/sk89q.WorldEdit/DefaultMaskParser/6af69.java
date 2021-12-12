diff --git a/src/main/java/com/sk89q/worldedit/extension/registry/DefaultMaskParser.java b/src/main/java/com/sk89q/worldedit/extension/registry/DefaultMaskParser.java
index d212dfa..b85b9ff 100644
--- a/src/main/java/com/sk89q/worldedit/extension/registry/DefaultMaskParser.java
+++ b/src/main/java/com/sk89q/worldedit/extension/registry/DefaultMaskParser.java
@@ -132,7 +132,7 @@
                 }
 
             default:
-                return new BlockMask(extent, worldEdit.getBlockRegistry().parseFromInput(component, context));
+                return new BlockMask(extent, worldEdit.getBlockRegistry().parseFromListInput(component, context));
         }
     }
 
