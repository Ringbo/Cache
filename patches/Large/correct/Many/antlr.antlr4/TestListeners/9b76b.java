diff --git a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java
index 2c09a85..63104b3 100644
--- a/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java
+++ b/runtime-testsuite/test/org/antlr/v4/test/runtime/go/TestListeners.java
@@ -285,7 +285,7 @@
 	@Test
 	public void testTokenGetters_1() throws Exception {
 		mkdir(parserpkgdir);
-		StringBuilder grammarBuilder = new StringBuilder(674);
+		StringBuilder grammarBuilder = new StringBuilder(734);
 		grammarBuilder.append("grammar T;\n");
 		grammarBuilder.append("@parser::header {\n");
 		grammarBuilder.append("}\n");
@@ -301,7 +301,7 @@
 		grammarBuilder.append("\n");
 		grammarBuilder.append("func (*LeafListener) ExitA(ctx *AContext) {\n");
 		grammarBuilder.append("	if ctx.GetChildCount() == 2 {\n");
-		grammarBuilder.append("		fmt.Printf(\"%s %s %s\", ctx.INT(0).GetSymbol().GetText(), ctx.INT(1).GetSymbol().GetText(), ctx.AllINT())\n");
+		grammarBuilder.append("		fmt.Printf(\"%s %s %s\", ctx.INT(0).GetSymbol().GetText(), ctx.INT(1).GetSymbol().GetText(), antlr.PrintArrayJavaStyle(antlr.TerminalNodeToStringArray(ctx.AllINT())))\n");
 		grammarBuilder.append("	} else {\n");
 		grammarBuilder.append("		fmt.Println(ctx.ID().GetSymbol())\n");
 		grammarBuilder.append("	}\n");
@@ -338,7 +338,7 @@
 	@Test
 	public void testTokenGetters_2() throws Exception {
 		mkdir(parserpkgdir);
-		StringBuilder grammarBuilder = new StringBuilder(674);
+		StringBuilder grammarBuilder = new StringBuilder(734);
 		grammarBuilder.append("grammar T;\n");
 		grammarBuilder.append("@parser::header {\n");
 		grammarBuilder.append("}\n");
@@ -354,7 +354,7 @@
 		grammarBuilder.append("\n");
 		grammarBuilder.append("func (*LeafListener) ExitA(ctx *AContext) {\n");
 		grammarBuilder.append("	if ctx.GetChildCount() == 2 {\n");
-		grammarBuilder.append("		fmt.Printf(\"%s %s %s\", ctx.INT(0).GetSymbol().GetText(), ctx.INT(1).GetSymbol().GetText(), ctx.AllINT())\n");
+		grammarBuilder.append("		fmt.Printf(\"%s %s %s\", ctx.INT(0).GetSymbol().GetText(), ctx.INT(1).GetSymbol().GetText(), antlr.PrintArrayJavaStyle(antlr.TerminalNodeToStringArray(ctx.AllINT())))\n");
 		grammarBuilder.append("	} else {\n");
 		grammarBuilder.append("		fmt.Println(ctx.ID().GetSymbol())\n");
 		grammarBuilder.append("	}\n");
