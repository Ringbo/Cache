diff --git a/OsmAnd/src/net/osmand/plus/AppInitializer.java b/OsmAnd/src/net/osmand/plus/AppInitializer.java
index 91c5e19..66523e4 100644
--- a/OsmAnd/src/net/osmand/plus/AppInitializer.java
+++ b/OsmAnd/src/net/osmand/plus/AppInitializer.java
@@ -425,7 +425,7 @@
 					Field f = R.string.class.getField("poi_" + keyName);
 					if (f != null) {
 						Integer in = (Integer) f.get(null);
-						String val = app.getString(in);
+						String val = en.getString(in);
 						if(val != null) {
 							int ind = val.indexOf(';');
 							if(ind > 0) {
