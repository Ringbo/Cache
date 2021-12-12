diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildNodeTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildNodeTest.java
index 4c42cec..768ff74 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildNodeTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildNodeTest.java
@@ -89,7 +89,7 @@
         @Child private TestChildNode left;
         @Child private TestChildNode right;
 
-        public TestRootNode(TestChildNode left, TestChildNode right) {
+        TestRootNode(TestChildNode left, TestChildNode right) {
             super(TestingLanguage.class, null, null);
             this.left = left;
             this.right = right;
@@ -103,7 +103,7 @@
 
     class TestChildNode extends Node {
 
-        public TestChildNode() {
+        TestChildNode() {
             super(null);
         }
 
