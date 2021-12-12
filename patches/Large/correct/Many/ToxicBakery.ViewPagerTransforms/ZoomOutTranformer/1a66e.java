diff --git a/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomOutTranformer.java b/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomOutTranformer.java
index be1ecb8..e636ff0 100644
--- a/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomOutTranformer.java
+++ b/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomOutTranformer.java
@@ -6,12 +6,12 @@
 
 	@Override
 	protected void onTransform(View view, float position) {
-		final float scale = 2f - Math.abs(position);
+		final float scale = 1f + Math.abs(position);
 		view.setScaleX(scale);
 		view.setScaleY(scale);
 		view.setPivotX(view.getWidth() * 0.5f);
 		view.setPivotY(view.getHeight() * 0.5f);
-		view.setAlpha(position < -1f || position > 1f ? 0 : 1f - (scale - 1f));
+		view.setAlpha(position < -1f || position > 1f ? 0f : 1f - (scale - 1f));
 	}
 
 }
