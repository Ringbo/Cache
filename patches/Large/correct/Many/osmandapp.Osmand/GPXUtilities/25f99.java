diff --git a/OsmAnd/src/net/osmand/GPXUtilities.java b/OsmAnd/src/net/osmand/GPXUtilities.java
index d55eeaf..94d7314 100644
--- a/OsmAnd/src/net/osmand/GPXUtilities.java
+++ b/OsmAnd/src/net/osmand/GPXUtilities.java
@@ -336,7 +336,7 @@
 		format.setTimeZone(TimeZone.getTimeZone("UTC"));
 		try {
 			XmlPullParser parser = Xml.newPullParser();
-			parser.setInput(new InputStreamReader(f)); //$NON-NLS-1$
+			parser.setInput(new InputStreamReader(f, "UTF-8")); //$NON-NLS-1$
 			Stack<GPXExtensions> parserState = new Stack<GPXExtensions>();
 			boolean extensionReadMode = false;
 			parserState.push(res);
