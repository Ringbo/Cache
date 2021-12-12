diff --git a/api/src/test/java/org/openmrs/api/AdministrationServiceTest.java b/api/src/test/java/org/openmrs/api/AdministrationServiceTest.java
index 51f946b..5201f1d 100644
--- a/api/src/test/java/org/openmrs/api/AdministrationServiceTest.java
+++ b/api/src/test/java/org/openmrs/api/AdministrationServiceTest.java
@@ -474,7 +474,7 @@
 	@Verifies(value = "should return all global properties in the database", method = "getAllGlobalProperties()")
 	public void getAllGlobalProperties_shouldReturnAllGlobalPropertiesInTheDatabase() throws Exception {
 		executeDataSet(ADMIN_INITIAL_DATA_XML);
-		Assert.assertEquals(20, Context.getAdministrationService().getAllGlobalProperties().size());
+		Assert.assertEquals(21, Context.getAdministrationService().getAllGlobalProperties().size());
 	}
 	
 	/**
@@ -546,9 +546,9 @@
 		executeDataSet(ADMIN_INITIAL_DATA_XML);
 		AdministrationService as = Context.getAdministrationService();
 		
-		Assert.assertEquals(20, as.getAllGlobalProperties().size());
+		Assert.assertEquals(21, as.getAllGlobalProperties().size());
 		as.purgeGlobalProperty(as.getGlobalPropertyObject("a_valid_gp_key"));
-		Assert.assertEquals(19, as.getAllGlobalProperties().size());
+		Assert.assertEquals(20, as.getAllGlobalProperties().size());
 	}
 	
 	/**
