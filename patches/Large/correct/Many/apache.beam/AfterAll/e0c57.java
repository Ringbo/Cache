diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterAll.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterAll.java
index cc8c97f..0e37d33 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterAll.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterAll.java
@@ -41,7 +41,7 @@
   /**
    * Returns an {@code AfterAll} {@code Trigger} with the given subtriggers.
    */
-  public static OnceTrigger of(OnceTrigger... triggers) {
+  public static AfterAll of(OnceTrigger... triggers) {
     return new AfterAll(Arrays.<Trigger>asList(triggers));
   }
 
