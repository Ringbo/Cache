diff --git a/dubbo-metadata-report/dubbo-metadata-report-api/src/test/java/org/apache/dubbo/metadata/integration/MetadataReportServiceTest.java b/dubbo-metadata-report/dubbo-metadata-report-api/src/test/java/org/apache/dubbo/metadata/integration/MetadataReportServiceTest.java
index 343c910..ffd35d0 100644
--- a/dubbo-metadata-report/dubbo-metadata-report-api/src/test/java/org/apache/dubbo/metadata/integration/MetadataReportServiceTest.java
+++ b/dubbo-metadata-report/dubbo-metadata-report-api/src/test/java/org/apache/dubbo/metadata/integration/MetadataReportServiceTest.java
@@ -78,7 +78,7 @@
 
         URL publishUrl = URL.valueOf("dubbo://" + NetUtils.getLocalAddress().getHostName() + ":4444/org.apache.dubbo.TestService?version=1.0.3&application=vicpubp&interface=org.apache.dubbo.metadata.integration.InterfaceNameTestService");
         metadataReportService1.publishProvider(publishUrl);
-        Thread.sleep(100);
+        Thread.sleep(300);
 
         Assert.assertTrue(metadataReportService1.metadataReport instanceof JTestMetadataReport4Test);
 
@@ -98,7 +98,7 @@
 
         URL publishUrl = URL.valueOf("dubbo://" + NetUtils.getLocalAddress().getHostName() + ":4444/org.apache.dubbo.TestService?version=1.0.x&application=vicpubconsumer&side=consumer");
         metadataReportService1.publishConsumer(publishUrl);
-        Thread.sleep(100);
+        Thread.sleep(300);
 
         Assert.assertTrue(metadataReportService1.metadataReport instanceof JTestMetadataReport4Test);
 
