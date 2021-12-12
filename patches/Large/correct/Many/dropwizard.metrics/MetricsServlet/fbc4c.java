diff --git a/src/main/java/com/yammer/metrics/core/MetricsServlet.java b/src/main/java/com/yammer/metrics/core/MetricsServlet.java
index dba4ecb..0d4fb4b 100644
--- a/src/main/java/com/yammer/metrics/core/MetricsServlet.java
+++ b/src/main/java/com/yammer/metrics/core/MetricsServlet.java
@@ -96,7 +96,7 @@
 	@Override
 	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		final String uri = req.getPathInfo();
-		if (uri.equals("/")) {
+		if (uri == null || uri.equals("/")) {
 			handleHome(resp);
 		} else if (uri.startsWith(metricsUri)) {
 			handleMetrics(req.getParameter("class"), Boolean.parseBoolean(req.getParameter("full-samples")), resp);
