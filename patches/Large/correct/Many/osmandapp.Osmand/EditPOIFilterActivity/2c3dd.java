diff --git a/OsmAnd/src/net/osmand/plus/activities/EditPOIFilterActivity.java b/OsmAnd/src/net/osmand/plus/activities/EditPOIFilterActivity.java
index 47d8b82..b203646 100644
--- a/OsmAnd/src/net/osmand/plus/activities/EditPOIFilterActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/EditPOIFilterActivity.java
@@ -193,7 +193,7 @@
 	}
 
 	public ListView selectAllFromCategory(PoiCategory poiCategory) {
-		filter.selectSubTypesToAccept(poiCategory, null);
+		filter.updateTypesToAccept(poiCategory);
 		helper.editPoiFilter(filter);
 		ListView lv = this.getListView();
 		AmenityAdapter la = this.getListAdapter();
