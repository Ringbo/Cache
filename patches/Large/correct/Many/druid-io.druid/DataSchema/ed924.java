diff --git a/server/src/main/java/io/druid/segment/indexing/DataSchema.java b/server/src/main/java/io/druid/segment/indexing/DataSchema.java
index 95f7462..cb8a489 100644
--- a/server/src/main/java/io/druid/segment/indexing/DataSchema.java
+++ b/server/src/main/java/io/druid/segment/indexing/DataSchema.java
@@ -113,7 +113,7 @@
       // exclude timestamp from dimensions by default, unless explicitly included in the list of dimensions
       if (timestampSpec != null) {
         final String timestampColumn = timestampSpec.getTimestampColumn();
-        if (!(dimensionsSpec.hasCustomDimensions() && dimensionsSpec.getDimensions().contains(timestampColumn))) {
+        if (!(dimensionsSpec.hasCustomDimensions() && dimensionsSpec.getDimensionNames().contains(timestampColumn))) {
           dimensionExclusions.add(timestampColumn);
         }
       }
