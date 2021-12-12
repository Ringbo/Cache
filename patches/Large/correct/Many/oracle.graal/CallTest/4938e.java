diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/CallTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/CallTest.java
index 24ca22f..dc46078 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/CallTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/CallTest.java
@@ -87,7 +87,7 @@
 
         private final int value;
 
-        public ConstantRootNode(int value) {
+        ConstantRootNode(int value) {
             super(TestingLanguage.class, null, null);
             this.value = value;
         }
