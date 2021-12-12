diff --git a/src/wms/src/main/java/org/geoserver/wms/decoration/MapDecorationLayout.java b/src/wms/src/main/java/org/geoserver/wms/decoration/MapDecorationLayout.java
index d814d9b..65a9e8e 100644
--- a/src/wms/src/main/java/org/geoserver/wms/decoration/MapDecorationLayout.java
+++ b/src/wms/src/main/java/org/geoserver/wms/decoration/MapDecorationLayout.java
@@ -325,7 +325,7 @@
             Point offset = null;
             String theOffset = e.getAttributeValue("offset");
             try {
-                if (offset != null) {
+                if (theOffset != null) {
                     String[] offsetArr = theOffset.split(",");
                     offset = new Point(Integer.valueOf(offsetArr[0]), Integer.valueOf(offsetArr[1]));
                 } else {
