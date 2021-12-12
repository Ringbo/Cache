diff --git a/examples/src/main/java/org/apache/ignite/examples/streaming/StreamingPopularNumbersExample.java b/examples/src/main/java/org/apache/ignite/examples/streaming/StreamingPopularNumbersExample.java
index 29cc2c1..a298932 100644
--- a/examples/src/main/java/org/apache/ignite/examples/streaming/StreamingPopularNumbersExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/streaming/StreamingPopularNumbersExample.java
@@ -145,9 +145,8 @@
                     stmr.allowOverwrite(true);
 
                     // Transform data when processing.
-                    stmr.receiver(new StreamTransformer<>(new EntryProcessor<Integer, Long, Object>() {
-                        @Override
-                        public Object process(MutableEntry<Integer, Long> e, Object... args) {
+                    stmr.receiver(new StreamTransformer<>(new CacheEntryProcessor<Integer, Long, Object>() {
+                        @Override public Object process(MutableEntry<Integer, Long> e, Object... args) {
                             Long val = e.getValue();
 
                             e.setValue(val == null ? 1L : val + 1);
