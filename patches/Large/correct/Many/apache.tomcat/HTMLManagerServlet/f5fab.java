diff --git a/java/org/apache/catalina/manager/HTMLManagerServlet.java b/java/org/apache/catalina/manager/HTMLManagerServlet.java
index b833ae4..210782b 100644
--- a/java/org/apache/catalina/manager/HTMLManagerServlet.java
+++ b/java/org/apache/catalina/manager/HTMLManagerServlet.java
@@ -304,6 +304,7 @@
      * @param config URL of the context configuration file to be deployed
      * @param cn Name of the application to be deployed
      * @param war URL of the web application archive to be deployed
+     * @param smClient internationalized strings
      * @return message String
      */
     protected String deployInternal(String config, ContextName cn, String war,
@@ -324,6 +325,8 @@
      * @param request The request
      * @param response The response
      * @param message a message to display
+     * @param smClient internationalized strings
+     * @throws IOException an IO error occurred
      */
     protected void list(HttpServletRequest request,
                      HttpServletResponse response,
@@ -759,8 +762,9 @@
      * Extract the expiration request parameter
      *
      * @param cn Name of the application from which to expire sessions
-     * @param req
+     * @param req The Servlet request
      * @param smClient  StringManager for the client's locale
+     * @return message string
      */
     protected String expireSessions(ContextName cn, HttpServletRequest req,
             StringManager smClient) {
@@ -777,12 +781,14 @@
     }
 
     /**
+     * Handle session operations.
      *
-     * @param req
-     * @param resp
+     * @param cn Name of the application for the sessions operation
+     * @param req The Servlet request
+     * @param resp The Servlet response
      * @param smClient  StringManager for the client's locale
-     * @throws ServletException
-     * @throws IOException
+     * @throws ServletException Propagated Servlet error
+     * @throws IOException An IO error occurred
      */
     protected void doSessions(ContextName cn, HttpServletRequest req,
             HttpServletResponse resp, StringManager smClient)
@@ -867,13 +873,13 @@
     }
 
     /**
-     *
+     * List session.
      * @param cn Name of the application for which the sessions will be listed
-     * @param req
-     * @param resp
+     * @param req The Servlet request
+     * @param resp The Servlet response
      * @param smClient  StringManager for the client's locale
-     * @throws ServletException
-     * @throws IOException
+     * @throws ServletException Propagated Servlet error
+     * @throws IOException An IO error occurred
      */
     protected void displaySessionsListPage(ContextName cn,
             HttpServletRequest req, HttpServletResponse resp,
@@ -916,12 +922,15 @@
     }
 
     /**
+     * Display session details.
      *
-     * @param req
-     * @param resp
+     * @param req The Servlet request
+     * @param resp The Servlet response
+     * @param cn Name of the application for which the sessions will be listed
+     * @param sessionId the session id
      * @param smClient  StringManager for the client's locale
-     * @throws ServletException
-     * @throws IOException
+     * @throws ServletException Propagated Servlet error
+     * @throws IOException An IO error occurred
      */
     protected void displaySessionDetailPage(HttpServletRequest req,
             HttpServletResponse resp, ContextName cn, String sessionId,
@@ -938,16 +947,16 @@
     }
 
     /**
-     * Invalidate HttpSessions
+     * Invalidate specified sessions.
+     *
      * @param cn Name of the application for which sessions are to be
      *           invalidated
-     * @param sessionIds
+     * @param sessionIds the session ids of the sessions
      * @param smClient  StringManager for the client's locale
      * @return number of invalidated sessions
-     * @throws IOException
      */
     protected int invalidateSessions(ContextName cn, String[] sessionIds,
-            StringManager smClient) throws IOException {
+            StringManager smClient) {
         if (null == sessionIds) {
             return 0;
         }
@@ -982,14 +991,13 @@
      * Removes an attribute from an HttpSession
      * @param cn Name of the application hosting the session from which the
      *           attribute is to be removed
-     * @param sessionId
-     * @param attributeName
+     * @param sessionId the session id
+     * @param attributeName the attribute name
      * @param smClient  StringManager for the client's locale
      * @return true if there was an attribute removed, false otherwise
-     * @throws IOException
      */
     protected boolean removeSessionAttribute(ContextName cn, String sessionId,
-            String attributeName, StringManager smClient) throws IOException {
+            String attributeName, StringManager smClient) {
         HttpSession session =
             getSessionForNameAndId(cn, sessionId, smClient).getSession();
         if (null == session) {
