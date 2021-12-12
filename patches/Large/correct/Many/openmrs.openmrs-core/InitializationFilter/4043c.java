diff --git a/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java b/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java
index 3fb4062..c1511aa 100644
--- a/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java
+++ b/web/src/main/java/org/openmrs/web/filter/initialization/InitializationFilter.java
@@ -645,7 +645,7 @@
 				if (InitializationWizardModel.INSTALL_METHOD_SIMPLE.equals(wizardModel.installMethod)) {
 					page = SIMPLE_SETUP;
 				} else if (InitializationWizardModel.INSTALL_METHOD_TESTING.equals(wizardModel.installMethod)) {
-					page = TESTING_AUTHENTICATION_SETUP;
+					page = DATABASE_TABLES_AND_USER;
 				} else {
 					page = IMPLEMENTATION_ID_SETUP;
 				}
