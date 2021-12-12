diff --git a/hibernate-core/src/test/java/org/hibernate/test/hql/ASTParserLoadingTest.java b/hibernate-core/src/test/java/org/hibernate/test/hql/ASTParserLoadingTest.java
index e88985e..a9fae2c 100644
--- a/hibernate-core/src/test/java/org/hibernate/test/hql/ASTParserLoadingTest.java
+++ b/hibernate-core/src/test/java/org/hibernate/test/hql/ASTParserLoadingTest.java
@@ -307,7 +307,7 @@
 		results = s.createQuery( "from Human where name is not null" ).list();
 		assertEquals( 3, results.size() );
 		String query =
-				getDialect() instanceof DB2Dialect ?
+				( getDialect() instanceof DB2Dialect || getDialect() instanceof HSQLDialect ) ?
 						"from Human where cast(? as string) is null" :
 						"from Human where ? is null"
 				;
@@ -2600,14 +2600,14 @@
 		 * PostgreSQL >= 8.3.7 typecasts are no longer automatically allowed 
 		 * <link>http://www.postgresql.org/docs/current/static/release-8-3.html</link>
 		 */
-		if(getDialect() instanceof PostgreSQLDialect){
+		if(getDialect() instanceof PostgreSQLDialect || getDialect() instanceof HSQLDialect){
 			hql = "from Animal a where bit_length(str(a.bodyWeight)) = 24";
 		}else{
 			hql = "from Animal a where bit_length(a.bodyWeight) = 24";
 		}
 		
 		session.createQuery(hql).list();
-		if(getDialect() instanceof PostgreSQLDialect){
+		if(getDialect() instanceof PostgreSQLDialect || getDialect() instanceof HSQLDialect){
 			hql = "select bit_length(str(a.bodyWeight)) from Animal a";
 		}else{
 			hql = "select bit_length(a.bodyWeight) from Animal a";
