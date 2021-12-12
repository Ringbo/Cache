diff --git a/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java b/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
index c208537..b28e6d9 100644
--- a/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
@@ -201,7 +201,7 @@
 			String fileName = file.getName();
 
 			int hashInd = fileName.lastIndexOf('_');
-			if (hashInd != -1) {
+			if (hashInd != -1 && hashInd < 8) {
 				return fileName.substring(0, hashInd);
 			} else if (this.isAudio()) {
 				return ctx.getResources().getString(R.string.shared_string_audio);
@@ -992,7 +992,7 @@
 		Recording r = new Recording(f);
 		String encodeName = f.getName();
 		int i = encodeName.lastIndexOf('_');
-		if (i > 0) {
+		if (i > 0 && i < 8) {
 			encodeName = encodeName.substring(i + 1);
 		}
 		i = encodeName.indexOf('.');
