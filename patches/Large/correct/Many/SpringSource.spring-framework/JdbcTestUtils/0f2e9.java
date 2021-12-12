diff --git a/spring-test/src/main/java/org/springframework/test/jdbc/JdbcTestUtils.java b/spring-test/src/main/java/org/springframework/test/jdbc/JdbcTestUtils.java
index e096df5..ba4fc8f 100644
--- a/spring-test/src/main/java/org/springframework/test/jdbc/JdbcTestUtils.java
+++ b/spring-test/src/main/java/org/springframework/test/jdbc/JdbcTestUtils.java
@@ -42,6 +42,7 @@
  * @author Thomas Risberg
  * @author Sam Brannen
  * @author Juergen Hoeller
+ * @author Phillip Webb
  * @since 2.5.4
  */
 public class JdbcTestUtils {
@@ -60,7 +61,7 @@
 	 * @return the number of rows in the table
 	 */
 	public static int countRowsInTable(JdbcTemplate jdbcTemplate, String tableName) {
-		return jdbcTemplate.queryForInt("SELECT COUNT(0) FROM " + tableName);
+		return jdbcTemplate.queryForObject("SELECT COUNT(0) FROM " + tableName, int.class);
 	}
 
 	/**
@@ -82,7 +83,7 @@
 		if (StringUtils.hasText(whereClause)) {
 			sql += " WHERE " + whereClause;
 		}
-		return jdbcTemplate.queryForInt(sql);
+		return jdbcTemplate.queryForObject(sql, int.class);
 	}
 
 	/**
@@ -114,7 +115,7 @@
 	 * <p>As an alternative to hard-coded values, the {@code "?"} placeholder can
 	 * be used within the {@code WHERE} clause, binding to the given arguments.
 	 * @param jdbcTemplate the JdbcTemplate with which to perform JDBC operations
-	 * @param tableName the name of the table to delete rows in
+	 * @param tableName the name of the table to delete rows from
 	 * @param whereClause the {@code WHERE} clause to append to the query
 	 * @param args arguments to bind to the query (leaving it to the PreparedStatement
 	 * to guess the corresponding SQL type); may also contain {@link SqlParameterValue}
