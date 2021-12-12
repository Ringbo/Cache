diff --git a/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java b/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java
index 08227c3..ef3c91c 100644
--- a/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java
+++ b/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java
@@ -154,7 +154,7 @@
 				canvas.drawCircle(x, y, r + (float)Math.ceil(tb.getDensity()), pointOuter);
 				canvas.drawCircle(x, y, r - (float)Math.ceil(tb.getDensity()), pointInnerCircle);
 				paintTextIcon.setTextSize(r * 3 / 2);
-				canvas.drawText(t.getVisibleName().substring(0, 1).toUpperCase(), x, y - r, paintTextIcon);
+				canvas.drawText(t.getVisibleName().substring(0, 1).toUpperCase(), x, y + r, paintTextIcon);
 			}
 		}
 	}
