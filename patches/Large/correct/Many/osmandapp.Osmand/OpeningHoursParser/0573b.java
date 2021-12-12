diff --git a/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java b/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
index a079dac..a45dcc0 100644
--- a/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
+++ b/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
@@ -870,7 +870,7 @@
 					if (startTime < endTime && endTime != -1) {
 						if (days[d] && !checkAnotherDay) {
 							int diff = endTime - time;
-							if ((time <= endTime) && ((!nearToEvent && diff >= freeLimit) || (nearToEvent && diff <= nearToEventLimit))) {
+							if ((time <= endTime) && ((!nearToEvent && diff <= freeLimit) || (nearToEvent && diff <= nearToEventLimit))) {
 								formatTime(endTime, sb);
 								break;
 							}
