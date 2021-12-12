diff --git a/processing/src/main/java/io/druid/data/input/ProtoBufInputRowParser.java b/processing/src/main/java/io/druid/data/input/ProtoBufInputRowParser.java
index 4a449ef..df8bdb5 100644
--- a/processing/src/main/java/io/druid/data/input/ProtoBufInputRowParser.java
+++ b/processing/src/main/java/io/druid/data/input/ProtoBufInputRowParser.java
@@ -69,8 +69,7 @@
     if (parseSpec == null) {
       this.parseSpec = new JSONParseSpec(
           timestampSpec,
-          new DimensionsSpec(dimensions, dimensionExclusions, spatialDimensions),
-          JSONParseSpec.JSON
+          new DimensionsSpec(dimensions, dimensionExclusions, spatialDimensions)
       );
     } else {
       this.parseSpec = parseSpec;
