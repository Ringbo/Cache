diff --git a/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java b/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java
index 910d206..6edb4ca 100644
--- a/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java
+++ b/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java
@@ -1291,24 +1291,26 @@
 	}
 
 	/**
-	 * Create a new ArgPreparedStatementSetter using the args passed in. This method allows the
-	 * creation to be overridden by sub-classes.
+	 * Create a new arg-based PreparedStatementSetter using the args passed in.
+	 * <p>By default, we'll create an {@link ArgumentPreparedStatementSetter}.
+	 * This method allows for the creation to be overridden by subclasses.
 	 * @param args object array with arguments
-	 * @return the new PreparedStatementSetter
+	 * @return the new PreparedStatementSetter to use
 	 */
 	protected PreparedStatementSetter newArgPreparedStatementSetter(Object[] args) {
-		return new ArgPreparedStatementSetter(args);
+		return new ArgumentPreparedStatementSetter(args);
 	}
 
 	/**
-	 * Create a new ArgTypePreparedStatementSetter using the args and argTypes passed in.
-	 * This method allows the creation to be overridden by sub-classes.
+	 * Create a new arg-type-based PreparedStatementSetter using the args and types passed in.
+	 * <p>By default, we'll create an {@link ArgumentTypePreparedStatementSetter}.
+	 * This method allows for the creation to be overridden by subclasses.
 	 * @param args object array with arguments
-	 * @param argTypes int array of SQLTypes for arguments
-	 * @return the new PreparedStatementSetter
+	 * @param argTypes int array of SQLTypes for the associated arguments
+	 * @return the new PreparedStatementSetter to use
 	 */
 	protected PreparedStatementSetter newArgTypePreparedStatementSetter(Object[] args, int[] argTypes) {
-		return new ArgTypePreparedStatementSetter(args, argTypes);
+		return new ArgumentTypePreparedStatementSetter(args, argTypes);
 	}
 
 	/**
