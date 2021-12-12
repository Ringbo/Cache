diff --git a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestSemPredEvalParser.java b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestSemPredEvalParser.java
index e06ee4d..4d11d3a 100644
--- a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestSemPredEvalParser.java
+++ b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestSemPredEvalParser.java
@@ -599,11 +599,11 @@
 	@Test
 	public void testToLeftWithVaryingPredicate() throws Exception {
 		mkdir(parserpkgdir);
-		StringBuilder grammarBuilder = new StringBuilder(247);
+		StringBuilder grammarBuilder = new StringBuilder(259);
 		grammarBuilder.append("grammar T;\n");
 		grammarBuilder.append("@members {var i int = 0; var _ int = i; }\n");
 		grammarBuilder.append("s : ({i += 1;\n");
-		grammarBuilder.append("fmt.Println(\"i=\" + i)} a)+ ;\n");
+		grammarBuilder.append("fmt.Println(\"i=\" + fmt.Sprint(i))} a)+ ;\n");
 		grammarBuilder.append("a : {i % 2 == 0}? ID {fmt.Println(\"alt 1\")}\n");
 		grammarBuilder.append("  | {i % 2 != 0}? ID {fmt.Println(\"alt 2\")}\n");
 		grammarBuilder.append("  ;\n");
