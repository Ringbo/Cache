diff --git a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
index 7fe1835..ca0ab94 100644
--- a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
+++ b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
@@ -885,7 +885,7 @@
   }
 
   abstract static class Painter {
-    public static final int ROUND_VALUE = SystemInfo.isMac ? 5 : 2;
+    public static final int ROUND_VALUE = SystemInfo.isMac ? 3 : 2;
 
     private PainterSettings mySettings;
 
@@ -921,13 +921,13 @@
       final int width = c.getWidth();
       if (bg != null) {
         g2.setColor(bg);
-        g2.fillRoundRect(offset + 1, 0, width - 3, height - 1, ROUND_VALUE, ROUND_VALUE);
+        g2.fillRoundRect(offset + 2, 0, width - 4, height - 2, ROUND_VALUE, ROUND_VALUE);
       }
 
       final Color borderColor = s.getBorderColor(c);
       if (borderColor != null) {
         g2.setColor(borderColor);
-        g2.drawRoundRect(offset + 1, 0, width - 3, height - 1, ROUND_VALUE, ROUND_VALUE);
+        g2.drawRoundRect(offset + 1, 0, width - 2, height - 2, ROUND_VALUE, ROUND_VALUE);
       }
 
       final Color textColor = s.getForegroundColor(c);
@@ -960,7 +960,7 @@
         string = sb.append("...").toString();
       }
 
-      g2.drawString(string, offset + ROUND_VALUE, fm.getHeight() - fm.getDescent() + (SystemInfo.isMac ? 2 : 0));
+      g2.drawString(string, offset + ROUND_VALUE, height - fm.getDescent() - 2);// fm.getHeight() - fm.getDescent() + (SystemInfo.isMac ? 0 : 0));
 
       g2.setFont(oldFont);
     }
@@ -968,7 +968,7 @@
     @NotNull
     Dimension getSize(@NotNull @NonNls final String s, @NotNull final FontMetrics fm, final int maxWidth) {
       final int width = fm.stringWidth(s) + (ROUND_VALUE * 2);
-      return new Dimension(width > maxWidth ? maxWidth : width, fm.getHeight() + (SystemInfo.isMac ? 4 : 0));
+      return new Dimension(width > maxWidth ? maxWidth : width, fm.getHeight() + 2); //(SystemInfo.isMac ? 0 : 0));
     }
   }
 
