diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashboardOnMap.java b/OsmAnd/src/net/osmand/plus/dashboard/DashboardOnMap.java
index dc3039b..3f47fa5 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashboardOnMap.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashboardOnMap.java
@@ -1238,7 +1238,7 @@
 			animators.add(ObjectAnimator.ofFloat(content, View.TRANSLATION_X, initialValueX, finalValueX));
 			animators.add(ObjectAnimator.ofFloat(content, View.TRANSLATION_Y, initialValueY, finalValueY));
 		}
-		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
+		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && ViewCompat.isAttachedToWindow(content)) {
 			int centerX = content.getMeasuredWidth() / 2;
 			int centerY = content.getMeasuredHeight() / 2;
 			float initialRadius = show ? 0 : (float) Math.sqrt(Math.pow(content.getWidth() / 2, 2) + Math.pow(content.getHeight() / 2, 2));
