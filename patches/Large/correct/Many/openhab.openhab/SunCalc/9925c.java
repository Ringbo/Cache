diff --git a/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/SunCalc.java b/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/SunCalc.java
index b67696b..986ca97 100644
--- a/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/SunCalc.java
+++ b/bundles/binding/org.openhab.binding.astro/src/main/java/org/openhab/binding/astro/internal/calc/SunCalc.java
@@ -82,7 +82,7 @@
 		Calendar cal = DateTimeUtils.truncateToMidnight(calendar);
 		Sun sun = new Sun();
 		for (int minutes = 0; minutes <= MINUTES_PER_DAY; minutes += CURVE_TIME_INTERVAL) {
-			setSunPosition(calendar, latitude, longitude, sun);
+			setSunPosition(cal, latitude, longitude, sun);
 			if (sun.getPosition().getElevation() < SUN_ANGLE) {
 				return false;
 			}
