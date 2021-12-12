diff --git a/src/reports/org/apache/jmeter/report/gui/action/ReportSave.java b/src/reports/org/apache/jmeter/report/gui/action/ReportSave.java
index 0ef74de..3ffd4d8 100644
--- a/src/reports/org/apache/jmeter/report/gui/action/ReportSave.java
+++ b/src/reports/org/apache/jmeter/report/gui/action/ReportSave.java
@@ -110,7 +110,7 @@
             ostream = new FileOutputStream(updateFile);
             SaveService.saveTree(subTree, ostream);
             log.info("saveTree");
-        } catch (Throwable ex) {
+        } catch (Exception ex) {
             ReportGuiPackage.getInstance().setReportPlanFile(null);
             log.error("", ex);
             throw new IllegalUserActionException("Couldn't save test plan to file: " + updateFile);
