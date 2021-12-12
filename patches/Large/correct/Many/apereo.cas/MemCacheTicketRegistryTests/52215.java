diff --git a/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java b/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java
index 1a5b03a..32fafce 100644
--- a/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java
+++ b/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java
@@ -156,11 +156,11 @@
         final Service service = TestUtils.getService("TGT_DELETE_TEST");
 
         final ServiceTicket st1 = tgt.grantServiceTicket(
-                "ST1", service, new NeverExpiresExpirationPolicy(), true);
+                "ST1", service, new NeverExpiresExpirationPolicy(), true, false);
         final ServiceTicket st2 = tgt.grantServiceTicket(
-                "ST2", service, new NeverExpiresExpirationPolicy(), true);
+                "ST2", service, new NeverExpiresExpirationPolicy(), true, false);
         final ServiceTicket st3 = tgt.grantServiceTicket(
-                "ST3", service, new NeverExpiresExpirationPolicy(), true);
+                "ST3", service, new NeverExpiresExpirationPolicy(), true, false);
 
         this.registry.addTicket(st1);
         this.registry.addTicket(st2);
