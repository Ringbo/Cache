diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/AmenityMenuController.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/AmenityMenuController.java
index 21ba561..c33dda1 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/AmenityMenuController.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/AmenityMenuController.java
@@ -192,7 +192,7 @@
 	public Drawable getRightIcon() {
 		Map<String, String> addTypes = amenity.getAdditionalInfo();
 		if (addTypes != null && addTypes.containsKey("subway_region")) {
-			String region = "subway_" + addTypes.remove("subway_region");
+			String region = "subway_" + addTypes.get("subway_region");
 			amenity.setAdditionalInfo(addTypes);
 			if (RenderingIcons.containsBigIcon(region)) {
 				return RenderingIcons.getBigIcon(getMapActivity(), region);
