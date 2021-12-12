diff --git a/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java b/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java
index ea9e6d1..2a3ba77 100644
--- a/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java
+++ b/Essentials/src/com/earth2me/essentials/EssentialsPlayerListener.java
@@ -299,7 +299,7 @@
 	@Override
 	public void onPlayerLogin(final PlayerLoginEvent event)
 	{
-		if (event.getResult() != Result.ALLOWED)
+		if (event.getResult() != Result.ALLOWED && event.getResult() != Result.KICK_FULL)
 		{
 			return;
 		}
