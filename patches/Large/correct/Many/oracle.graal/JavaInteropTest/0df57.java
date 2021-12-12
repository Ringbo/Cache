diff --git a/truffle/com.oracle.truffle.api.interop.java.test/src/com/oracle/truffle/api/interop/java/test/JavaInteropTest.java b/truffle/com.oracle.truffle.api.interop.java.test/src/com/oracle/truffle/api/interop/java/test/JavaInteropTest.java
index 45fb4b8..7a8cc41 100644
--- a/truffle/com.oracle.truffle.api.interop.java.test/src/com/oracle/truffle/api/interop/java/test/JavaInteropTest.java
+++ b/truffle/com.oracle.truffle.api.interop.java.test/src/com/oracle/truffle/api/interop/java/test/JavaInteropTest.java
@@ -179,7 +179,7 @@
         private final Object[] args;
 
         @SuppressWarnings("rawtypes")
-        public TemporaryRoot(Class<? extends TruffleLanguage> lang, Node foreignAccess, TruffleObject function, Object... args) {
+        TemporaryRoot(Class<? extends TruffleLanguage> lang, Node foreignAccess, TruffleObject function, Object... args) {
             super(lang, null, null);
             this.foreignAccess = foreignAccess;
             this.function = function;
