diff --git a/core/server/src/main/java/tachyon/web/WebInterfaceAbstractMetricsServlet.java b/core/server/src/main/java/tachyon/web/WebInterfaceAbstractMetricsServlet.java
index 23ae5cd..2773882 100644
--- a/core/server/src/main/java/tachyon/web/WebInterfaceAbstractMetricsServlet.java
+++ b/core/server/src/main/java/tachyon/web/WebInterfaceAbstractMetricsServlet.java
@@ -43,13 +43,12 @@
   }
 
   /**
-   * Populates key, value pairs for UI display.
+   * Populates operation metrics for displaying in the UI
    *
    * @param request The {@link HttpServletRequest} object
-   * @throws IOException if an I/O error occurs
    */
   protected void populateCountersValues(Map<String, Metric> operations,
-      Map<String, Counter> rpcInvocations, HttpServletRequest request) throws IOException {
+      Map<String, Counter> rpcInvocations, HttpServletRequest request){
 
     for (Map.Entry<String, Metric> entry : operations.entrySet()) {
       if (entry.getValue() instanceof Gauge) {
