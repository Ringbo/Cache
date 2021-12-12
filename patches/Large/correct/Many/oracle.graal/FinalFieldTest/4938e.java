diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FinalFieldTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FinalFieldTest.java
index c112e70..7ab88c2 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FinalFieldTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FinalFieldTest.java
@@ -77,7 +77,7 @@
 
         @Children private final TestChildNode[] children;
 
-        public TestRootNode(TestChildNode[] children) {
+        TestRootNode(TestChildNode[] children) {
             super(TestingLanguage.class, null, null);
             this.children = children;
         }
@@ -96,7 +96,7 @@
 
         private final int value;
 
-        public TestChildNode(int value) {
+        TestChildNode(int value) {
             super(null);
             this.value = value;
         }
