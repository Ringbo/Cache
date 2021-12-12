diff --git a/querydsl-sql/src/test/java/com/mysema/query/sql/KeyTest.java b/querydsl-sql/src/test/java/com/mysema/query/sql/KeyTest.java
index e63af1c..1e42874 100644
--- a/querydsl-sql/src/test/java/com/mysema/query/sql/KeyTest.java
+++ b/querydsl-sql/src/test/java/com/mysema/query/sql/KeyTest.java
@@ -92,7 +92,7 @@
         QCompany company = new QCompany("company");
         
         // superiorId -> id
-        query().from(user).innerJoin(user.superiorId(), user.id());
+        query().from(user).innerJoin(user.superiorId(), user2.id());
         
         // superiorId -> superiorId
         query().from(user).innerJoin(user.superiorId(), user2.superiorId());
