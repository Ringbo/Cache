diff --git a/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/core/realtime/SegmentCompletionTest.java b/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/core/realtime/SegmentCompletionTest.java
index 5ea2b9a..8cb31db 100644
--- a/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/core/realtime/SegmentCompletionTest.java
+++ b/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/core/realtime/SegmentCompletionTest.java
@@ -751,8 +751,8 @@
   public void testHappyPathSlowCommit() throws Exception {
     SegmentCompletionProtocol.Response response;
     Request.Params params;
-    // s1 sends offset of 20, gets HOLD at t = 5s;
-    final long startTime = 5;
+    // s1 sends offset of 20, gets HOLD at t = 1509242466s;
+    final long startTime = 1509242466;
     final String tableName = new LLCSegmentName(segmentNameStr).getTableName();
     Assert.assertNull(commitTimeMap.get(tableName));
     segmentCompletionMgr._secconds = startTime;
