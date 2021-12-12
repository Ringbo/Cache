diff --git a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java
index ccd4d24..fd9f90a 100644
--- a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java
+++ b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java
@@ -298,7 +298,7 @@
         private final TruffleObject symbol;
         private CallTarget target;
 
-        public SingleHandler(TruffleObject obj) {
+        SingleHandler(TruffleObject obj) {
             this.symbol = obj;
         }
 
@@ -318,7 +318,7 @@
     private static final class TruffleHandler implements InvocationHandler {
         private final TruffleObject obj;
 
-        public TruffleHandler(TruffleObject obj) {
+        TruffleHandler(TruffleObject obj) {
             this.obj = obj;
         }
 
@@ -502,7 +502,7 @@
         private final TruffleObject function;
 
         @SuppressWarnings("rawtypes")
-        public TemporaryRoot(Class<? extends TruffleLanguage> lang, Node foreignAccess, TruffleObject function) {
+        TemporaryRoot(Class<? extends TruffleLanguage> lang, Node foreignAccess, TruffleObject function) {
             super(lang, null, null);
             this.foreignAccess = foreignAccess;
             this.function = function;
@@ -519,7 +519,7 @@
         final Method method;
         final Object obj;
 
-        public JavaFunctionObject(Method method, Object obj) {
+        JavaFunctionObject(Method method, Object obj) {
             this.method = method;
             this.obj = obj;
         }
@@ -537,7 +537,7 @@
         final Object obj;
         final Class<?> clazz;
 
-        public JavaObject(Object obj, Class<?> clazz) {
+        JavaObject(Object obj, Class<?> clazz) {
             this.obj = obj;
             this.clazz = clazz;
         }
