diff --git a/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java b/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
index f9f69fb..c208537 100644
--- a/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
@@ -180,7 +180,7 @@
 			String fileName = getFileName();
 			final String hashAndExtension;
 			int hashInd = fileName.lastIndexOf('_');
-			if (hashInd == -1) {
+			if (hashInd == -1 || hashInd < 8) {
 				hashAndExtension = "_" + fileName;
 			} else {
 				hashAndExtension = fileName.substring(hashInd, fileName.length());
