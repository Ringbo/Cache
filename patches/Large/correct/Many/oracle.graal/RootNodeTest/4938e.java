diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/RootNodeTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/RootNodeTest.java
index c6d5c29..529c37e 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/RootNodeTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/RootNodeTest.java
@@ -71,7 +71,7 @@
 
     class TestRootNode extends RootNode {
 
-        public TestRootNode() {
+        TestRootNode() {
             super(TestingLanguage.class, null, null);
         }
 
