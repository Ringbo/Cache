diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/MemoryUsagePanel.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/MemoryUsagePanel.java
index ffbd473..7e5dfcf 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/MemoryUsagePanel.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/MemoryUsagePanel.java
@@ -163,7 +163,7 @@
       final FontMetrics fontMetrics = g.getFontMetrics();
       final int infoWidth = fontMetrics.charsWidth(info.toCharArray(), 0, info.length());
       final int infoHeight = fontMetrics.getHeight() - fontMetrics.getDescent();
-      UIUtil.applyRenderingHints(g);
+      UIUtil.applyRenderingHints(g2);
 
       g2.setColor(Color.black);
       g2.drawString(info, xOffset + (totalBarLength - infoWidth) / 2, yOffset + (barHeight + infoHeight) / 2 - 1);
