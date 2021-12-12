diff --git a/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/chart/ChartServlet.java b/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/chart/ChartServlet.java
index a800e1b..b7a9289 100644
--- a/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/chart/ChartServlet.java
+++ b/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/chart/ChartServlet.java
@@ -246,9 +246,9 @@
 					req.getParameter("items"), req.getParameter("groups"));
 			ImageIO.write(chart, provider.getChartType().toString(), res.getOutputStream());
 		} catch (ItemNotFoundException e) {
-			logger.debug("Item not found error while generating chart.");
+			logger.info("Item not found error while generating chart: {}", e);
 		} catch (IllegalArgumentException e) {
-			logger.debug("Illegal argument in chart: {}", e);
+			logger.info("Illegal argument in chart: {}", e);
 		}
 	}
 
