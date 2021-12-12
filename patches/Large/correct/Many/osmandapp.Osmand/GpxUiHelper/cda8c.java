diff --git a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
index b89b59e..823eba0 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
@@ -1252,7 +1252,7 @@
 				} else {
 					nextY = divSpeed / s.speed;
 				}
-				if (nextY < 0) {
+				if (nextY < 0 || Float.isInfinite(nextY)) {
 					nextY = 0;
 				}
 				values.add(new Entry(nextX, nextY));
