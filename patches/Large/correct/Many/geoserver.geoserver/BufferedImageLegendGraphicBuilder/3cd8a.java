diff --git a/src/wms/src/main/java/org/geoserver/wms/legendgraphic/BufferedImageLegendGraphicBuilder.java b/src/wms/src/main/java/org/geoserver/wms/legendgraphic/BufferedImageLegendGraphicBuilder.java
index b157016..d56dccc 100644
--- a/src/wms/src/main/java/org/geoserver/wms/legendgraphic/BufferedImageLegendGraphicBuilder.java
+++ b/src/wms/src/main/java/org/geoserver/wms/legendgraphic/BufferedImageLegendGraphicBuilder.java
@@ -326,7 +326,7 @@
                     if (description != null && description.getTitle() != null) {
                         final InternationalString title = description.getTitle();
                         labels[i] = title.toString();
-                    } else if (rule.getName() == null) {
+                    } else if (rule.getName() != null) {
                         labels[i] = rule.getName();
                     } else {
                         labels[i] = "";
