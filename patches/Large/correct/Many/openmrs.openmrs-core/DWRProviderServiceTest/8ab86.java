diff --git a/web/src/test/java/org/openmrs/web/dwr/DWRProviderServiceTest.java b/web/src/test/java/org/openmrs/web/dwr/DWRProviderServiceTest.java
index 76be8e9..a9f54d9 100644
--- a/web/src/test/java/org/openmrs/web/dwr/DWRProviderServiceTest.java
+++ b/web/src/test/java/org/openmrs/web/dwr/DWRProviderServiceTest.java
@@ -64,7 +64,7 @@
 	        throws Exception {
 		
 		Vector<Object> providers = service.findProvider("provider", true, 0, 10);
-		Assert.assertEquals(3, providers.size());
+		Assert.assertEquals(4, providers.size());
 		
 		Assert.assertTrue(CollectionUtils.exists(providers, new Predicate() {
 			
