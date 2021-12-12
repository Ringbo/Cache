diff --git a/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/AstroCalculator.java b/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/AstroCalculator.java
index 3611dbb..5a11dbe 100644
--- a/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/AstroCalculator.java
+++ b/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/AstroCalculator.java
@@ -64,7 +64,7 @@
   }
 
   private int getTimeZone() {
-    return calendar.getTimeZone().getDSTSavings() / 3600000;
+    return calendar.getTimeZone().getRawOffset() / 3600000;
   }
 
   private boolean isDaylightSavingTime() {
