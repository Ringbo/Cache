diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeNames.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeNames.java
index d9c8033..34ec694 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeNames.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeNames.java
@@ -43,7 +43,7 @@
 
         private final String name;
 
-        public NameImpl(String name) {
+        NameImpl(String name) {
             this.name = name;
         }
 
