diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenu.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenu.java
index 099252d..7310be1 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenu.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/ShareMenu.java
@@ -88,7 +88,7 @@
 		if (!Algorithms.isEmpty(title)) {
 			sb.append(title).append("\n");
 		}
-		if (!Algorithms.isEmpty(address) && !address.equals(title)) {
+		if (!Algorithms.isEmpty(address) && !address.equals(title) && !address.equals(getMapActivity().getString(R.string.no_address_found))) {
 			sb.append(address).append("\n");
 		}
 		sb.append(getMapActivity().getString(R.string.shared_string_location)).append(": ");
