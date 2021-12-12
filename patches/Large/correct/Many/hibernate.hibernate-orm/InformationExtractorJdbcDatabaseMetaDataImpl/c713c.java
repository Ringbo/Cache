diff --git a/hibernate-core/src/main/java/org/hibernate/tool/schema/extract/internal/InformationExtractorJdbcDatabaseMetaDataImpl.java b/hibernate-core/src/main/java/org/hibernate/tool/schema/extract/internal/InformationExtractorJdbcDatabaseMetaDataImpl.java
index 79cc34c..36c8e66 100644
--- a/hibernate-core/src/main/java/org/hibernate/tool/schema/extract/internal/InformationExtractorJdbcDatabaseMetaDataImpl.java
+++ b/hibernate-core/src/main/java/org/hibernate/tool/schema/extract/internal/InformationExtractorJdbcDatabaseMetaDataImpl.java
@@ -362,7 +362,7 @@
 			boolean found = false;
 			TableInformation tableInformation = null;
 			while ( resultSet.next() ) {
-				if ( tableName.equals( identifierHelper().toIdentifier( resultSet.getString( "TABLE_NAME" ) ) ) ) {
+				if ( tableName.equals( identifierHelper().toIdentifier( resultSet.getString( "TABLE_NAME" ), tableName.isQuoted() ) ) ) {
 					if ( found ) {
 						log.multipleTablesFound( tableName.render() );
 						final String catalogName = catalog == null ? "" : catalog.render();
