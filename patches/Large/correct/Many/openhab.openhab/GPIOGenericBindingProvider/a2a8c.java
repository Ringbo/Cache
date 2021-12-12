diff --git a/bundles/binding/org.openhab.binding.gpio/src/main/java/org/openhab/binding/gpio/internal/GPIOGenericBindingProvider.java b/bundles/binding/org.openhab.binding.gpio/src/main/java/org/openhab/binding/gpio/internal/GPIOGenericBindingProvider.java
index 90763e3..99f9fa7 100644
--- a/bundles/binding/org.openhab.binding.gpio/src/main/java/org/openhab/binding/gpio/internal/GPIOGenericBindingProvider.java
+++ b/bundles/binding/org.openhab.binding.gpio/src/main/java/org/openhab/binding/gpio/internal/GPIOGenericBindingProvider.java
@@ -108,7 +108,7 @@
         /* Configuration string should be in the form "pin:NUMBER [debounse:NUMBER] [activelow:yes|no]" */
         String[] properties = bindingConfig.split(" ");
 
-        if (properties.length > 3) {
+        if (properties.length > 4) {
             logger.error("Wrong number of arguments (" + properties.length + ") in configuration string '"
                     + bindingConfig + "'");
             throw new BindingConfigParseException("Wrong number of agruments (" + properties.length
