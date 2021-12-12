diff --git a/demo/src/main/java/demos/gui/uicomponents/SVGLoaderController.java b/demo/src/main/java/demos/gui/uicomponents/SVGLoaderController.java
index 546d764..99402b6 100644
--- a/demo/src/main/java/demos/gui/uicomponents/SVGLoaderController.java
+++ b/demo/src/main/java/demos/gui/uicomponents/SVGLoaderController.java
@@ -104,7 +104,7 @@
         glyphs.sort(Comparator.comparing(SVGGlyph::getName));
 
 
-        glyphs.forEach(glyph -> glyph.setSizeRatio(16));
+        glyphs.forEach(glyph -> glyph.setSize(16));
         List<Button> iconButtons = glyphs.stream().map(this::createIconButton).collect(Collectors.toList());
         // important to improve the performance of animation in scroll pane so buttons are treated as images
         iconButtons.forEach(button -> button.setCache(true));
@@ -242,7 +242,7 @@
                 return;
             }
 
-            sizeSlider.valueProperty().addListener(observable -> glyph.get().setSizeRatio(sizeSlider.getValue()));
+            sizeSlider.valueProperty().addListener(observable -> glyph.get().setSize(sizeSlider.getValue()));
             idLabel.setText(String.format("%04d", glyph.get().getGlyphId()));
             nameLabel.setText(glyph.get().getName());
             glyph.get().setFill(colorPicker.getValue());
@@ -259,7 +259,7 @@
         }
 
         final void setGlyph(SVGGlyph glyph) {
-            glyph.setSizeRatio(sizeSlider.getValue());
+            glyph.setSize(sizeSlider.getValue());
             this.glyph.set(glyph);
         }
     }
