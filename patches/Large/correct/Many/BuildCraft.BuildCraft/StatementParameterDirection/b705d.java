diff --git a/common/buildcraft/core/statements/StatementParameterDirection.java b/common/buildcraft/core/statements/StatementParameterDirection.java
index 90e9162..ff5e1f2 100644
--- a/common/buildcraft/core/statements/StatementParameterDirection.java
+++ b/common/buildcraft/core/statements/StatementParameterDirection.java
@@ -51,7 +51,7 @@
 		if (source.getTile() instanceof TileGenericPipe) {
 			do {
 				direction = ForgeDirection.getOrientation((direction.ordinal() + (mouse.getButton() > 0 ? -1 : 1)) % 6);
-			} while (((TileGenericPipe) source.getTile()).isPipeConnected(direction));
+			} while (!((TileGenericPipe) source.getTile()).isPipeConnected(direction));
 		}
 	}
 
