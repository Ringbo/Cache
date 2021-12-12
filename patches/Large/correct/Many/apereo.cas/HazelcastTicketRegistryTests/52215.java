diff --git a/cas-server-integration-hazelcast/src/test/java/org/jasig/cas/ticket/registry/HazelcastTicketRegistryTests.java b/cas-server-integration-hazelcast/src/test/java/org/jasig/cas/ticket/registry/HazelcastTicketRegistryTests.java
index 59d6e603..0fed8c5 100644
--- a/cas-server-integration-hazelcast/src/test/java/org/jasig/cas/ticket/registry/HazelcastTicketRegistryTests.java
+++ b/cas-server-integration-hazelcast/src/test/java/org/jasig/cas/ticket/registry/HazelcastTicketRegistryTests.java
@@ -92,11 +92,11 @@
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
 
         this.hzTicketRegistry1.addTicket(st1);
         this.hzTicketRegistry1.addTicket(st2);
