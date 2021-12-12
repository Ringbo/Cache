diff --git a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/PolyglotCachingTest.java b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/PolyglotCachingTest.java
index 353fe6e..3a6008f 100644
--- a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/PolyglotCachingTest.java
+++ b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/PolyglotCachingTest.java
@@ -158,11 +158,11 @@
         assertObjectsCollectible(200, (iteration) -> {
             Context context = Context.create();
             Source source = Source.create(ProxyLanguage.ID, String.valueOf(iteration));
-            assertParsedEval(context, source);
+            CallTarget parsedAST = assertParsedEval(context, source);
             assertCachedEval(context, source);
             survivingSources.add(source);
             context.close();
-            return context;
+            return parsedAST;
         });
     }
 
