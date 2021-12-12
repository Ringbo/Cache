diff --git a/tool/test/org/antlr/v4/test/BaseTest.java b/tool/test/org/antlr/v4/test/BaseTest.java
index 362080a..c5b7501 100644
--- a/tool/test/org/antlr/v4/test/BaseTest.java
+++ b/tool/test/org/antlr/v4/test/BaseTest.java
@@ -847,7 +847,7 @@
 			g.atn = factory.createATN();
 
 			CodeGenerator gen = new CodeGenerator(g);
-			ST outputFileST = gen.generateParser();
+			ST outputFileST = gen.generateParser(false);
 			String output = outputFileST.render();
 			//System.out.println(output);
 			String b = "#" + actionName + "#";
