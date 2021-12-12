diff --git a/src/api/org/openmrs/api/impl/AdministrationServiceImpl.java b/src/api/org/openmrs/api/impl/AdministrationServiceImpl.java
index 20c6ee8..1deea7d 100644
--- a/src/api/org/openmrs/api/impl/AdministrationServiceImpl.java
+++ b/src/api/org/openmrs/api/impl/AdministrationServiceImpl.java
@@ -898,7 +898,7 @@
 		if (globalLocaleList == null) {
 			globalLocaleList = new GlobalLocaleList();
 			addGlobalPropertyListener(globalLocaleList);
-			String currentPropertyValue = getGlobalProperty(OpenmrsConstants.GLOBAL_PROPERTY_LOCALE_ALLOWED_LIST);
+			String currentPropertyValue = getGlobalProperty(OpenmrsConstants.GLOBAL_PROPERTY_LOCALE_ALLOWED_LIST, "");
 			GlobalProperty allowedLocalesProperty = new GlobalProperty(OpenmrsConstants.GLOBAL_PROPERTY_LOCALE_ALLOWED_LIST,
 			        currentPropertyValue);
 			globalLocaleList.globalPropertyChanged(allowedLocalesProperty);
