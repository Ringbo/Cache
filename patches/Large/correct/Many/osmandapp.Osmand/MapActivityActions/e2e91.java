diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index f317cd0..a11225a 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -458,7 +458,7 @@
 		}
 		
 		public DirectionDialogStyle routeFromMapPoint() {
-			routeToMapPoint = true;
+			routeFromMapPoint = true;
 			return this;
 		}
 	}
