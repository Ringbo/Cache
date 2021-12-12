diff --git a/EssentialsChat/src/com/earth2me/essentials/chat/EssentialsChatPlayerListener.java b/EssentialsChat/src/com/earth2me/essentials/chat/EssentialsChatPlayerListener.java
index b380739..c4874d6 100644
--- a/EssentialsChat/src/com/earth2me/essentials/chat/EssentialsChatPlayerListener.java
+++ b/EssentialsChat/src/com/earth2me/essentials/chat/EssentialsChatPlayerListener.java
@@ -100,7 +100,7 @@
 			{
 				continue;
 			}
-			if (u.equals(user) && !u.isAuthorized("essentials.chat.spy"))
+			if (!u.equals(user) && !u.isAuthorized("essentials.chat.spy"))
 			{
 				final Location l = u.getLocation();
 				final int dx = Math.abs(x - l.getBlockX());
