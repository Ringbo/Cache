diff --git a/support/cas-server-support-radius/src/test/java/org/apereo/cas/config/RadiusConfigurationTests.java b/support/cas-server-support-radius/src/test/java/org/apereo/cas/config/RadiusConfigurationTests.java
index 8cf7d16..036fb9c 100644
--- a/support/cas-server-support-radius/src/test/java/org/apereo/cas/config/RadiusConfigurationTests.java
+++ b/support/cas-server-support-radius/src/test/java/org/apereo/cas/config/RadiusConfigurationTests.java
@@ -44,17 +44,17 @@
 
     @Test
     public void emptyAddress() {
-        RadiusClientProperties clientProperties = new RadiusClientProperties();
+        final RadiusClientProperties clientProperties = new RadiusClientProperties();
         clientProperties.setInetAddress("  ");
-        Set<String> ips = RadiusConfiguration.getClientIps(clientProperties);
+        final Set<String> ips = RadiusConfiguration.getClientIps(clientProperties);
         assertEquals(0, ips.size());
     }
 
     @Test
     public void someAddressesWithSpaces() {
-        RadiusClientProperties clientProperties = new RadiusClientProperties();
+        final RadiusClientProperties clientProperties = new RadiusClientProperties();
         clientProperties.setInetAddress("localhost,  localguest  ");
-        Set<String> ips = RadiusConfiguration.getClientIps(clientProperties);
+        final Set<String> ips = RadiusConfiguration.getClientIps(clientProperties);
         assertEquals(2, ips.size());
         assertTrue(ips.contains("localhost"));
         assertTrue(ips.contains("localguest"));
