diff --git a/OsmAnd/src/net/osmand/plus/activities/search/SearchRegionByNameActivity.java b/OsmAnd/src/net/osmand/plus/activities/search/SearchRegionByNameActivity.java
index b75f902..c4f8452 100644
--- a/OsmAnd/src/net/osmand/plus/activities/search/SearchRegionByNameActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/search/SearchRegionByNameActivity.java
@@ -25,7 +25,7 @@
 			@Override
 			public int compare(RegionAddressRepository lhs,
 					RegionAddressRepository rhs) {
-				return col.compare(lhs.getName(), rhs.getName());
+				return col.compare(getText(lhs), getText(rhs));
 			}
 		};
 	}
@@ -68,7 +68,7 @@
 
 	@Override
 	public void itemSelected(RegionAddressRepository obj) {
-		((OsmandApplication) getApplication()).getSettings().setLastSearchedRegion(obj.getName(), obj.getEstimatedRegionCenter());
+		((OsmandApplication) getApplication()).getSettings().setLastSearchedRegion(obj.getFileName(), obj.getEstimatedRegionCenter());
 		quitActivity(SearchCityByNameActivity.class);
 	}
 
