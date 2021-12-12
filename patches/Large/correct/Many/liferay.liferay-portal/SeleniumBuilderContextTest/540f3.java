diff --git a/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderContextTest.java b/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderContextTest.java
index 822d2be..67b08b3 100644
--- a/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderContextTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/tools/seleniumbuilder/SeleniumBuilderContextTest.java
@@ -35,7 +35,7 @@
 	public static void setUpClass() throws Exception {
 		try {
 			_seleniumBuilderContext = new SeleniumBuilderContext(
-				_BASE_DIR, _LIFERAY_SELENIUM_DIR);
+				_BASE_DIR, ".", _LIFERAY_SELENIUM_DIR);
 		}
 		catch (Exception e) {
 			_log.error(e, e);
