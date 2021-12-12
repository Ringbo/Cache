diff --git a/cas-server-core/src/test/java/org/jasig/cas/ticket/registry/AbstractTicketRegistryTests.java b/cas-server-core/src/test/java/org/jasig/cas/ticket/registry/AbstractTicketRegistryTests.java
index 5e32c34..1da379c 100644
--- a/cas-server-core/src/test/java/org/jasig/cas/ticket/registry/AbstractTicketRegistryTests.java
+++ b/cas-server-core/src/test/java/org/jasig/cas/ticket/registry/AbstractTicketRegistryTests.java
@@ -227,11 +227,11 @@
             final Service service = TestUtils.getService("TGT_DELETE_TEST");
 
             final ServiceTicket st1 = tgt.grantServiceTicket(
-                    "ST1", service, new NeverExpiresExpirationPolicy(), true);
+                    "ST1", service, new NeverExpiresExpirationPolicy(), true, false);
             final ServiceTicket st2 = tgt.grantServiceTicket(
-                    "ST2", service, new NeverExpiresExpirationPolicy(), true);
+                    "ST2", service, new NeverExpiresExpirationPolicy(), true, false);
             final ServiceTicket st3 = tgt.grantServiceTicket(
-                    "ST3", service, new NeverExpiresExpirationPolicy(), true);
+                    "ST3", service, new NeverExpiresExpirationPolicy(), true, false);
 
             this.ticketRegistry.addTicket(st1);
             this.ticketRegistry.addTicket(st2);
