diff --git a/platform/platform-api/src/com/intellij/ui/components/breadcrumbs/Breadcrumbs.java b/platform/platform-api/src/com/intellij/ui/components/breadcrumbs/Breadcrumbs.java
index 034df6f..fe8e6e3 100644
--- a/platform/platform-api/src/com/intellij/ui/components/breadcrumbs/Breadcrumbs.java
+++ b/platform/platform-api/src/com/intellij/ui/components/breadcrumbs/Breadcrumbs.java
@@ -471,16 +471,16 @@
       else if (isHovered(crumb)) {
         paintMarker(g, bounds.x, bounds.y, bounds.width, bounds.height, crumb, scale);
       }
-      if (font != null) {
+      if (font != null && foreground != null) {
         g.setFont(font);
-        FontMetrics fm = g.getFontMetrics(font);
+        FontMetrics fm = getFontMetrics(font);
         if (fm != null) {
           Rectangle iconR = new Rectangle();
           Rectangle textR = new Rectangle();
           Rectangle viewR = getBounds(scale * LEFT_RIGHT, scale * TOP_BOTTOM);
           String text = layout(fm, iconR, textR, viewR);
           if (!StringUtil.isEmpty(text)) {
-            g.setColor(foreground != null ? foreground : getForeground());
+            g.setColor(foreground);
             g.drawString(text, textR.x, textR.y += fm.getAscent());
             if (effectColor != null && effectType != null) {
               EffectPainter painter = getEffectPainter(effectType);
