diff --git a/common/buildcraft/transport/TileGenericPipe.java b/common/buildcraft/transport/TileGenericPipe.java
index 99952f4..fc41e14 100644
--- a/common/buildcraft/transport/TileGenericPipe.java
+++ b/common/buildcraft/transport/TileGenericPipe.java
@@ -408,7 +408,7 @@
 	@Override
 	public int powerRequest(ForgeDirection from) {
 		if (BlockGenericPipe.isValid(pipe) && pipe instanceof IPowerReceptor)
-			return ((IPowerReceptor) pipe).powerRequest();
+			return ((IPowerReceptor) pipe).powerRequest(from);
 		return 0;
 	}
 
