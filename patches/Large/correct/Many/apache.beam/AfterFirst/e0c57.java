diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterFirst.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterFirst.java
index 6b06cfa..7840fc4 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterFirst.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterFirst.java
@@ -42,7 +42,7 @@
   /**
    * Returns an {@code AfterFirst} {@code Trigger} with the given subtriggers.
    */
-  public static OnceTrigger of(OnceTrigger... triggers) {
+  public static AfterFirst of(OnceTrigger... triggers) {
     return new AfterFirst(Arrays.<Trigger>asList(triggers));
   }
 
