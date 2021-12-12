diff --git a/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java b/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java
index f824ad3..35c607e 100644
--- a/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java
+++ b/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java
@@ -292,7 +292,7 @@
 	{
 		try
 		{
-			user.setCompassTarget(user.getHome());
+			user.setCompassTarget(user.getHome(user.getLocation()));
 		}
 		catch (Exception ex)
 		{
