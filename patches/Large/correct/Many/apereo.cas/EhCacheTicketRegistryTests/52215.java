diff --git a/cas-server-integration-ehcache/src/test/java/org/jasig/cas/ticket/registry/EhCacheTicketRegistryTests.java b/cas-server-integration-ehcache/src/test/java/org/jasig/cas/ticket/registry/EhCacheTicketRegistryTests.java
index 5f2343e..ef6c2cd 100644
--- a/cas-server-integration-ehcache/src/test/java/org/jasig/cas/ticket/registry/EhCacheTicketRegistryTests.java
+++ b/cas-server-integration-ehcache/src/test/java/org/jasig/cas/ticket/registry/EhCacheTicketRegistryTests.java
@@ -253,11 +253,11 @@
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
 
         this.ticketRegistry.addTicket(st1);
         this.ticketRegistry.addTicket(st2);
