diff --git a/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderTest.java b/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderTest.java
index e3bd977..413053a 100644
--- a/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderTest.java
@@ -29,7 +29,7 @@
 
 	@Before
 	public void setUp() throws Exception {
-		_seleniumBuilderFileUtil = new SeleniumBuilderFileUtil(".");
+		_seleniumBuilderFileUtil = new SeleniumBuilderFileUtil(".", ".");
 	}
 
 	@Test
