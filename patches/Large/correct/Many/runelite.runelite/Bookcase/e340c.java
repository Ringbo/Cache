diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/kourendlibrary/Bookcase.java b/runelite-client/src/main/java/net/runelite/client/plugins/kourendlibrary/Bookcase.java
index 7f4931c..0ab49d7 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/kourendlibrary/Bookcase.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/kourendlibrary/Bookcase.java
@@ -79,7 +79,7 @@
 		StringBuilder b = new StringBuilder();
 
 		boolean north = location.getY() > 3815;
-		boolean west = location.getX() < 1625;
+		boolean west = location.getX() < 1627;
 		if (north && west)
 		{
 			b.append("Northwest");
