diff --git a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/MergeSpecializationsTest.java b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/MergeSpecializationsTest.java
index 56d6428..e5813b3 100644
--- a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/MergeSpecializationsTest.java
+++ b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/MergeSpecializationsTest.java
@@ -208,7 +208,7 @@
         public final Object secondValue;
         public final Object thirdValue;
 
-        public Executions(Object firstValue, Object secondValue, Object thirdValue) {
+        Executions(Object firstValue, Object secondValue, Object thirdValue) {
             this.firstValue = firstValue;
             this.secondValue = secondValue;
             this.thirdValue = thirdValue;
