diff --git a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsGeoviewsFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsGeoviewsFragment.java
index be86925..3a77f18 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsGeoviewsFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsGeoviewsFragment.java
@@ -110,7 +110,7 @@
 
                 for (int i = 0; i < countries.size(); i++) {
                     final GeoviewModel currentCountry = countries.get(i);
-                    dataToLoad.append("['").append(currentCountry.getCountryFullName()).append("',")
+                    dataToLoad.append("['").append(currentCountry.getCountryShortName()).append("',")
                             .append(currentCountry.getViews()).append("],");
                 }
 
