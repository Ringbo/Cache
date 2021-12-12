diff --git a/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java b/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java
index 214da50..f0b77cc 100644
--- a/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java
+++ b/azkaban-exec-server/src/main/java/azkaban/execapp/ExecutorServlet.java
@@ -56,7 +56,7 @@
   }
 
   @Override
-  public void init(final ServletConfig config) throws ServletException {
+  public void init(final ServletConfig config) {
     this.application =
         (AzkabanExecutorServer) config.getServletContext().getAttribute(
             Constants.AZKABAN_SERVLET_CONTEXT_KEY);
@@ -83,13 +83,13 @@
   @Deprecated
   @Override
   public void doGet(final HttpServletRequest req, final HttpServletResponse resp)
-      throws ServletException, IOException {
+      throws IOException {
     handleRequest(req, resp);
   }
 
   @Override
   public void doPost(final HttpServletRequest req, final HttpServletResponse resp)
-      throws ServletException, IOException {
+      throws IOException {
     handleRequest(req, resp);
   }
 
@@ -283,7 +283,7 @@
   }
 
   private void handleAjaxExecute(final HttpServletRequest req,
-      final Map<String, Object> respMap, final int execId) throws ServletException {
+      final Map<String, Object> respMap, final int execId) {
     try {
       this.flowRunnerManager.submitFlow(execId);
     } catch (final ExecutorManagerException e) {
@@ -303,7 +303,7 @@
   }
 
   private void handleAjaxPause(final Map<String, Object> respMap, final int execid,
-      final String user) throws ServletException {
+      final String user) {
     if (user == null) {
       respMap.put(RESPONSE_ERROR, "user has not been set");
       return;
@@ -335,7 +335,7 @@
   }
 
   private void handleAjaxCancel(final Map<String, Object> respMap, final int execid,
-      final String user) throws ServletException {
+      final String user) {
     if (user == null) {
       respMap.put(RESPONSE_ERROR, "user has not been set");
       return;
@@ -350,8 +350,7 @@
     }
   }
 
-  private void handleReloadJobTypePlugins(final Map<String, Object> respMap)
-      throws ServletException {
+  private void handleReloadJobTypePlugins(final Map<String, Object> respMap) {
     try {
       this.flowRunnerManager.reloadJobTypePlugins();
       respMap.put(STATUS_PARAM, RESPONSE_SUCCESS);
@@ -361,8 +360,7 @@
     }
   }
 
-  private void setActive(final boolean value, final Map<String, Object> respMap)
-      throws ServletException {
+  private void setActive(final boolean value, final Map<String, Object> respMap) {
     try {
       setActiveInternal(value);
       respMap.put(STATUS_PARAM, RESPONSE_SUCCESS);
@@ -393,8 +391,7 @@
    *
    * @param respMap json response object
    */
-  private void shutdown(final Map<String, Object> respMap)
-      throws ServletException {
+  private void shutdown(final Map<String, Object> respMap) {
     try {
       logger.warn("Shutting down executor...");
 
@@ -408,8 +405,7 @@
     }
   }
 
-  private void getStatus(final Map<String, Object> respMap)
-      throws ServletException {
+  private void getStatus(final Map<String, Object> respMap) {
     try {
       final ExecutorLoader executorLoader = this.application.getExecutorLoader();
       final Executor executor = requireNonNull(
