diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java
index 24985bb..b6534c7 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java
@@ -322,7 +322,7 @@
         final TruffleLanguage<C> lang;
         final C ctx;
 
-        public LangCtx(TruffleLanguage<C> lang, Env env) {
+        LangCtx(TruffleLanguage<C> lang, Env env) {
             this.lang = lang;
             // following call verifies that Accessor.CURRENT_VM is provided
             assert API.findLanguage(null, null) == null;
