diff --git a/src/api/org/openmrs/api/context/Context.java b/src/api/org/openmrs/api/context/Context.java
index f9e3974..005f2d7 100644
--- a/src/api/org/openmrs/api/context/Context.java
+++ b/src/api/org/openmrs/api/context/Context.java
@@ -965,7 +965,7 @@
 					GlobalProperty propToUpdate = propsMissingDescription.get(corePropName);
 					if (propToUpdate != null) {
 						propToUpdate.setDescription(coreProp.getDescription());
-						Context.getAdministrationService().saveGlobalProperty(coreProp);
+						Context.getAdministrationService().saveGlobalProperty(propToUpdate);
 					}
 				}
 			}
