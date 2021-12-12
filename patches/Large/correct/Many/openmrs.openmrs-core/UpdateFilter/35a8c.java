diff --git a/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java b/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java
index 9c7b8d9..3638032 100644
--- a/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java
+++ b/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java
@@ -144,7 +144,7 @@
 	 *      javax.servlet.http.HttpServletResponse)
 	 */
 	@Override
-	protected void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws IOException,
+	protected synchronized void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws IOException,
 	        ServletException {
 		
 		String page = httpRequest.getParameter("page");
