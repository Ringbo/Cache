diff --git a/OsmAnd/src/net/osmand/plus/OsmAndLocationProvider.java b/OsmAnd/src/net/osmand/plus/OsmAndLocationProvider.java
index 45b5235..eb4cbe6 100644
--- a/OsmAnd/src/net/osmand/plus/OsmAndLocationProvider.java
+++ b/OsmAnd/src/net/osmand/plus/OsmAndLocationProvider.java
@@ -869,7 +869,7 @@
 		if (loc != null) {
 			int counter = locationRequestsCounter.incrementAndGet();
 			if (counter >= REQUESTS_BEFORE_CHECK_LOCATION && locationRequestsCounter.compareAndSet(counter, 0)) {
-				if (System.currentTimeMillis() - lastTimeGPSLocationFixed > LOCATION_TIMEOUT_TO_BE_STALE) {
+				if (System.currentTimeMillis() - lastTimeLocationFixed > LOCATION_TIMEOUT_TO_BE_STALE) {
 					location = null;
 				}
 			}
