diff --git a/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/RegexEngineBuilder.java b/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/RegexEngineBuilder.java
index 957fb3b..617d397 100644
--- a/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/RegexEngineBuilder.java
+++ b/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/RegexEngineBuilder.java
@@ -64,7 +64,7 @@
     }
 
     public static boolean isInstance(TruffleObject object) {
-        return object instanceof RegexCompiler;
+        return object instanceof RegexEngineBuilder;
     }
 
     @Override
