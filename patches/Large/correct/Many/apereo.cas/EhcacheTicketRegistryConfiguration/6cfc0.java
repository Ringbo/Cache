diff --git a/cas-server-support-ehcache-ticket-registry/src/main/java/org/apereo/cas/config/EhcacheTicketRegistryConfiguration.java b/cas-server-support-ehcache-ticket-registry/src/main/java/org/apereo/cas/config/EhcacheTicketRegistryConfiguration.java
index 9e5e7e3..8615879 100644
--- a/cas-server-support-ehcache-ticket-registry/src/main/java/org/apereo/cas/config/EhcacheTicketRegistryConfiguration.java
+++ b/cas-server-support-ehcache-ticket-registry/src/main/java/org/apereo/cas/config/EhcacheTicketRegistryConfiguration.java
@@ -86,7 +86,7 @@
         bean.setMaxEntriesLocalDisk(casProperties.getTicket().getRegistry().getEhcache().getMaxElementsOnDisk());
         bean.setMemoryStoreEvictionPolicy(casProperties.getTicket().getRegistry().getEhcache().getMemoryStoreEvictionPolicy());
         
-        PersistenceConfiguration c = new PersistenceConfiguration();
+        final PersistenceConfiguration c = new PersistenceConfiguration();
         c.strategy(casProperties.getTicket().getRegistry().getEhcache().getPersistence());
         c.setSynchronousWrites(casProperties.getTicket().getRegistry().getEhcache().isSynchronousWrites());
         bean.persistence(c);
