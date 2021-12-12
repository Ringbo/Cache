diff --git a/bundles/io/org.eclipse.smarthome.io.transport.upnp/src/main/java/org/eclipse/smarthome/io/transport/upnp/UpnpIOServiceImpl.java b/bundles/io/org.eclipse.smarthome.io.transport.upnp/src/main/java/org/eclipse/smarthome/io/transport/upnp/UpnpIOServiceImpl.java
index 51b7421..67d8b90 100644
--- a/bundles/io/org.eclipse.smarthome.io.transport.upnp/src/main/java/org/eclipse/smarthome/io/transport/upnp/UpnpIOServiceImpl.java
+++ b/bundles/io/org.eclipse.smarthome.io.transport.upnp/src/main/java/org/eclipse/smarthome/io/transport/upnp/UpnpIOServiceImpl.java
@@ -46,6 +46,8 @@
  * @author Kai Kreuzer - added descriptor url retrieval
  * @author Markus Rathgeb - added NP checks in subscription ended callback
  * @author Andre Fuechsel - added methods to remove subscriptions
+ * @author Ivan Iliev - made sure resubscribe is only done when subscription ended CancelReason was EXPIRED or
+ *         RENEW_FAILED
  */
 @SuppressWarnings("rawtypes")
 public class UpnpIOServiceImpl implements UpnpIOService {
@@ -91,7 +93,7 @@
                     }
                 }
 
-                if (upnpService != null) {
+                if ((CancelReason.EXPIRED.equals(reason) || CancelReason.RENEWAL_FAILED.equals(reason)) && upnpService != null) {
                     final ControlPoint cp = upnpService.getControlPoint();
                     if (cp != null) {
                         final UpnpSubscriptionCallback callback = new UpnpSubscriptionCallback(service,
