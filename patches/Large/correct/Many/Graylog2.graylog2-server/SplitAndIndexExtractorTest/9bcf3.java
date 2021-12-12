diff --git a/graylog2-server/src/test/java/org/graylog2/inputs/extractors/SplitAndIndexExtractorTest.java b/graylog2-server/src/test/java/org/graylog2/inputs/extractors/SplitAndIndexExtractorTest.java
index 3ebcdcd..f59035c 100644
--- a/graylog2-server/src/test/java/org/graylog2/inputs/extractors/SplitAndIndexExtractorTest.java
+++ b/graylog2-server/src/test/java/org/graylog2/inputs/extractors/SplitAndIndexExtractorTest.java
@@ -87,10 +87,10 @@
     public void testBasicExtractionWithCutStrategyCanOverwriteSameField() throws Exception {
         Message msg = new Message("The short message", "TestUnit", Tools.getUTCTimestampWithMilliseconds());
 
-        SplitAndIndexExtractor x = new SplitAndIndexExtractor("foo", "foo", Extractor.CursorStrategy.CUT, "message", "message", config(" ", 0), "foo", noConverters(), Extractor.ConditionType.NONE, null);
+        SplitAndIndexExtractor x = new SplitAndIndexExtractor("foo", "foo", Extractor.CursorStrategy.CUT, "message", "message", config(" ", 1), "foo", noConverters(), Extractor.ConditionType.NONE, null);
         x.runExtractor(new GraylogServerStub(), msg);
 
-        assertEquals("short message", msg.getField("message"));
+        assertEquals("short", msg.getField("message"));
     }
     @Test
     public void testBasicExtractionWithCutStrategyAtEndOfString() throws Exception {
