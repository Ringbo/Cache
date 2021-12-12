diff --git a/web/src/main/java/org/openmrs/web/controller/provider/ProviderFormController.java b/web/src/main/java/org/openmrs/web/controller/provider/ProviderFormController.java
index 529a12d..55b45e6 100644
--- a/web/src/main/java/org/openmrs/web/controller/provider/ProviderFormController.java
+++ b/web/src/main/java/org/openmrs/web/controller/provider/ProviderFormController.java
@@ -112,7 +112,7 @@
 	
 	@ModelAttribute("providerAttributeTypes")
 	public List<ProviderAttributeType> getProviderAttributeTypes() throws Exception {
-		return Context.getProviderService().getAllProviderAttributeTypes(false);
+		return Context.getProviderService().getAllProviderAttributeTypes(true);
 	}
 	
 	@RequestMapping(method = RequestMethod.GET)
