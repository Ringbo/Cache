diff --git a/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotContextImpl.java b/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotContextImpl.java
index 925dd3e..a42004c 100644
--- a/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotContextImpl.java
+++ b/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotContextImpl.java
@@ -366,7 +366,7 @@
             }
             Object result = target.call(PolyglotImpl.EMPTY_ARGS);
 
-            if (source.isInternal()) {
+            if (source.isInteractive()) {
                 printResult(languageContext, result);
             }
 
