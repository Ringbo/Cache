diff --git a/extensions/binding/org.eclipse.smarthome.binding.onewire/src/main/java/org/eclipse/smarthome/binding/onewire/internal/handler/MultisensorThingHandler.java b/extensions/binding/org.eclipse.smarthome.binding.onewire/src/main/java/org/eclipse/smarthome/binding/onewire/internal/handler/MultisensorThingHandler.java
index d125558..7f56ff3 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.onewire/src/main/java/org/eclipse/smarthome/binding/onewire/internal/handler/MultisensorThingHandler.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.onewire/src/main/java/org/eclipse/smarthome/binding/onewire/internal/handler/MultisensorThingHandler.java
@@ -82,7 +82,7 @@
         if (configuration.get(CONFIG_DIGITALREFRESH) != null) {
             digitalRefreshInterval = ((BigDecimal) configuration.get(CONFIG_DIGITALREFRESH)).intValue() * 1000;
         } else {
-            refreshInterval = 10 * 1000;
+            digitalRefreshInterval = 10 * 1000;
         }
         digitalLastRefresh = 0;
 
