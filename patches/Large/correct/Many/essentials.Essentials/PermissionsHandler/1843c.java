diff --git a/Essentials/src/com/earth2me/essentials/perm/PermissionsHandler.java b/Essentials/src/com/earth2me/essentials/perm/PermissionsHandler.java
index 5c97610..8adff34 100644
--- a/Essentials/src/com/earth2me/essentials/perm/PermissionsHandler.java
+++ b/Essentials/src/com/earth2me/essentials/perm/PermissionsHandler.java
@@ -71,7 +71,7 @@
 	@Override
 	public boolean hasPermission(final Player base, final String node)
 	{
-		return handler.inGroup(base, node);
+		return handler.hasPermission(base, node);
 	}
 
 	@Override
