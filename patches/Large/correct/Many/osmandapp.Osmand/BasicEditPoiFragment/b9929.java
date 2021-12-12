diff --git a/OsmAnd/src/net/osmand/plus/osmedit/BasicEditPoiFragment.java b/OsmAnd/src/net/osmand/plus/osmedit/BasicEditPoiFragment.java
index 4a02b57..33ecb85 100644
--- a/OsmAnd/src/net/osmand/plus/osmedit/BasicEditPoiFragment.java
+++ b/OsmAnd/src/net/osmand/plus/osmedit/BasicEditPoiFragment.java
@@ -214,7 +214,8 @@
 			if (!data.isInEdit()) {
 				String openingHoursString = openingHours.toString();
 				if (!TextUtils.isEmpty(openingHoursString)) {
-					if(!OpeningHoursParser.parseOpenedHoursHandleErrors(openingHours.getOriginal()).toString().equals(openingHoursString)) {
+					if(openingHours.getOriginal() == null ||
+							!OpeningHoursParser.parseOpenedHoursHandleErrors(openingHours.getOriginal()).toString().equals(openingHoursString)) {
 						data.putTag(OSMSettings.OSMTagKey.OPENING_HOURS.getValue(),
 								openingHoursString);
 					}
