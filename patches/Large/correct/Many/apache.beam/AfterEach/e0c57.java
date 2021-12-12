diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterEach.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterEach.java
index 629c640..961d97f 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterEach.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterEach.java
@@ -54,7 +54,7 @@
    * Returns an {@code AfterEach} {@code Trigger} with the given subtriggers.
    */
   @SafeVarargs
-  public static Trigger inOrder(Trigger... triggers) {
+  public static AfterEach inOrder(Trigger... triggers) {
     return new AfterEach(Arrays.<Trigger>asList(triggers));
   }
 
