diff --git a/DataExtractionOSM/src/net/osmand/SunriseSunset.java b/DataExtractionOSM/src/net/osmand/SunriseSunset.java
index 2741bec..92d089c 100644
--- a/DataExtractionOSM/src/net/osmand/SunriseSunset.java
+++ b/DataExtractionOSM/src/net/osmand/SunriseSunset.java
@@ -266,7 +266,7 @@
 		// Calculate internal representation of timezone offset as fraction of hours from GMT
 		// Our calculations consider offsets to the West as positive, so we must invert
 		// the signal of the values provided by the standard library
-		double dfTimeZoneIn = -1.0 * tzIn.getOffset(dateInputIn.getTime()) / 3600000;
+		double dfTimeZoneIn = 1.0 * tzIn.getOffset(dateInputIn.getTime()) / 3600000;
 
 		// Copy values supplied as agruments to local variables.
 		dfLat 		= dfLatIn;
@@ -611,7 +611,7 @@
 			dfmtDateTime = new SimpleDateFormat( "d M yyyy HH:mm z" );
 
 			// Timezone signal is reversed in SunriseSunset class
-			String tz_signal = origTimeZone <= 0?"+":"-";
+			String tz_signal = origTimeZone <= 0?"-":"+";
 			double abs_tz = Math.abs(origTimeZone);
 			NumberFormat formatter = new DecimalFormat("00");
 
