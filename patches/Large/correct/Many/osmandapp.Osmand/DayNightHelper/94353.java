diff --git a/OsmAnd/src/net/osmand/plus/activities/DayNightHelper.java b/OsmAnd/src/net/osmand/plus/activities/DayNightHelper.java
index 673c3c9..da291d7 100644
--- a/OsmAnd/src/net/osmand/plus/activities/DayNightHelper.java
+++ b/OsmAnd/src/net/osmand/plus/activities/DayNightHelper.java
@@ -88,7 +88,7 @@
 					Date actualTime = new Date();
 					SunriseSunset daynightSwitch = new SunriseSunset(lastKnownLocation.getLatitude(),
 																	 longitude < 0 ? 360 - longitude : longitude, actualTime,
-																	 TimeZone.getDefault().getOffset(actualTime.getTime()) / 60000);
+																	 -TimeZone.getDefault().getOffset(actualTime.getTime()) / 60000);
 					boolean daytime = daynightSwitch.isDaytime();
 					log.debug("Sunrise/sunset setting to day: " + daytime); //$NON-NLS-1$
 					lastAutoValue = Boolean.valueOf(daytime);
