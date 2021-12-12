diff --git a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/ExecuteGroupingTest.java b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/ExecuteGroupingTest.java
index 333b9a7..fae8194 100644
--- a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/ExecuteGroupingTest.java
+++ b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/ExecuteGroupingTest.java
@@ -51,7 +51,7 @@
 
         private final Object returnValue;
 
-        public ExecuteGroupingChild(Object returnValue) {
+        ExecuteGroupingChild(Object returnValue) {
             this.returnValue = returnValue;
         }
 
