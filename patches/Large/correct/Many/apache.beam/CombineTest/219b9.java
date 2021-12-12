diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineTest.java
index 52fedc6..2b5ab5a 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/CombineTest.java
@@ -451,7 +451,7 @@
         .apply(Window.<Integer>into(new GlobalWindows())
             .triggering(Repeatedly.forever(AfterPane.elementCountAtLeast(1)))
             .accumulatingFiredPanes()
-            .withAllowedLateness(new Duration(0)))
+            .withAllowedLateness(new Duration(0), ClosingBehavior.FIRE_ALWAYS))
         .apply(Sum.integersGlobally())
         .apply(ParDo.of(new FormatPaneInfo()));
 
