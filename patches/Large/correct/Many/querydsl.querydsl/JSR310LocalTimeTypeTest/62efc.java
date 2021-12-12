diff --git a/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalTimeTypeTest.java b/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalTimeTypeTest.java
index 399c89a..768730c 100644
--- a/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalTimeTypeTest.java
+++ b/querydsl-sql/src/test/java/com/querydsl/sql/types/JSR310LocalTimeTypeTest.java
@@ -41,6 +41,6 @@
         EasyMock.verify(resultSet);
 
         assertNotNull(result);
-        assertTrue(result.toSecondOfDay() == 0);
+        assertTrue(result.getSecond() == 0);
     }
 }
