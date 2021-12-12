diff --git a/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java b/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java
index 33a4072..1f3ba87 100644
--- a/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java
+++ b/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java
@@ -147,7 +147,7 @@
 	 *
 	 * @param sql an sql query
 	 */
-	protected void replaceDistinctWithGroupBy(StringBuilder sql) {
+	protected static void replaceDistinctWithGroupBy(StringBuilder sql) {
 		int distinctIndex = sql.indexOf( DISTINCT );
 		int selectEndIndex = sql.indexOf( FROM );
 		if (distinctIndex > 0 && distinctIndex < selectEndIndex) {
@@ -164,7 +164,7 @@
 	 *
 	 * @return the fields of the select statement without their alias
 	 */
-	protected CharSequence getSelectFieldsWithoutAliases(StringBuilder sql) {
+	protected static CharSequence getSelectFieldsWithoutAliases(StringBuilder sql) {
 		String select = sql.substring( sql.indexOf( SELECT ) + SELECT.length(), sql.indexOf( FROM ) );
 
 		// Strip the as clauses
@@ -178,7 +178,7 @@
 	 *
 	 * @return a string without the as statements
 	 */
-	protected String stripAliases(String str) {
+	protected static String stripAliases(String str) {
 		Matcher matcher = ALIAS_PATTERN.matcher( str );
 		return matcher.replaceAll( "$1" );
 	}
