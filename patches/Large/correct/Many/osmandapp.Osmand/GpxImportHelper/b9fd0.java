diff --git a/OsmAnd/src/net/osmand/plus/helpers/GpxImportHelper.java b/OsmAnd/src/net/osmand/plus/helpers/GpxImportHelper.java
index 584042c..646c921 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/GpxImportHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/GpxImportHelper.java
@@ -354,7 +354,7 @@
 		final List<FavouritePoint> favourites = new ArrayList<>();
 		for (GPXUtilities.WptPt p : wptPts) {
 			if (p.name != null) {
-				final string fpCat = (p.category != null) ? p.category : "";
+				final String fpCat = (p.category != null) ? p.category : "";
 				final FavouritePoint fp = new FavouritePoint(p.lat, p.lon, p.name, fpCat);
 				if (p.desc != null) {
 					fp.setDescription(p.desc);
