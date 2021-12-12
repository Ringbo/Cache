diff --git a/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalDateTypeTest.java b/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalDateTypeTest.java
index 89635e8..ff8f982 100644
--- a/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalDateTypeTest.java
+++ b/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalDateTypeTest.java
@@ -24,7 +24,7 @@
         Date date = Date.valueOf(value);
 
         PreparedStatement stmt = EasyMock.createNiceMock(PreparedStatement.class);
-        stmt.setDate(1, date, UTC);
+        stmt.setDate(1, date);
         EasyMock.replay(stmt);
 
         type.setValue(stmt, 1, value);
@@ -34,7 +34,7 @@
     @Test
     public void Get() throws SQLException {
         ResultSet resultSet = EasyMock.createNiceMock(ResultSet.class);
-        EasyMock.expect(resultSet.getDate(1, UTC)).andReturn(new Date(UTC.getTimeInMillis()));
+        EasyMock.expect(resultSet.getDate(1)).andReturn(new Date(UTC.getTimeInMillis()));
         EasyMock.replay(resultSet);
 
         LocalDate result = type.getValue(resultSet, 1);
