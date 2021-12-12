diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/render/LabelPainter.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/render/LabelPainter.java
index b031ab5..2e68726 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/render/LabelPainter.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/render/LabelPainter.java
@@ -60,7 +60,7 @@
 public class LabelPainter {
   public static final int TOP_TEXT_PADDING = JBUI.scale(1);
   public static final int BOTTOM_TEXT_PADDING = JBUI.scale(2);
-  public static final int RIGHT_PADDING = JBUI.scale(2);
+  public static final int RIGHT_PADDING = JBUI.scale(4);
   public static final int LEFT_PADDING = JBUI.scale(2);
   public static final int COMPACT_MIDDLE_PADDING = JBUI.scale(2);
   public static final int MIDDLE_PADDING = JBUI.scale(6);
@@ -155,7 +155,7 @@
     for (RefGroup group : refGroups) {
       List<Color> colors = group.getColors();
       LabelIcon labelIcon = new LabelIcon(height, background, colors.toArray(new Color[colors.size()]));
-      int newWidth = width + labelIcon.getIconWidth() + COMPACT_MIDDLE_PADDING;
+      int newWidth = width + labelIcon.getIconWidth() + (group != ContainerUtil.getLastItem(refGroups) ? COMPACT_MIDDLE_PADDING : 0);
 
       String text = shortenRefName(group.getName(), fontMetrics, availableWidth - newWidth);
       newWidth += fontMetrics.stringWidth(text);
@@ -184,12 +184,12 @@
       int doNotFitWidth = 0;
       if (i < refGroups.size() - 1) {
         LabelIcon lastIcon = new LabelIcon(height, background, getColors(refGroups.subList(i + 1, refGroups.size())));
-        doNotFitWidth = lastIcon.getIconWidth() + MIDDLE_PADDING;
+        doNotFitWidth = lastIcon.getIconWidth();
       }
 
       List<Color> colors = group.getColors();
       LabelIcon labelIcon = new LabelIcon(height, background, colors.toArray(new Color[colors.size()]));
-      int newWidth = width + labelIcon.getIconWidth() + MIDDLE_PADDING;
+      int newWidth = width + labelIcon.getIconWidth() + (i != refGroups.size() - 1 ? MIDDLE_PADDING : 0);
 
       String text = getGroupText(group, fontMetrics, availableWidth - newWidth - doNotFitWidth);
       newWidth += fontMetrics.stringWidth(text);
@@ -198,7 +198,7 @@
         LabelIcon lastIcon = new LabelIcon(height, background, getColors(refGroups.subList(i, refGroups.size())));
         String name = labels.isEmpty() ? text : "";
         labels.add(Pair.create(name, lastIcon));
-        width += fontMetrics.stringWidth(name) + lastIcon.getIconWidth() + MIDDLE_PADDING;
+        width += fontMetrics.stringWidth(name) + lastIcon.getIconWidth();
         break;
       }
       else {
@@ -321,7 +321,7 @@
     if (myGreyBackground != null) {
       g2.setColor(myGreyBackground);
       g2.fillRect(x, y + baseLine - fontMetrics.getAscent() - TOP_TEXT_PADDING,
-                  myWidth - RIGHT_PADDING + LEFT_PADDING,
+                  myWidth,
                   fontMetrics.getHeight() + TOP_TEXT_PADDING + BOTTOM_TEXT_PADDING);
     }
 
