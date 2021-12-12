diff --git a/processing/src/test/java/io/druid/data/input/ProtoBufInputRowParserTest.java b/processing/src/test/java/io/druid/data/input/ProtoBufInputRowParserTest.java
index 570045d..67d5fdc 100644
--- a/processing/src/test/java/io/druid/data/input/ProtoBufInputRowParserTest.java
+++ b/processing/src/test/java/io/druid/data/input/ProtoBufInputRowParserTest.java
@@ -59,8 +59,7 @@
     ProtoBufInputRowParser parser = new ProtoBufInputRowParser(
         new JSONParseSpec(
             new TimestampSpec("timestamp", "iso"),
-            new DimensionsSpec(Arrays.asList(DIMENSIONS), Arrays.<String>asList(), null),
-            JSONParseSpec.JSON
+            new DimensionsSpec(Arrays.asList(DIMENSIONS), Arrays.<String>asList(), null)
         ),
         "prototest.desc",
         null, null, null, null
