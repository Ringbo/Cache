diff --git a/dbexample/src/main/java/com/tonicartos/superslimdbexample/Adapter.java b/dbexample/src/main/java/com/tonicartos/superslimdbexample/Adapter.java
index 0f2cae9..49820d9 100644
--- a/dbexample/src/main/java/com/tonicartos/superslimdbexample/Adapter.java
+++ b/dbexample/src/main/java/com/tonicartos/superslimdbexample/Adapter.java
@@ -65,7 +65,7 @@
             final Item currentRegion = new Item(VIEW_TYPE_REGION_HEADER, currentRegionName);
             final Section regionSection = createSection(currentRegionName,
                     new LinearSectionConfig(SectionConfig.DEFAULT_GUTTER, SectionConfig.DEFAULT_GUTTER,
-                            SectionConfig.HEADER_INLINE, SectionConfig.FOOTER_STICKY, 0, 0, 0, 0),
+                            SectionConfig.HEADER_INLINE, SectionConfig.FOOTER_STICKY),
                     currentRegion);
 
             while (i < count) {
@@ -78,7 +78,7 @@
                 final Item currentSubRegion = new Item(VIEW_TYPE_SUBREGION_HEADER, currentSubRegionName);
                 final Section subregionSection = createSection(currentSubRegionName,
                         new LinearSectionConfig(SectionConfig.DEFAULT_GUTTER, SectionConfig.DEFAULT_GUTTER,
-                                SectionConfig.HEADER_INLINE, SectionConfig.FOOTER_STICKY, 0, 0, 0, 0),
+                                SectionConfig.HEADER_INLINE, SectionConfig.FOOTER_STICKY),
                         currentSubRegion);
                 regionSection.add(subregionSection);
                 for (; i < count; i++) {
