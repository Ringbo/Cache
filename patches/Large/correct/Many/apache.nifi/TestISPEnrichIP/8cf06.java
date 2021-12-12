diff --git a/nifi-nar-bundles/nifi-enrich-bundle/nifi-enrich-processors/src/test/java/org/apache/nifi/processors/TestISPEnrichIP.java b/nifi-nar-bundles/nifi-enrich-bundle/nifi-enrich-processors/src/test/java/org/apache/nifi/processors/TestISPEnrichIP.java
index b1fa5ee..187d0fe 100644
--- a/nifi-nar-bundles/nifi-enrich-bundle/nifi-enrich-processors/src/test/java/org/apache/nifi/processors/TestISPEnrichIP.java
+++ b/nifi-nar-bundles/nifi-enrich-bundle/nifi-enrich-processors/src/test/java/org/apache/nifi/processors/TestISPEnrichIP.java
@@ -90,7 +90,7 @@
         testRunner.setProperty(ISPEnrichIP.GEO_DATABASE_FILE, "./");
         testRunner.setProperty(ISPEnrichIP.IP_ADDRESS_ATTRIBUTE, "ip");
 
-        final IspResponse ispResponse = getIspResponse();
+        final IspResponse ispResponse = getIspResponse("1.2.3.4");
 
         when(databaseReader.isp(InetAddress.getByName("1.2.3.4"))).thenReturn(ispResponse);
 
@@ -120,7 +120,7 @@
         testRunner.setProperty(ISPEnrichIP.GEO_DATABASE_FILE, "./");
         testRunner.setProperty(ISPEnrichIP.IP_ADDRESS_ATTRIBUTE, "ip");
 
-        final IspResponse ispResponse = getIspResponseWithoutASNDetail();
+        final IspResponse ispResponse = getIspResponseWithoutASNDetail("1.2.3.4");
 
         when(databaseReader.isp(InetAddress.getByName("1.2.3.4"))).thenReturn(ispResponse);
 
@@ -152,7 +152,7 @@
         testRunner.setProperty(ISPEnrichIP.GEO_DATABASE_FILE, "./");
         testRunner.setProperty(ISPEnrichIP.IP_ADDRESS_ATTRIBUTE, "${ip.fields:substringBefore(',')}");
 
-        final IspResponse ispResponse = getIspResponse();
+        final IspResponse ispResponse = getIspResponse("1.2.3.4");
         when(databaseReader.isp(InetAddress.getByName("1.2.3.4"))).thenReturn(ispResponse);
 
         final Map<String, String> attributes = new HashMap<>();
@@ -269,12 +269,13 @@
         verifyNoMoreInteractions(databaseReader);
     }
 
-    private IspResponse getIspResponse() throws Exception {
+    private IspResponse getIspResponse(final String ipAddress) throws Exception {
         final String maxMindIspResponse = "{\n" +
             "         \"isp\" : \"Apache NiFi - Test ISP\",\n" +
             "         \"organization\" : \"Apache NiFi - Test Organization\",\n" +
             "         \"autonomous_system_number\" : 1337,\n" +
-            "         \"autonomous_system_organization\" : \"Apache NiFi - Test Chocolate\" \n" +
+            "         \"autonomous_system_organization\" : \"Apache NiFi - Test Chocolate\", \n" +
+            "         \"ip_address\" : \"" + ipAddress + "\"\n" +
             "      }\n";
 
         InjectableValues inject = new InjectableValues.Std().addValue("locales", Collections.singletonList("en"));
@@ -282,15 +283,16 @@
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
 
 
-        return new ObjectMapper().reader(IspResponse.class).with(inject).readValue(maxMindIspResponse);
+        return new ObjectMapper().readerFor(IspResponse.class).with(inject).readValue(maxMindIspResponse);
 
     }
 
-    private IspResponse getIspResponseWithoutASNDetail() throws Exception {
+    private IspResponse getIspResponseWithoutASNDetail(final String ipAddress) throws Exception {
         final String maxMindIspResponse = "{\n" +
             "         \"isp\" : \"Apache NiFi - Test ISP\",\n" +
             "         \"organization\" : \"Apache NiFi - Test Organization\",\n" +
-            "         \"autonomous_system_number\" : null " +
+            "         \"autonomous_system_number\" : null,\n" +
+            "         \"ip_address\" : \"" + ipAddress + "\"\n" +
             "      }\n";
 
         InjectableValues inject = new InjectableValues.Std().addValue("locales", Collections.singletonList("en"));
@@ -298,7 +300,7 @@
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
 
 
-        return new ObjectMapper().reader(IspResponse.class).with(inject).readValue(maxMindIspResponse);
+        return new ObjectMapper().readerFor(IspResponse.class).with(inject).readValue(maxMindIspResponse);
     }
 
 
