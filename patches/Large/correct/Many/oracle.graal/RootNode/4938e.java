diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/RootNode.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/RootNode.java
index adebf97..8722ebb 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/RootNode.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/RootNode.java
@@ -195,7 +195,7 @@
 
         private final Object value;
 
-        public Constant(Object value) {
+        Constant(Object value) {
             super(TruffleLanguage.class, null, null);
             this.value = value;
         }
