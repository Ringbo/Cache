diff --git a/bundles/binding/org.openhab.binding.opensprinkler/src/main/java/org/openhab/binding/opensprinkler/internal/OpenSprinklerBinding.java b/bundles/binding/org.openhab.binding.opensprinkler/src/main/java/org/openhab/binding/opensprinkler/internal/OpenSprinklerBinding.java
index a935212..b568434 100644
--- a/bundles/binding/org.openhab.binding.opensprinkler/src/main/java/org/openhab/binding/opensprinkler/internal/OpenSprinklerBinding.java
+++ b/bundles/binding/org.openhab.binding.opensprinkler/src/main/java/org/openhab/binding/opensprinkler/internal/OpenSprinklerBinding.java
@@ -103,7 +103,7 @@
 			String stationItemName = findFirstMatchingItemName(station);
 			logger.debug("Checking state of item: " + stationItemName);
 			
-			if ( stationItemName != null ) {
+			if ( stationItemName != null && openSprinkler != null ) {
 				if ( openSprinkler.isStationOpen(station) ) {
 					eventPublisher.postUpdate(stationItemName, OnOffType.ON);
 				} else {
