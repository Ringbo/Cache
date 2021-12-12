diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/InterfaceChildFieldTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/InterfaceChildFieldTest.java
index 41fa98a..5ce24b0 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/InterfaceChildFieldTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/InterfaceChildFieldTest.java
@@ -96,7 +96,7 @@
 
         @Child private TestChildInterface child;
 
-        public TestRootNode(TestChildInterface child) {
+        TestRootNode(TestChildInterface child) {
             super(TestingLanguage.class, null, null);
             this.child = child;
         }
@@ -112,7 +112,7 @@
     }
 
     class TestLeafNode extends Node implements TestChildInterface {
-        public TestLeafNode() {
+        TestLeafNode() {
             super(null);
         }
 
@@ -122,7 +122,7 @@
     }
 
     class TestLeaf2Node extends Node implements TestChildInterface {
-        public TestLeaf2Node() {
+        TestLeaf2Node() {
             super(null);
         }
 
@@ -136,7 +136,7 @@
         @Child private TestChildInterface left;
         @Child private TestChildInterface right;
 
-        public TestChildNode(TestChildInterface left, TestChildInterface right) {
+        TestChildNode(TestChildInterface left, TestChildInterface right) {
             super(null);
             this.left = left;
             this.right = right;
@@ -152,7 +152,7 @@
 
         @Children private final TestChildInterface[] children;
 
-        public TestChildrenNode(TestChildInterface[] children) {
+        TestChildrenNode(TestChildInterface[] children) {
             super(null);
             this.children = children;
         }
