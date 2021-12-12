diff --git a/extensions/binding/org.eclipse.smarthome.binding.yahooweather/src/main/java/org/eclipse/smarthome/binding/yahooweather/handler/YahooWeatherHandler.java b/extensions/binding/org.eclipse.smarthome.binding.yahooweather/src/main/java/org/eclipse/smarthome/binding/yahooweather/handler/YahooWeatherHandler.java
index a700d6c..c59cae8 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.yahooweather/src/main/java/org/eclipse/smarthome/binding/yahooweather/handler/YahooWeatherHandler.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.yahooweather/src/main/java/org/eclipse/smarthome/binding/yahooweather/handler/YahooWeatherHandler.java
@@ -51,7 +51,7 @@
 
     private final Logger logger = LoggerFactory.getLogger(YahooWeatherHandler.class);
 
-    private String location;
+    private BigDecimal location;
     private BigDecimal refresh;
 
     private String weatherData = null;
@@ -69,7 +69,7 @@
 
         Configuration config = getThing().getConfiguration();
 
-        location = (String) config.get("location");
+        location = (BigDecimal) config.get("location");
 
         try {
             refresh = (BigDecimal) config.get("refresh");
