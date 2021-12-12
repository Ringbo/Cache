diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Never.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Never.java
index 5f20465..353258b 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Never.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/Never.java
@@ -34,7 +34,7 @@
    * Returns a trigger which never fires. Output will be produced from the using {@link GroupByKey}
    * when the {@link BoundedWindow} closes.
    */
-  public static OnceTrigger ever() {
+  public static NeverTrigger ever() {
     // NeverTrigger ignores all inputs and is Window-type independent.
     return new NeverTrigger();
   }
