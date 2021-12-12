diff --git a/truffle/com.oracle.truffle.tools.test/src/com/oracle/truffle/tools/test/ToolTestUtil.java b/truffle/com.oracle.truffle.tools.test/src/com/oracle/truffle/tools/test/ToolTestUtil.java
index 523374a..0e61601 100644
--- a/truffle/com.oracle.truffle.tools.test/src/com/oracle/truffle/tools/test/ToolTestUtil.java
+++ b/truffle/com.oracle.truffle.tools.test/src/com/oracle/truffle/tools/test/ToolTestUtil.java
@@ -51,7 +51,7 @@
 
     static final String MIME_TYPE = "text/x-toolTest";
 
-    static enum ToolTestTag implements SyntaxTag {
+    enum ToolTestTag implements SyntaxTag {
 
         ADD_TAG("addition", "test language addition node"),
 
@@ -60,7 +60,7 @@
         private final String name;
         private final String description;
 
-        private ToolTestTag(String name, String description) {
+        ToolTestTag(String name, String description) {
             this.name = name;
             this.description = description;
         }
@@ -186,7 +186,7 @@
         @Child private ToolTestLangNode child;
         @Child private EventHandlerNode eventHandlerNode;
 
-        public ToolTestWrapperNode(ToolTestLangNode child) {
+        ToolTestWrapperNode(ToolTestLangNode child) {
             super(null);
             assert !(child instanceof ToolTestWrapperNode);
             this.child = child;
@@ -232,7 +232,7 @@
     static class TestValueNode extends ToolTestLangNode {
         private final int value;
 
-        public TestValueNode(int value, SourceSection s) {
+        TestValueNode(int value, SourceSection s) {
             super(s);
             this.value = value;
         }
@@ -250,7 +250,7 @@
         @Child private ToolTestLangNode leftChild;
         @Child private ToolTestLangNode rightChild;
 
-        public TestAdditionNode(TestValueNode leftChild, TestValueNode rightChild, SourceSection s) {
+        TestAdditionNode(TestValueNode leftChild, TestValueNode rightChild, SourceSection s) {
             super(s);
             this.leftChild = insert(leftChild);
             this.rightChild = insert(rightChild);
@@ -275,7 +275,7 @@
          * newly created AST. Global registry is not used, since that would interfere with other
          * tests run in the same environment.
          */
-        public InstrumentationTestRootNode(ToolTestLangNode body) {
+        InstrumentationTestRootNode(ToolTestLangNode body) {
             super(ToolTestLang.class, null, null);
             this.body = body;
         }
@@ -307,7 +307,7 @@
          * newly created AST. Global registry is not used, since that would interfere with other
          * tests run in the same environment.
          */
-        public TestRootNode(ToolTestLangNode body, Instrumenter instrumenter) {
+        TestRootNode(ToolTestLangNode body, Instrumenter instrumenter) {
             super(ToolTestLang.class, null, null);
             this.instrumenter = instrumenter;
             this.body = body;
