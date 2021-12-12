diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTestNodes.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTestNodes.java
index ff424af..fc6630e 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTestNodes.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/instrument/InstrumentationTestNodes.java
@@ -44,7 +44,7 @@
         @Child private TestLanguageNode child;
         @Child private EventHandlerNode eventHandlerNode;
 
-        public TestLanguageWrapperNode(TestLanguageNode child) {
+        TestLanguageWrapperNode(TestLanguageNode child) {
             assert !(child instanceof TestLanguageWrapperNode);
             this.child = child;
         }
@@ -90,7 +90,7 @@
     static class TestValueNode extends TestLanguageNode {
         private final int value;
 
-        public TestValueNode(int value) {
+        TestValueNode(int value) {
             this.value = value;
         }
 
@@ -107,7 +107,7 @@
         @Child private TestLanguageNode leftChild;
         @Child private TestLanguageNode rightChild;
 
-        public TestAdditionNode(TestValueNode leftChild, TestValueNode rightChild) {
+        TestAdditionNode(TestValueNode leftChild, TestValueNode rightChild) {
             this.leftChild = insert(leftChild);
             this.rightChild = insert(rightChild);
         }
@@ -131,7 +131,7 @@
          * newly created AST. Global registry is not used, since that would interfere with other
          * tests run in the same environment.
          */
-        public InstrumentationTestRootNode(TestLanguageNode body) {
+        InstrumentationTestRootNode(TestLanguageNode body) {
             super(InstrumentationTestingLanguage.class, null, null);
             this.body = body;
         }
@@ -162,7 +162,7 @@
          * newly created AST. Global registry is not used, since that would interfere with other
          * tests run in the same environment.
          */
-        public TestRootNode(TestLanguageNode body, Instrumenter instrumenter) {
+        TestRootNode(TestLanguageNode body, Instrumenter instrumenter) {
             super(InstrumentationTestingLanguage.class, null, null);
             this.instrumenter = instrumenter;
             this.body = body;
