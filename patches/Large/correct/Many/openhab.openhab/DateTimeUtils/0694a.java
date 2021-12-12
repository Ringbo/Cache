diff --git a/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/util/DateTimeUtils.java b/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/util/DateTimeUtils.java
index 6bb8b5e..b9ba834 100644
--- a/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/util/DateTimeUtils.java
+++ b/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/util/DateTimeUtils.java
@@ -38,7 +38,7 @@
 	public static Range getRange(int startMonth, int startDay, int endMonth, int endDay) {
 		Calendar start = Calendar.getInstance();
 		start.set(Calendar.MONTH, startMonth);
-		start.set(Calendar.DAY_OF_MONTH, startMonth);
+		start.set(Calendar.DAY_OF_MONTH, startDay);
 		start = truncateToMidnight(start);
 
 		Calendar end = Calendar.getInstance();
