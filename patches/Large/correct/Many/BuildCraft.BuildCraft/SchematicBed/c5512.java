diff --git a/common/buildcraft/builders/schematics/SchematicBed.java b/common/buildcraft/builders/schematics/SchematicBed.java
index 21309fc..7ba058a 100644
--- a/common/buildcraft/builders/schematics/SchematicBed.java
+++ b/common/buildcraft/builders/schematics/SchematicBed.java
@@ -71,7 +71,7 @@
 			break;
 		}
 
-		context.world().setBlock(x2, y, z2, block, meta + 8,1);
+		context.world().setBlock(x2, y, z2, block, meta + 8, 3);
 	}
 
 	@Override
