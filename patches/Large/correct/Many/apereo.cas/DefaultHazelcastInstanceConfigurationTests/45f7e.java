diff --git a/support/cas-server-support-hazelcast-ticket-registry/src/test/java/org/apereo/cas/ticket/registry/DefaultHazelcastInstanceConfigurationTests.java b/support/cas-server-support-hazelcast-ticket-registry/src/test/java/org/apereo/cas/ticket/registry/DefaultHazelcastInstanceConfigurationTests.java
index 820250a..5c300a0 100644
--- a/support/cas-server-support-hazelcast-ticket-registry/src/test/java/org/apereo/cas/ticket/registry/DefaultHazelcastInstanceConfigurationTests.java
+++ b/support/cas-server-support-hazelcast-ticket-registry/src/test/java/org/apereo/cas/ticket/registry/DefaultHazelcastInstanceConfigurationTests.java
@@ -106,7 +106,7 @@
         assertEquals(Arrays.asList("localhost"), config.getNetworkConfig().getJoin().getTcpIpConfig().getMembers());
         assertTrue(config.getNetworkConfig().isPortAutoIncrement());
         assertEquals(5701, config.getNetworkConfig().getPort());
-        assertEquals(2, config.getMapConfigs().size());
+        assertEquals(4, config.getMapConfigs().size());
     }
 
     @After
