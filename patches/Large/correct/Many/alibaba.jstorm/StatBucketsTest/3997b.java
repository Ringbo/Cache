diff --git a/jstorm-core/src/test/java/com/alibaba/jstorm/common/metric/old/window/StatBucketsTest.java b/jstorm-core/src/test/java/com/alibaba/jstorm/common/metric/old/window/StatBucketsTest.java
index 57b3a26..7c35784 100644
--- a/jstorm-core/src/test/java/com/alibaba/jstorm/common/metric/old/window/StatBucketsTest.java
+++ b/jstorm-core/src/test/java/com/alibaba/jstorm/common/metric/old/window/StatBucketsTest.java
@@ -9,19 +9,19 @@
 
     public void testPrettyUptime() throws Exception {
         int secs = 10860;
-        assertEquals("3h 1m 0s", StatBuckets.prettyUptime(secs));
+        assertEquals("3h 1m 0s", StatBuckets.prettyUptimeStr(secs));
 
         secs = 203010;
-        assertEquals("2d 8h 23m 30s", StatBuckets.prettyUptime(secs));
+        assertEquals("2d 8h 23m 30s", StatBuckets.prettyUptimeStr(secs));
 
         secs = 234;
-        assertEquals("3m 54s", StatBuckets.prettyUptime(secs));
+        assertEquals("3m 54s", StatBuckets.prettyUptimeStr(secs));
 
         secs = 32;
-        assertEquals("32s", StatBuckets.prettyUptime(secs));
+        assertEquals("32s", StatBuckets.prettyUptimeStr(secs));
 
         secs = 0;
-        assertEquals("0s", StatBuckets.prettyUptime(secs));
+        assertEquals("0s", StatBuckets.prettyUptimeStr(secs));
 
     }
 }
\ No newline at end of file
