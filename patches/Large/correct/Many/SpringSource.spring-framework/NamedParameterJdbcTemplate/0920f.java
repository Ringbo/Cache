diff --git a/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/namedparam/NamedParameterJdbcTemplate.java b/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/namedparam/NamedParameterJdbcTemplate.java
index 340683d..bca63c4 100644
--- a/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/namedparam/NamedParameterJdbcTemplate.java
+++ b/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/namedparam/NamedParameterJdbcTemplate.java
@@ -206,7 +206,7 @@
 	}
 
 	public long queryForLong(String sql, SqlParameterSource paramSource) throws DataAccessException {
-		Number number = queryForObject(sql, paramSource, Number.class);
+		Number number = queryForObject(sql, paramSource, Long.class);
 		return (number != null ? number.longValue() : 0);
 	}
 
@@ -215,7 +215,7 @@
 	}
 
 	public int queryForInt(String sql, SqlParameterSource paramSource) throws DataAccessException {
-		Number number = queryForObject(sql, paramSource, Number.class);
+		Number number = queryForObject(sql, paramSource, Integer.class);
 		return (number != null ? number.intValue() : 0);
 	}
 
