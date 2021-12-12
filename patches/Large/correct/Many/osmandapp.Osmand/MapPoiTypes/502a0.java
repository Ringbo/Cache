diff --git a/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java b/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
index d04f1e5..20d56ac 100644
--- a/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
+++ b/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
@@ -143,11 +143,11 @@
 		return null;
 	}
 	
-	public Map<String, PoiType> getAllTranslatedNames() {
+	public Map<String, PoiType> getAllTranslatedNames(boolean skipNonEditable) {
 		Map<String, PoiType> translation = new HashMap<String, PoiType>();
 		for(PoiCategory pc : categories) {
 			for(PoiType pt :  pc.getPoiTypes()) {
-				if(pt.isReference()) {
+				if(pt.isReference() || pt.isNotEditableOsm()) {
 					continue;
 				}
 				translation.put(pt.getKeyName().replace('_', ' ').toLowerCase(), pt);
