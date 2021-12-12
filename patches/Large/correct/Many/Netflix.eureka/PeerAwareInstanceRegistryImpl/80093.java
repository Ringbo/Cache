diff --git a/eureka-core/src/main/java/com/netflix/eureka/registry/PeerAwareInstanceRegistryImpl.java b/eureka-core/src/main/java/com/netflix/eureka/registry/PeerAwareInstanceRegistryImpl.java
index f04863f..f6e7215 100644
--- a/eureka-core/src/main/java/com/netflix/eureka/registry/PeerAwareInstanceRegistryImpl.java
+++ b/eureka-core/src/main/java/com/netflix/eureka/registry/PeerAwareInstanceRegistryImpl.java
@@ -531,8 +531,8 @@
             }
             synchronized (lock) {
                 // Update threshold only if the threshold is greater than the
-                // current expected threshold of if the self preservation is disabled.
-                if ((count * 2) > (serverConfig.getRenewalPercentThreshold() * numberOfRenewsPerMinThreshold)
+                // current expected threshold or if self preservation is disabled.
+                if ((count * 2) > (serverConfig.getRenewalPercentThreshold() * expectedNumberOfRenewsPerMin)
                         || (!this.isSelfPreservationModeEnabled())) {
                     this.expectedNumberOfRenewsPerMin = count * 2;
                     this.numberOfRenewsPerMinThreshold = (int) ((count * 2) * serverConfig.getRenewalPercentThreshold());
