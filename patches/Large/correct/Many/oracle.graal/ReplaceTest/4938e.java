diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReplaceTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReplaceTest.java
index 6587ca0..0d947a5 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReplaceTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReplaceTest.java
@@ -97,7 +97,7 @@
 
         @Children private final ValueNode[] children;
 
-        public TestRootNode(ValueNode[] children) {
+        TestRootNode(ValueNode[] children) {
             super(TestingLanguage.class, null, null);
             this.children = children;
         }
@@ -114,7 +114,7 @@
 
     abstract class ValueNode extends Node {
 
-        public ValueNode() {
+        ValueNode() {
             super(null);
         }
 
@@ -125,7 +125,7 @@
 
         private final String value;
 
-        public UnresolvedNode(String value) {
+        UnresolvedNode(String value) {
             this.value = value;
         }
 
