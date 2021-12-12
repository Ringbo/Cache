diff --git a/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexBinding.java b/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexBinding.java
index 69b01a4..d8d4713 100644
--- a/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexBinding.java
+++ b/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexBinding.java
@@ -244,7 +244,10 @@
 		for (PlexBindingProvider provider : providers) {
 			for (String itemName : provider.getItemNames()) {
 				PlexBindingConfig config = provider.getConfig(itemName);
-				if (session.getMachineIdentifier().equals(config.getMachineIdentifier()))
+				// In newer PMS versions, the machine identifier in the session also contains the type 
+				// of media that is playing (<id>_Video for example). We'll keep it backwards compatible
+				// by only matching the first part of the machine identifier.
+				if (session.getMachineIdentifier().startsWith(config.getMachineIdentifier()))
 					updateConfigFromSession(config, session);
 			}
 		}
