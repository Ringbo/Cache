diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildrenNodesTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildrenNodesTest.java
index f712a45..3fb6e01 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildrenNodesTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ChildrenNodesTest.java
@@ -84,7 +84,7 @@
 
         @Children private final TestChildNode[] children;
 
-        public TestRootNode(TestChildNode[] children) {
+        TestRootNode(TestChildNode[] children) {
             super(TestingLanguage.class, null, null);
             this.children = children;
         }
@@ -101,7 +101,7 @@
 
     class TestChildNode extends Node {
 
-        public TestChildNode() {
+        TestChildNode() {
             super(null);
         }
 
@@ -137,7 +137,7 @@
         @Children private final TestChildNode[] children1;
         @Children private final TestChildNode[] children2;
 
-        public TestRoot2Node(TestChildNode[] children1, TestChildNode[] children2) {
+        TestRoot2Node(TestChildNode[] children1, TestChildNode[] children2) {
             super(new TestChildNode[0]);
             this.children1 = children1;
             this.children2 = children2;
