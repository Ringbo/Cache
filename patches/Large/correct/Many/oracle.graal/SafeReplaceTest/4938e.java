diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java
index 5d8c501..eecd14c 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java
@@ -83,7 +83,7 @@
 
         private int executed;
 
-        public TestRootNode() {
+        TestRootNode() {
             super(TestingLanguage.class, null, null);
         }
 
