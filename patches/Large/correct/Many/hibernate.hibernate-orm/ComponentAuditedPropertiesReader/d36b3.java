diff --git a/hibernate-envers/src/main/java/org/hibernate/envers/configuration/internal/metadata/reader/ComponentAuditedPropertiesReader.java b/hibernate-envers/src/main/java/org/hibernate/envers/configuration/internal/metadata/reader/ComponentAuditedPropertiesReader.java
index 0d945eb..fa7d250 100644
--- a/hibernate-envers/src/main/java/org/hibernate/envers/configuration/internal/metadata/reader/ComponentAuditedPropertiesReader.java
+++ b/hibernate-envers/src/main/java/org/hibernate/envers/configuration/internal/metadata/reader/ComponentAuditedPropertiesReader.java
@@ -38,13 +38,13 @@
 public class ComponentAuditedPropertiesReader extends AuditedPropertiesReader {
 
 	public ComponentAuditedPropertiesReader(
-			boolean defaultAudited,
+			ModificationStore defaultStore,
 			PersistentPropertiesSource persistentPropertiesSource,
 			AuditedPropertiesHolder auditedPropertiesHolder,
 			GlobalConfiguration globalCfg, ReflectionManager reflectionManager,
 			String propertyNamePrefix) {
 		super(
-				defaultAudited, persistentPropertiesSource, auditedPropertiesHolder,
+				defaultStore, persistentPropertiesSource, auditedPropertiesHolder,
 				globalCfg, reflectionManager, propertyNamePrefix
 		);
 	}
