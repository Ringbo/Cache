diff --git a/modules/apps/foundation/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java b/modules/apps/foundation/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java
index c930be8..7c95fc3 100644
--- a/modules/apps/foundation/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java
+++ b/modules/apps/foundation/frontend-js/frontend-js-loader-modules-extender/src/test/java/com/liferay/frontend/js/loader/modules/extender/internal/JSLoaderModulesServletTest.java
@@ -110,7 +110,9 @@
 	@Test
 	public void testMultipleModulesOutput() throws Exception {
 		JSLoaderModulesServlet jsLoaderModulesServlet =
-			buildJSLoaderModulesServlet();
+			buildJSLoaderModulesServlet(
+				Collections.<String, Object>singletonMap(
+					"applyVersioning", Boolean.TRUE));
 
 		JSLoaderModulesTracker jsLoaderModulesTracker =
 			jsLoaderModulesServlet.getJSLoaderModulesTracker();
@@ -164,7 +166,9 @@
 	@Test
 	public void testMultipleVersionsModuleOutput() throws Exception {
 		JSLoaderModulesServlet jsLoaderModulesServlet =
-			buildJSLoaderModulesServlet();
+			buildJSLoaderModulesServlet(
+				Collections.<String, Object>singletonMap(
+					"applyVersioning", Boolean.TRUE));
 
 		JSLoaderModulesTracker jsLoaderModulesTracker =
 			jsLoaderModulesServlet.getJSLoaderModulesTracker();
@@ -216,7 +220,9 @@
 	@Test
 	public void testSingleModuleOutput() throws Exception {
 		JSLoaderModulesServlet jsLoaderModulesServlet =
-			buildJSLoaderModulesServlet();
+			buildJSLoaderModulesServlet(
+				Collections.<String, Object>singletonMap(
+					"applyVersioning", Boolean.TRUE));
 
 		JSLoaderModulesTracker jsLoaderModulesTracker =
 			jsLoaderModulesServlet.getJSLoaderModulesTracker();
@@ -273,7 +279,9 @@
 	@Test
 	public void testSingleModuleOutputIdempotent() throws Exception {
 		JSLoaderModulesServlet jsLoaderModulesServlet =
-			buildJSLoaderModulesServlet();
+			buildJSLoaderModulesServlet(
+				Collections.<String, Object>singletonMap(
+					"applyVersioning", Boolean.TRUE));
 
 		JSLoaderModulesTracker jsLoaderModulesTracker =
 			jsLoaderModulesServlet.getJSLoaderModulesTracker();
@@ -342,7 +350,7 @@
 		JSLoaderModulesServlet jsLoaderModulesServlet =
 			buildJSLoaderModulesServlet(
 				Collections.<String, Object>singletonMap(
-					"applyVersioning", Boolean.FALSE));
+					"apply-versioning", Boolean.FALSE));
 
 		JSLoaderModulesTracker jsLoaderModulesTracker =
 			jsLoaderModulesServlet.getJSLoaderModulesTracker();
@@ -428,7 +436,7 @@
 			jsLoaderModulesServlet, "_portal", PortalUtil.getPortal());
 
 		jsLoaderModulesServlet.activate(
-			mock(ComponentContext.class), mock(Details.class));
+			mock(ComponentContext.class), properties);
 
 		MockServletContext mockServletContext = new MockServletContext();
 
