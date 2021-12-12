diff --git a/org.springframework.orm/src/main/java/org/springframework/orm/jpa/persistenceunit/DefaultPersistenceUnitManager.java b/org.springframework.orm/src/main/java/org/springframework/orm/jpa/persistenceunit/DefaultPersistenceUnitManager.java
index c4ad75f..2afd92a 100644
--- a/org.springframework.orm/src/main/java/org/springframework/orm/jpa/persistenceunit/DefaultPersistenceUnitManager.java
+++ b/org.springframework.orm/src/main/java/org/springframework/orm/jpa/persistenceunit/DefaultPersistenceUnitManager.java
@@ -390,7 +390,7 @@
 	private SpringPersistenceUnitInfo buildDefaultPersistenceUnitInfo() {
 		SpringPersistenceUnitInfo scannedUnit = new SpringPersistenceUnitInfo();
 		scannedUnit.setPersistenceUnitName(this.defaultPersistenceUnitName);
-		scannedUnit.excludeUnlistedClasses();
+		scannedUnit.setExcludeUnlistedClasses(true);
 		if (this.packagesToScan != null) {
 			for (String pkg : this.packagesToScan) {
 				try {
