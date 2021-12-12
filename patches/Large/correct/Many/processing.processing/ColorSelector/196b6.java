diff --git a/java/src/processing/mode/java/tweak/ColorSelector.java b/java/src/processing/mode/java/tweak/ColorSelector.java
index 1e8f593..1e4bdbb 100644
--- a/java/src/processing/mode/java/tweak/ColorSelector.java
+++ b/java/src/processing/mode/java/tweak/ColorSelector.java
@@ -60,11 +60,11 @@
 
 		if (!colorBox.isBW) {
 			selectorBox = new ColorSelectorBox();
-			box.add(selectorBox.getCanvas());
+			box.add(selectorBox.getComponent());
 		}
 
 		box.add(Box.createHorizontalGlue());
-		box.add(selectorSlider.getCanvas(), BorderLayout.CENTER);
+		box.add(selectorSlider.getComponent(), BorderLayout.CENTER);
 		box.add(Box.createHorizontalGlue());
 
 		frame.getContentPane().add(box, BorderLayout.CENTER);
