diff --git a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestParseTrees.java b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestParseTrees.java
index d6593a2..8787c5c 100644
--- a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestParseTrees.java
+++ b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestParseTrees.java
@@ -193,7 +193,7 @@
 	@Test
 	public void testTokenAndRuleContextString() throws Exception {
 		mkdir(parserpkgdir);
-		StringBuilder grammarBuilder = new StringBuilder(167);
+		StringBuilder grammarBuilder = new StringBuilder(194);
 		grammarBuilder.append("grammar T;\n");
 		grammarBuilder.append("s\n");
 		grammarBuilder.append("@init {\n");
@@ -204,7 +204,7 @@
 		grammarBuilder.append("}\n");
 		grammarBuilder.append("  : r=a ;\n");
 		grammarBuilder.append("a : 'x' { \n");
-		grammarBuilder.append("fmt.Println(p.GetRuleInvocationStack(nil))\n");
+		grammarBuilder.append("fmt.Println(antlr.PrintArrayJavaStyle(p.GetRuleInvocationStack(nil)))\n");
 		grammarBuilder.append("} ;");
 		String grammar = grammarBuilder.toString();
 		String input ="x";
