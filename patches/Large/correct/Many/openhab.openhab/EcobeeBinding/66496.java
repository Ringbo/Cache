diff --git a/bundles/binding/org.openhab.binding.ecobee/src/main/java/org/openhab/binding/ecobee/internal/EcobeeBinding.java b/bundles/binding/org.openhab.binding.ecobee/src/main/java/org/openhab/binding/ecobee/internal/EcobeeBinding.java
index d487457..78d1377 100644
--- a/bundles/binding/org.openhab.binding.ecobee/src/main/java/org/openhab/binding/ecobee/internal/EcobeeBinding.java
+++ b/bundles/binding/org.openhab.binding.ecobee/src/main/java/org/openhab/binding/ecobee/internal/EcobeeBinding.java
@@ -339,7 +339,8 @@
 		// Iterate through bindings and update all inbound values.
 		for (final EcobeeBindingProvider provider : this.providers) {
 			for (final String itemName : provider.getItemNames()) {
-				if (provider.isInBound(itemName) && credentialsMatch(provider, itemName, oauthCredentials)) {
+				if (provider.isInBound(itemName) && credentialsMatch(provider, itemName, oauthCredentials)
+						&& thermostats.containsKey(provider.getThermostatIdentifier(itemName))) {
 					final State newState = getState(provider, thermostats, itemName);
 
 					logger.debug("readEcobee: Updating itemName '{}' with newState '{}'", itemName, newState);
