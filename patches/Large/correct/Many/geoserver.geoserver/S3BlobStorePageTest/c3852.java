diff --git a/src/community/gwc-s3/src/test/java/org/geoserver/gwc/web/blob/S3BlobStorePageTest.java b/src/community/gwc-s3/src/test/java/org/geoserver/gwc/web/blob/S3BlobStorePageTest.java
index cea84de..10905ba 100644
--- a/src/community/gwc-s3/src/test/java/org/geoserver/gwc/web/blob/S3BlobStorePageTest.java
+++ b/src/community/gwc-s3/src/test/java/org/geoserver/gwc/web/blob/S3BlobStorePageTest.java
@@ -68,7 +68,7 @@
         executeAjaxEventBehavior("selector:typeOfBlobStore", "change", "1");
         
         FormTester formTester = tester.newFormTester("blobConfigContainer:blobStoreForm");
-        formTester.setValue("id", "myblobstore");       
+        formTester.setValue("name", "myblobstore");
         formTester.setValue("enabled", false);
         formTester.setValue("blobSpecificPanel:bucket", "mybucket");
         formTester.setValue("blobSpecificPanel:awsAccessKey", "myaccesskey");
@@ -78,7 +78,7 @@
         List<BlobStoreInfo> blobStores = GWC.get().getBlobStores();
         BlobStoreInfo config = blobStores.get(0);
         assertTrue(config instanceof S3BlobStoreInfo);
-        assertEquals("myblobstore", config.getId());
+        assertEquals("myblobstore", config.getName());
         assertEquals("mybucket", ((S3BlobStoreInfo) config).getBucket());
         assertEquals("myaccesskey", ((S3BlobStoreInfo) config).getAwsAccessKey());
         assertEquals("mysecretkey", ((S3BlobStoreInfo) config).getAwsSecretKey());
@@ -90,7 +90,7 @@
     @Test
     public void testModify() throws Exception {
         S3BlobStoreInfo sconfig = new S3BlobStoreInfo();
-        Field id = BlobStoreInfo.class.getDeclaredField("id");
+        Field id = BlobStoreInfo.class.getDeclaredField("name");
         id.setAccessible(true);
         id.set(sconfig, "myblobstore");
         sconfig.setMaxConnections(50);
@@ -109,7 +109,7 @@
         tester.assertComponent("blobConfigContainer:blobStoreForm:blobSpecificPanel", S3BlobStorePanel.class);
         
         FormTester formTester = tester.newFormTester("blobConfigContainer:blobStoreForm");
-        formTester.setValue("id", "yourblobstore");
+        formTester.setValue("name", "yourblobstore");
         formTester.setValue("blobSpecificPanel:bucket", "yourbucket");
         formTester.submit();
         tester.executeAjaxEvent("blobConfigContainer:blobStoreForm:save", "click");
