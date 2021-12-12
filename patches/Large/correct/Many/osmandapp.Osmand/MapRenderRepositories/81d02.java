diff --git a/OsmAnd/src/net/osmand/plus/render/MapRenderRepositories.java b/OsmAnd/src/net/osmand/plus/render/MapRenderRepositories.java
index 2ee3854..1b98d1d 100644
--- a/OsmAnd/src/net/osmand/plus/render/MapRenderRepositories.java
+++ b/OsmAnd/src/net/osmand/plus/render/MapRenderRepositories.java
@@ -143,14 +143,14 @@
 		return prevBmpLocation;
 	}
 
-	public void closeConnection(String file) {
+	public synchronized void closeConnection(String file) {
 		LinkedHashMap<String, BinaryMapIndexReader> cpfiles = new LinkedHashMap<String, BinaryMapIndexReader>(files);
 		BinaryMapIndexReader bmir = cpfiles.remove(file);
 		files = cpfiles;
 		if (nativeFiles.contains(file)) {
 			NativeOsmandLibrary lib = NativeOsmandLibrary.getLoadedLibrary();
 			if (lib != null) {
-				lib.closeMapFile(file);
+				lib.closeMapFile(bmir != null ? bmir.getFile().getAbsolutePath() : file);
 				nativeFiles.remove(file);
 			}
 		}
