diff --git a/org.springframework.jdbc/src/test/java/org/springframework/jdbc/core/namedparam/NamedParameterQueryTests.java b/org.springframework.jdbc/src/test/java/org/springframework/jdbc/core/namedparam/NamedParameterQueryTests.java
index 67dadc8..92166a1 100644
--- a/org.springframework.jdbc/src/test/java/org/springframework/jdbc/core/namedparam/NamedParameterQueryTests.java
+++ b/org.springframework.jdbc/src/test/java/org/springframework/jdbc/core/namedparam/NamedParameterQueryTests.java
@@ -518,7 +518,7 @@
 		ctrlResultSet.setReturnValue(mockResultSetMetaData);
 		mockResultSet.next();
 		ctrlResultSet.setReturnValue(true);
-		mockResultSet.getDouble(1);
+		mockResultSet.getInt(1);
 		ctrlResultSet.setReturnValue(22.0d);
 		mockResultSet.wasNull();
 		ctrlResultSet.setReturnValue(false);
@@ -561,7 +561,7 @@
 		ctrlResultSet.setReturnValue(mockResultSetMetaData);
 		mockResultSet.next();
 		ctrlResultSet.setReturnValue(true);
-		mockResultSet.getDouble(1);
+		mockResultSet.getLong(1);
 		ctrlResultSet.setReturnValue(87.0d);
 		mockResultSet.wasNull();
 		ctrlResultSet.setReturnValue(false);
