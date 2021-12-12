diff --git a/OsmAnd/src/net/osmand/plus/routing/AlarmInfo.java b/OsmAnd/src/net/osmand/plus/routing/AlarmInfo.java
index c0fa999..9e03389 100644
--- a/OsmAnd/src/net/osmand/plus/routing/AlarmInfo.java
+++ b/OsmAnd/src/net/osmand/plus/routing/AlarmInfo.java
@@ -119,7 +119,7 @@
 	
 	public int updateDistanceAndGetPriority(float time, float distance) {
 		if (distance > 1500) {
-			return 0;
+			return Integer.MAX_VALUE;
 		}
 		// 1 level of priorities
 		if (time < 8 || distance < 100 || type == AlarmInfoType.SPEED_LIMIT) {
@@ -129,10 +129,10 @@
 			return type.getPriority();
 		}
 		// 2nd level
-		if (time < 10 || distance < 150) {
+		if (time < 7 || distance < 100) {
 			return type.getPriority() + AlarmInfoType.MAXIMUM.getPriority();
 		}
-		return 0;
+		return Integer.MAX_VALUE;
 	}
 	
 	@Override
