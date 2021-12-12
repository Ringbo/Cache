diff --git a/src/com/facebook/buck/skylark/parser/context/ParseContext.java b/src/com/facebook/buck/skylark/parser/context/ParseContext.java
index 63b73d2..cea6908 100644
--- a/src/com/facebook/buck/skylark/parser/context/ParseContext.java
+++ b/src/com/facebook/buck/skylark/parser/context/ParseContext.java
@@ -108,7 +108,7 @@
   /** Get the {@link ParseContext} by looking up in the environment. */
   public static ParseContext getParseContext(Environment env, FuncallExpression ast)
       throws EvalException {
-    @Nullable ParseContext value = (ParseContext) env.lookup(PARSE_CONTEXT);
+    @Nullable ParseContext value = (ParseContext) env.dynamicLookup(PARSE_CONTEXT);
     if (value == null) {
       // if PARSE_CONTEXT is missing, we're not called from a build file. This happens if someone
       // uses native.some_func() in the wrong place.
