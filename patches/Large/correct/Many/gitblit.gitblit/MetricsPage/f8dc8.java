diff --git a/src/com/gitblit/wicket/pages/MetricsPage.java b/src/com/gitblit/wicket/pages/MetricsPage.java
index 461bebe..23dcd8a 100644
--- a/src/com/gitblit/wicket/pages/MetricsPage.java
+++ b/src/com/gitblit/wicket/pages/MetricsPage.java
@@ -121,7 +121,7 @@
 			for (Metric metric : metrics) {
 				labels.add(metric.name);
 			}
-			ChartProvider provider = new ChartProvider(new Dimension(500, 200), ChartType.PIE, data);
+			ChartProvider provider = new ChartProvider(new Dimension(800, 200), ChartType.PIE, data);
 			provider.setPieLabels(labels.toArray(new String[labels.size()]));
 			add(new Chart(wicketId, provider));
 		} else {
