diff --git a/jodd-madvoc/src/test/java/jodd/madvoc/ActionMethodParserTest.java b/jodd-madvoc/src/test/java/jodd/madvoc/ActionMethodParserTest.java
index 0c2fd79..3046127 100644
--- a/jodd-madvoc/src/test/java/jodd/madvoc/ActionMethodParserTest.java
+++ b/jodd-madvoc/src/test/java/jodd/madvoc/ActionMethodParserTest.java
@@ -97,7 +97,7 @@
 		cfg = parse(actionMethodParser, "tst.BooAction#foo41");
 		assertEquals("/xxx", cfg.actionPath);
 		assertEquals("DELETE", cfg.actionMethod);
-		assertNull("rt", cfg.resultType);
+		assertEquals("rt", cfg.resultType);
 
 		cfg = parse(actionMethodParser, "tst.BooAction#foo5");
 		assertEquals("/xxx.html", cfg.actionPath);
