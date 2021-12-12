diff --git a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/examples/ExampleNode.java b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/examples/ExampleNode.java
index b486d5b..008074f 100644
--- a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/examples/ExampleNode.java
+++ b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/examples/ExampleNode.java
@@ -72,7 +72,7 @@
 
         @Child ExampleNode child;
 
-        public ExampleRootNode(ExampleNode child) {
+        ExampleRootNode(ExampleNode child) {
             super(TestingLanguage.class, null, null);
             this.child = child;
         }
@@ -88,7 +88,7 @@
 
         private final int index;
 
-        public ExampleArgumentNode(int index) {
+        ExampleArgumentNode(int index) {
             this.index = index;
         }
 
@@ -110,7 +110,7 @@
 
         private final int argumentIndex;
 
-        public DummyCallRootNode(int argumentIndex) {
+        DummyCallRootNode(int argumentIndex) {
             super(TestingLanguage.class, null, null);
             this.argumentIndex = argumentIndex;
         }
