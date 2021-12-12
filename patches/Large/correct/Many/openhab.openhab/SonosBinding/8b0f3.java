diff --git a/bundles/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/internal/SonosBinding.java b/bundles/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/internal/SonosBinding.java
index b1a390e..69efd55 100644
--- a/bundles/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/internal/SonosBinding.java
+++ b/bundles/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/internal/SonosBinding.java
@@ -452,7 +452,7 @@
 		@SuppressWarnings("rawtypes")
 		@Override
 		public void established(GENASubscription sub) {
-			logger.info("The GENA Subscription for serviceID {} is established for device {}",sub.getService().getServiceId(),sub.getService().getDevice());
+			logger.debug("The GENA Subscription for serviceID {} is established for device {}",sub.getService().getServiceId(),sub.getService().getDevice());
 		}
 
 		@SuppressWarnings("rawtypes")
@@ -499,7 +499,7 @@
 		@Override
 		protected void ended(GENASubscription subscription,
 				CancelReason reason, UpnpResponse responseStatus) {
-			logger.warn("The GENA Subscription for serviceID {} ended for device {}",subscription.getService().getServiceId(),subscription.getService().getDevice());
+			logger.debug("The GENA Subscription for serviceID {} ended for device {}",subscription.getService().getServiceId(),subscription.getService().getDevice());
 
 			//rebooting the GENA subscription
 			Service service = subscription.getService();			
