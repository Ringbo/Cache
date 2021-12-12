diff --git a/app/src/main/java/ru/gelin/android/weather/notification/ParcelableWeather2.java b/app/src/main/java/ru/gelin/android/weather/notification/ParcelableWeather2.java
index d7b4267..8defe1e 100644
--- a/app/src/main/java/ru/gelin/android/weather/notification/ParcelableWeather2.java
+++ b/app/src/main/java/ru/gelin/android/weather/notification/ParcelableWeather2.java
@@ -52,7 +52,7 @@
             if (--conditions > 0) {
                 Bundle forecastBundle = in.readBundle();
                 forecastConditionType = forecastBundle.getStringArray("weather_condition_types");
-                forecastConditionCode = weatherConditionTypesToOpenWeatherMapIds(currentConditionType[0]);
+                forecastConditionCode = weatherConditionTypesToOpenWeatherMapIds(forecastConditionType[0]);
             }
         }
         // get the rest
