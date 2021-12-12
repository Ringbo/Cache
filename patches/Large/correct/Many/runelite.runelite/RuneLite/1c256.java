diff --git a/runelite-client/src/main/java/net/runelite/client/RuneLite.java b/runelite-client/src/main/java/net/runelite/client/RuneLite.java
index f2821ba..d202866 100644
--- a/runelite-client/src/main/java/net/runelite/client/RuneLite.java
+++ b/runelite-client/src/main/java/net/runelite/client/RuneLite.java
@@ -116,7 +116,7 @@
 			return;
 		}
 
-		final Applet client = optionalClient.orElseGet(null);
+		final Applet client = optionalClient.orElse(null);
 		final boolean isOutdated = client == null || !(client instanceof Client);
 
 		if (!isOutdated)
