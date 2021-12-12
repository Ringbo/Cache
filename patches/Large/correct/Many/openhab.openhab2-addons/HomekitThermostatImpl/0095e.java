diff --git a/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/HomekitThermostatImpl.java b/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/HomekitThermostatImpl.java
index 8bc4625..29ed407 100644
--- a/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/HomekitThermostatImpl.java
+++ b/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/HomekitThermostatImpl.java
@@ -170,13 +170,13 @@
                 break;
         }
         StringItem item = getGenericItem(heatingCoolingModeItemName);
-        item.setState(new StringType(modeString));
+        item.send(new StringType(modeString));
     }
 
     @Override
     public void setTargetTemperature(Double value) throws Exception {
         NumberItem item = getGenericItem(targetTemperatureItemName);
-        item.setState(new DecimalType(BigDecimal.valueOf(convertFromCelsius(value))));
+        item.send(new DecimalType(BigDecimal.valueOf(convertFromCelsius(value))));
     }
 
     @Override
