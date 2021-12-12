diff --git a/OsmAnd/src/net/osmand/plus/AppInitializer.java b/OsmAnd/src/net/osmand/plus/AppInitializer.java
index 2bd611e..70ec8d3 100644
--- a/OsmAnd/src/net/osmand/plus/AppInitializer.java
+++ b/OsmAnd/src/net/osmand/plus/AppInitializer.java
@@ -251,7 +251,7 @@
 			@Override
 			public String getTranslation(AbstractPoiType type) {
 				try {
-					Field f = R.string.class.getField("poi_" + type.getKeyName());
+					Field f = R.string.class.getField("poi_" + type.getIconKeyName());
 					if (f != null) {
 						Integer in = (Integer) f.get(null);
 						return app.getString(in);
