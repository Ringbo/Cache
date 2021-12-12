diff --git a/jdbc/src/test/java/org/apache/zeppelin/jdbc/JDBCInterpreterTest.java b/jdbc/src/test/java/org/apache/zeppelin/jdbc/JDBCInterpreterTest.java
index 83e0507..5d376f2 100644
--- a/jdbc/src/test/java/org/apache/zeppelin/jdbc/JDBCInterpreterTest.java
+++ b/jdbc/src/test/java/org/apache/zeppelin/jdbc/JDBCInterpreterTest.java
@@ -94,7 +94,7 @@
 
     String sqlQuery = "select * from test_table";
 
-    InterpreterResult interpreterResult = t.interpret(sqlQuery, new InterpreterContext("", "1", "","", null,null,null,null));
+    InterpreterResult interpreterResult = t.interpret(sqlQuery, new InterpreterContext("", "1", "","", null,null,null,null,null));
 
     assertEquals(InterpreterResult.Code.SUCCESS, interpreterResult.code());
     assertEquals(InterpreterResult.Type.TABLE, interpreterResult.type());
@@ -116,7 +116,7 @@
 
     String sqlQuery = "select * from test_table";
 
-    InterpreterResult interpreterResult = t.interpret(sqlQuery, new InterpreterContext("", "1", "","", null,null,null,null));
+    InterpreterResult interpreterResult = t.interpret(sqlQuery, new InterpreterContext("", "1", "","", null,null,null,null,null));
 
     assertEquals(InterpreterResult.Code.SUCCESS, interpreterResult.code());
     assertEquals(InterpreterResult.Type.TABLE, interpreterResult.type());
