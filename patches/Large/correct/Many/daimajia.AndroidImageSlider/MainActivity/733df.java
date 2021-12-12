diff --git a/demo/src/main/java/com/daimajia/slider/demo/MainActivity.java b/demo/src/main/java/com/daimajia/slider/demo/MainActivity.java
index e494f31..c150044 100644
--- a/demo/src/main/java/com/daimajia/slider/demo/MainActivity.java
+++ b/demo/src/main/java/com/daimajia/slider/demo/MainActivity.java
@@ -62,7 +62,7 @@
         mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
         mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
         mDemoSlider.setCustomAnimation(new DescriptionAnimation());
-        mDemoSlider.setDuration(1200);
+        mDemoSlider.setDuration(4000);
         ListView l = (ListView)findViewById(R.id.transformers);
         l.setAdapter(new TransformerAdapter(this));
         l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
