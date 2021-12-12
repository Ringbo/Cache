diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ThreadSafetyTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ThreadSafetyTest.java
index 3870ad1..ad4d2f5 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ThreadSafetyTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ThreadSafetyTest.java
@@ -89,7 +89,7 @@
 
         @Child private ValueNode child;
 
-        public TestRootNode(ValueNode child) {
+        TestRootNode(ValueNode child) {
             super(TestingLanguage.class, null, null);
             this.child = child;
         }
@@ -102,7 +102,7 @@
 
     abstract static class ValueNode extends Node {
 
-        public ValueNode() {
+        ValueNode() {
             super(null);
         }
 
@@ -114,11 +114,11 @@
         @Child private ValueNode child;
         private final Random random;
 
-        public RewritingNode(ValueNode child) {
+        RewritingNode(ValueNode child) {
             this(child, new Random());
         }
 
-        public RewritingNode(ValueNode child, Random random) {
+        RewritingNode(ValueNode child, Random random) {
             this.child = child;
             this.random = random;
         }
@@ -139,7 +139,7 @@
         @Child private ValueNode child;
         private final Random random;
 
-        public OtherRewritingNode(ValueNode child, Random random) {
+        OtherRewritingNode(ValueNode child, Random random) {
             this.child = child;
             this.random = random;
         }
