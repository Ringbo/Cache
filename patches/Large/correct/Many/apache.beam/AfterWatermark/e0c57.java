diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterWatermark.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterWatermark.java
index da96de3..89c1ba9 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterWatermark.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/AfterWatermark.java
@@ -102,11 +102,11 @@
       this.lateTrigger = lateTrigger;
     }
 
-    public Trigger withEarlyFirings(OnceTrigger earlyTrigger) {
+    public AfterWatermarkEarlyAndLate withEarlyFirings(OnceTrigger earlyTrigger) {
       return new AfterWatermarkEarlyAndLate(earlyTrigger, lateTrigger);
     }
 
-    public Trigger withLateFirings(OnceTrigger lateTrigger) {
+    public AfterWatermarkEarlyAndLate withLateFirings(OnceTrigger lateTrigger) {
       return new AfterWatermarkEarlyAndLate(earlyTrigger, lateTrigger);
     }
 
