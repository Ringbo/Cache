diff --git a/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java b/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java
index 6c2e004..33a4072 100644
--- a/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java
+++ b/hibernate-core/src/main/java/org/hibernate/dialect/SQLServer2005Dialect.java
@@ -44,7 +44,7 @@
 	/**
 	 * Regular expression for stripping alias
 	 */
-	private static final Pattern ALIAS_PATTERN = Pattern.compile( "\\sas[^,]+(,?)" );
+	private static final Pattern ALIAS_PATTERN = Pattern.compile( "\\sas\\s[^,]+(,?)" );
 
 	public SQLServer2005Dialect() {
 		// HHH-3965 fix
@@ -147,7 +147,7 @@
 	 *
 	 * @param sql an sql query
 	 */
-	protected static void replaceDistinctWithGroupBy(StringBuilder sql) {
+	protected void replaceDistinctWithGroupBy(StringBuilder sql) {
 		int distinctIndex = sql.indexOf( DISTINCT );
 		int selectEndIndex = sql.indexOf( FROM );
 		if (distinctIndex > 0 && distinctIndex < selectEndIndex) {
@@ -164,7 +164,7 @@
 	 *
 	 * @return the fields of the select statement without their alias
 	 */
-	protected static CharSequence getSelectFieldsWithoutAliases(StringBuilder sql) {
+	protected CharSequence getSelectFieldsWithoutAliases(StringBuilder sql) {
 		String select = sql.substring( sql.indexOf( SELECT ) + SELECT.length(), sql.indexOf( FROM ) );
 
 		// Strip the as clauses
@@ -178,7 +178,7 @@
 	 *
 	 * @return a string without the as statements
 	 */
-	protected static String stripAliases(String str) {
+	protected String stripAliases(String str) {
 		Matcher matcher = ALIAS_PATTERN.matcher( str );
 		return matcher.replaceAll( "$1" );
 	}
@@ -189,7 +189,7 @@
 	 * @param sql the initial sql query without the order by clause
 	 * @param orderby the order by clause of the query
 	 */
-	protected static void insertRowNumberFunction(StringBuilder sql, CharSequence orderby) {
+	protected void insertRowNumberFunction(StringBuilder sql, CharSequence orderby) {
 		// Find the end of the select statement
 		int selectEndIndex = sql.indexOf( FROM );
 
