diff --git a/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomInTransformer.java b/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomInTransformer.java
index ea97d1d..53dc04e 100644
--- a/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomInTransformer.java
+++ b/ViewPagerTransformsLibrary/src/com/ToxicBakery/viewpager/transforms/ZoomInTransformer.java
@@ -6,12 +6,12 @@
 
 	@Override
 	protected void onTransform(View view, float position) {
-		final float scale = Math.abs(position);
+		final float scale = position < 0 ? position + 1f : Math.abs(1f - position);
 		view.setScaleX(scale);
 		view.setScaleY(scale);
 		view.setPivotX(view.getWidth() * 0.5f);
 		view.setPivotY(view.getHeight() * 0.5f);
-		view.setAlpha(position < -1f || position > 1f ? 0 : 1f - (scale - 1f));
+		view.setAlpha(position < -1f || position > 1f ? 0f : 1f - (scale - 1f));
 	}
 
 }
