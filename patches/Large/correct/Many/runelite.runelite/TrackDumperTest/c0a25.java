diff --git a/cache/src/test/java/net/runelite/cache/TrackDumperTest.java b/cache/src/test/java/net/runelite/cache/TrackDumperTest.java
index 576f9e6..f54a1d2 100644
--- a/cache/src/test/java/net/runelite/cache/TrackDumperTest.java
+++ b/cache/src/test/java/net/runelite/cache/TrackDumperTest.java
@@ -94,7 +94,7 @@
 		TrackDefinition def = loader.load(file.getContents());
 
 		String name;
-		if (archive.getNameHash() > 0)
+		if (archive.getNameHash() != 0)
 		{
 			name = djb2.getName(archive.getNameHash());
 			if (name == null)
