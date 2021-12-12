diff --git a/hibernate-envers/src/main/java/org/hibernate/envers/internal/entities/mapper/relation/query/ThreeEntityQueryGenerator.java b/hibernate-envers/src/main/java/org/hibernate/envers/internal/entities/mapper/relation/query/ThreeEntityQueryGenerator.java
index e71334b..fddc05b 100644
--- a/hibernate-envers/src/main/java/org/hibernate/envers/internal/entities/mapper/relation/query/ThreeEntityQueryGenerator.java
+++ b/hibernate-envers/src/main/java/org/hibernate/envers/internal/entities/mapper/relation/query/ThreeEntityQueryGenerator.java
@@ -96,10 +96,10 @@
 		final QueryBuilder removedQuery = commonPart.deepCopy();
 		createValidDataRestrictions(
 				globalCfg, auditStrategy, referencedIdData, versionsMiddleEntityName, validQuery,
-				validQuery.getRootParameters(), true, componentData
+				validQuery.getRootParameters(), true, indexIdData, componentData
 		);
 		createValidAndRemovedDataRestrictions(
-				globalCfg, auditStrategy, referencedIdData, versionsMiddleEntityName, removedQuery, componentData
+				globalCfg, auditStrategy, referencedIdData, versionsMiddleEntityName, removedQuery, indexIdData, componentData
 		);
 
 		queryString = queryToString( validQuery );
@@ -144,7 +144,7 @@
 	private void createValidDataRestrictions(
 			GlobalConfiguration globalCfg, AuditStrategy auditStrategy,
 			MiddleIdData referencedIdData, String versionsMiddleEntityName, QueryBuilder qb,
-			Parameters rootParameters, boolean inclusive, MiddleComponentData... componentData) {
+			Parameters rootParameters, boolean inclusive, MiddleIdData indexIdData, MiddleComponentData... componentData) {
 		final String revisionPropertyPath = verEntCfg.getRevisionNumberPath();
 		final String originalIdPropertyName = verEntCfg.getOriginalIdPropName();
 		final String eeOriginalIdPropertyPath = MIDDLE_ENTITY_ALIAS + "." + originalIdPropertyName;
@@ -174,7 +174,7 @@
 				INDEX_ENTITY_ALIAS + "." + revisionPropertyPath,
 				INDEX_ENTITY_ALIAS + "." + verEntCfg.getRevisionEndFieldName(),
 				false,
-				referencedIdData,
+				indexIdData,
 				revisionPropertyPath,
 				originalIdPropertyName,
 				INDEX_ENTITY_ALIAS,
@@ -212,7 +212,7 @@
 	private void createValidAndRemovedDataRestrictions(
 			GlobalConfiguration globalCfg, AuditStrategy auditStrategy,
 			MiddleIdData referencedIdData, String versionsMiddleEntityName,
-			QueryBuilder remQb, MiddleComponentData... componentData) {
+			QueryBuilder remQb, MiddleIdData indexIdData, MiddleComponentData... componentData) {
 		final Parameters disjoint = remQb.getRootParameters().addSubParameters( "or" );
 		// Restrictions to match all valid rows.
 		final Parameters valid = disjoint.addSubParameters( "and" );
@@ -222,7 +222,7 @@
 		final String revisionTypePropName = getRevisionTypePath();
 		// Excluding current revision, because we need to match data valid at the previous one.
 		createValidDataRestrictions(
-				globalCfg, auditStrategy, referencedIdData, versionsMiddleEntityName, remQb, valid, false, componentData
+				globalCfg, auditStrategy, referencedIdData, versionsMiddleEntityName, remQb, valid, false, indexIdData, componentData
 		);
 		// ee.revision = :revision
 		removed.addWhereWithNamedParam( revisionPropertyPath, "=", REVISION_PARAMETER );
