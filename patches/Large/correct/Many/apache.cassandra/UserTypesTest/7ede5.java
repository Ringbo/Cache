diff --git a/test/unit/org/apache/cassandra/cql3/validation/entities/UserTypesTest.java b/test/unit/org/apache/cassandra/cql3/validation/entities/UserTypesTest.java
index 9e9d0e2..7eae039 100644
--- a/test/unit/org/apache/cassandra/cql3/validation/entities/UserTypesTest.java
+++ b/test/unit/org/apache/cassandra/cql3/validation/entities/UserTypesTest.java
@@ -278,7 +278,7 @@
 
         execute("INSERT INTO %s (x, y) VALUES(1, {'firstValue': {a: 1}})");
         assertRows(execute("SELECT * FROM %s"),
-                   row(1, map("firstValue", userType(1))));
+                   row(1, map("firstValue", userType("a", 1))));
 
         flush();
 
@@ -286,14 +286,14 @@
         execute("UPDATE %s SET y['secondValue'] = {a: 2, b: 2} WHERE x = 1");
 
         assertRows(execute("SELECT * FROM %s"),
-                   row(1, map("firstValue", userType(1),
-                              "secondValue", userType(2, 2))));
+                   row(1, map("firstValue", userType("a", 1),
+                              "secondValue", userType("a", 2, "b", 2))));
 
         flush();
 
         assertRows(execute("SELECT * FROM %s"),
-                   row(1, map("firstValue", userType(1),
-                              "secondValue", userType(2, 2))));
+                   row(1, map("firstValue", userType("a", 1),
+                              "secondValue", userType("a", 2, "b", 2))));
     }
 
     @Test
