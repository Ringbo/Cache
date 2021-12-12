diff --git a/src/web/gwc/src/main/java/org/geoserver/gwc/web/CachingOptionsPanel.java b/src/web/gwc/src/main/java/org/geoserver/gwc/web/CachingOptionsPanel.java
index e63365d..b58301b 100644
--- a/src/web/gwc/src/main/java/org/geoserver/gwc/web/CachingOptionsPanel.java
+++ b/src/web/gwc/src/main/java/org/geoserver/gwc/web/CachingOptionsPanel.java
@@ -90,7 +90,7 @@
         configs.add(cacheNonDefaultStyles);
 
         List<Integer> metaTilingChoices = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
-                14, 16, 16, 17, 18, 19, 20);
+                14, 15, 16, 17, 18, 19, 20);
         IModel<Integer> metaTilingXModel = new PropertyModel<Integer>(gwcConfigModel, "metaTilingX");
         DropDownChoice<Integer> metaTilingX = new DropDownChoice<Integer>("metaTilingX",
                 metaTilingXModel, metaTilingChoices);
