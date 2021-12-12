diff --git a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java
index 6630087..7a12816 100644
--- a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java
+++ b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java
@@ -120,7 +120,7 @@
 	@Test
 	public void testLRWithLabels() throws Exception {
 		mkdir(parserpkgdir);
-		StringBuilder grammarBuilder = new StringBuilder(709);
+		StringBuilder grammarBuilder = new StringBuilder(726);
 		grammarBuilder.append("grammar T;\n");
 		grammarBuilder.append("@parser::header {\n");
 		grammarBuilder.append("}\n");
@@ -135,7 +135,7 @@
 		grammarBuilder.append("}\n");
 		grammarBuilder.append("\n");
 		grammarBuilder.append("func (*LeafListener) ExitCall(ctx *CallContext) {\n");
-		grammarBuilder.append("	fmt.Printf(\"%s %s\", ctx.E().GetStart().GetText(), ctx.EList())\n");
+		grammarBuilder.append("	fmt.Printf(\"%s %s\", ctx.E().GetStart().GetText(), ctx.EList().String(nil, nil))\n");
 		grammarBuilder.append("}\n");
 		grammarBuilder.append("\n");
 		grammarBuilder.append("func (*LeafListener) ExitInt(ctx *IntContext) {\n");
