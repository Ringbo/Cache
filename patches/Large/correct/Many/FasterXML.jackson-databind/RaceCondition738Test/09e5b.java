diff --git a/src/test/java/com/fasterxml/jackson/databind/misc/RaceCondition738Test.java b/src/test/java/com/fasterxml/jackson/databind/misc/RaceCondition738Test.java
index 171ee85..bb5bb34 100644
--- a/src/test/java/com/fasterxml/jackson/databind/misc/RaceCondition738Test.java
+++ b/src/test/java/com/fasterxml/jackson/databind/misc/RaceCondition738Test.java
@@ -56,7 +56,7 @@
      */
     
     public void testRepeatedly() throws Exception {
-        final int COUNT = 2000;
+        final int COUNT = 3000;
         for (int i = 0; i < COUNT; i++) {
             runOnce(i, COUNT);
         }
