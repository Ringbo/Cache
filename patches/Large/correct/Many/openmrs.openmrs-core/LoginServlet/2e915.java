diff --git a/src/web/org/openmrs/web/servlet/LoginServlet.java b/src/web/org/openmrs/web/servlet/LoginServlet.java
index 7ce23c6..121c6e7 100644
--- a/src/web/org/openmrs/web/servlet/LoginServlet.java
+++ b/src/web/org/openmrs/web/servlet/LoginServlet.java
@@ -64,7 +64,7 @@
 			HttpServletResponse response) throws ServletException, IOException {
 		HttpSession httpSession = request.getSession();
 		
-		String ipAddress = request.getLocalAddr();
+		String ipAddress = request.getRemoteAddr();
 		Integer loginAttempts = loginAttemptsByIP.get(ipAddress);
 		if (loginAttempts == null)
 			loginAttempts = 1;
