diff --git a/StatisticsAPI/src/org/gephi/statistics/StatisticsModelImpl.java b/StatisticsAPI/src/org/gephi/statistics/StatisticsModelImpl.java
index 9bd201e..473fe10 100644
--- a/StatisticsAPI/src/org/gephi/statistics/StatisticsModelImpl.java
+++ b/StatisticsAPI/src/org/gephi/statistics/StatisticsModelImpl.java
@@ -165,7 +165,7 @@
                 Element reportE = document.createElement("report");
                 reportE.setAttribute("class", entry.getKey().getName());
                 reportE.setAttribute("value", entry.getValue());
-                resultsE.appendChild(reportE);
+                reportsE.appendChild(reportE);
             }
         }
         modelE.appendChild(reportsE);
