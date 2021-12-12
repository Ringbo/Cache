diff --git a/common/buildcraft/builders/FillerFlattener.java b/common/buildcraft/builders/FillerFlattener.java
index 312fcbf..26f0ca7 100644
--- a/common/buildcraft/builders/FillerFlattener.java
+++ b/common/buildcraft/builders/FillerFlattener.java
@@ -73,7 +73,7 @@
 		if (lastX != Integer.MAX_VALUE)
 			return false;
 
-		return !empty(xMin, yMin, zMin, xMax, 64 * 2, zMax, tile.worldObj);
+		return !empty(xMin, yMin, zMin, xMax, 64 * 4, zMax, tile.worldObj);
 	}
 
 	@Override
