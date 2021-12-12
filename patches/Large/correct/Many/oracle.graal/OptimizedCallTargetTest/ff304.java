diff --git a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/OptimizedCallTargetTest.java b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/OptimizedCallTargetTest.java
index b59a739..a08a661 100644
--- a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/OptimizedCallTargetTest.java
+++ b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/OptimizedCallTargetTest.java
@@ -261,7 +261,7 @@
 
         private String name;
 
-        public NamedRootNode(String name) {
+        NamedRootNode(String name) {
             super(TruffleLanguage.class, null, null);
             this.name = name;
         }
