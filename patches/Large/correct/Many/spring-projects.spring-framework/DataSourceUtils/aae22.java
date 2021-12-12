diff --git a/spring-jdbc/src/main/java/org/springframework/jdbc/datasource/DataSourceUtils.java b/spring-jdbc/src/main/java/org/springframework/jdbc/datasource/DataSourceUtils.java
index 7c58f69..5cad3aa 100644
--- a/spring-jdbc/src/main/java/org/springframework/jdbc/datasource/DataSourceUtils.java
+++ b/spring-jdbc/src/main/java/org/springframework/jdbc/datasource/DataSourceUtils.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2012 the original author or authors.
+ * Copyright 2002-2014 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -254,7 +254,7 @@
 	 * @see java.sql.Statement#setQueryTimeout
 	 */
 	public static void applyTransactionTimeout(Statement stmt, DataSource dataSource) throws SQLException {
-		applyTimeout(stmt, dataSource, 0);
+		applyTimeout(stmt, dataSource, -1);
 	}
 
 	/**
@@ -274,7 +274,7 @@
 			// Remaining transaction timeout overrides specified value.
 			stmt.setQueryTimeout(holder.getTimeToLiveInSeconds());
 		}
-		else if (timeout > 0) {
+		else if (timeout >= 0) {
 			// No current transaction timeout -> apply specified value.
 			stmt.setQueryTimeout(timeout);
 		}
