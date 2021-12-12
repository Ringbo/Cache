diff --git a/src/org/wordpress/android/util/WPHtml.java b/src/org/wordpress/android/util/WPHtml.java
index c549b7a..b0b1e31 100644
--- a/src/org/wordpress/android/util/WPHtml.java
+++ b/src/org/wordpress/android/util/WPHtml.java
@@ -344,7 +344,7 @@
                     out.append(getGalleryShortcode((MediaGalleryImageSpan) style[j]));
                 } else if (style[j] instanceof WPImageSpan && ((WPImageSpan) style[j]).getMediaFile().getMediaId() != null) {
                     out.append(getContent((WPImageSpan) style[j]));
-                } else if (style[j] instanceof ImageSpan) {
+                } else if (style[j] instanceof WPImageSpan) {
                     out.append("<img src=\"");
                     out.append(((WPImageSpan) style[j]).getSource());
                     out.append("\" android-uri=\""
