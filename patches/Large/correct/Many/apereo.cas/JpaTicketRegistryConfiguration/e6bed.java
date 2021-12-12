diff --git a/support/cas-server-support-jpa-ticket-registry/src/main/java/org/apereo/cas/config/JpaTicketRegistryConfiguration.java b/support/cas-server-support-jpa-ticket-registry/src/main/java/org/apereo/cas/config/JpaTicketRegistryConfiguration.java
index 193d5b4..3a7f635 100644
--- a/support/cas-server-support-jpa-ticket-registry/src/main/java/org/apereo/cas/config/JpaTicketRegistryConfiguration.java
+++ b/support/cas-server-support-jpa-ticket-registry/src/main/java/org/apereo/cas/config/JpaTicketRegistryConfiguration.java
@@ -108,6 +108,6 @@
         final TicketRegistryProperties registry = casProperties.getTicket().getRegistry();
         final String uniqueId = StringUtils.defaultIfEmpty(casProperties.getHost().getName(), InetAddressUtils.getCasServerHostName());
         return new JpaLockingStrategy("cas-ticket-registry-cleaner", uniqueId,
-            Beans.newDuration(registry.getJpa().getJpaLockingTimeout()).toMillis());
+            Beans.newDuration(registry.getJpa().getJpaLockingTimeout()).getSeconds());
     }
 }
