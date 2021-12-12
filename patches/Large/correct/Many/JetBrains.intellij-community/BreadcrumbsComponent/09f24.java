diff --git a/xml/openapi/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java b/xml/openapi/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
index 1bab427..38a1927 100644
--- a/xml/openapi/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
+++ b/xml/openapi/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
@@ -728,7 +728,7 @@
       final int width = c.getWidth() - 4;
       if (bg != null) {
         g2.setColor(bg);
-        g2.fillRoundRect(offset + 2, 0, width - 6, height - 3, ROUND_VALUE, ROUND_VALUE);
+        g2.fillRoundRect(offset + 2, 0, width - 4, height - 3, ROUND_VALUE, ROUND_VALUE);
       }
 
       final Color borderColor = s.getBorderColor(c);
