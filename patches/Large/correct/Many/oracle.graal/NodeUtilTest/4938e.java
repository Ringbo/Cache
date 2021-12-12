diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/NodeUtilTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/NodeUtilTest.java
index cc707fa..660d8a0 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/NodeUtilTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/NodeUtilTest.java
@@ -73,7 +73,7 @@
 
         private int visited;
 
-        public TestNode() {
+        TestNode() {
         }
 
     }
@@ -84,7 +84,7 @@
 
         private int visited;
 
-        public TestRootNode() {
+        TestRootNode() {
             super(TestingLanguage.class, null, null);
         }
 
