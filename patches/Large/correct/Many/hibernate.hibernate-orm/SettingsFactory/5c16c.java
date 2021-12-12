diff --git a/core/src/main/java/org/hibernate/cfg/SettingsFactory.java b/core/src/main/java/org/hibernate/cfg/SettingsFactory.java
index 543b228..00521cc 100644
--- a/core/src/main/java/org/hibernate/cfg/SettingsFactory.java
+++ b/core/src/main/java/org/hibernate/cfg/SettingsFactory.java
@@ -337,7 +337,7 @@
 		settings.setNamedQueryStartupCheckingEnabled( namedQueryChecking );
 
 		boolean checkNullability = PropertiesHelper.getBoolean(Environment.CHECK_NULLABILITY, properties, true);
-		log.info( "Check Nullability in Core (should be disabled when Bean Validation is on): " + enabledDisabled(useStatistics) );
+		log.info( "Check Nullability in Core (should be disabled when Bean Validation is on): " + enabledDisabled(checkNullability) );
 		settings.setCheckNullability(checkNullability);
 
 
