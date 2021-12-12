diff --git a/runelite-mixins/src/main/java/net/runelite/mixins/RSActorMixin.java b/runelite-mixins/src/main/java/net/runelite/mixins/RSActorMixin.java
index 01e479d..2ba4459 100644
--- a/runelite-mixins/src/main/java/net/runelite/mixins/RSActorMixin.java
+++ b/runelite-mixins/src/main/java/net/runelite/mixins/RSActorMixin.java
@@ -68,7 +68,7 @@
 	public Actor getInteracting()
 	{
 		int i = getRSInteracting();
-		if (i == -1)
+		if (i == -1 || i == 65535)
 		{
 			return null;
 		}
