diff --git a/h2/src/test/org/h2/test/jdbc/TestPreparedStatement.java b/h2/src/test/org/h2/test/jdbc/TestPreparedStatement.java
index 866c7a7..19b8d15 100644
--- a/h2/src/test/org/h2/test/jdbc/TestPreparedStatement.java
+++ b/h2/src/test/org/h2/test/jdbc/TestPreparedStatement.java
@@ -639,7 +639,7 @@
         prep.setObject(1, localDateTime);
         ResultSet rs = prep.executeQuery();
         rs.next();
-        Object localDateTime2 = rs.getObject(1, LocalDateTimeUtils.getLocalDateClass());
+        Object localDateTime2 = rs.getObject(1, LocalDateTimeUtils.getLocalDateTimeClass());
         assertEquals(localDateTime, localDateTime2);
         rs.close();
     }
