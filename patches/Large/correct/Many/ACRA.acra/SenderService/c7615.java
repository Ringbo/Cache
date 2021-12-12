diff --git a/src/main/java/org/acra/sender/SenderService.java b/src/main/java/org/acra/sender/SenderService.java
index 59a522d..5c7a20f 100644
--- a/src/main/java/org/acra/sender/SenderService.java
+++ b/src/main/java/org/acra/sender/SenderService.java
@@ -68,7 +68,7 @@
                 reportDistributor.distribute(report);
             }
         } catch (Exception e) {
-            ACRA.log.e(ACRA.class.getSimpleName(), "", e);
+            ACRA.log.e(LOG_TAG, "", e);
         }
 
         ACRA.log.d(LOG_TAG, "Finished sending reports from SenderService");
@@ -99,7 +99,7 @@
         for (File report : locator.getUnapprovedReports()) {
             final File approvedReport = new File(locator.getApprovedFolder(), report.getName());
             if (!report.renameTo(approvedReport)) {
-                ACRA.log.e(LOG_TAG, "Could not rename approved report from " + report + " to " + approvedReport);
+                ACRA.log.w(LOG_TAG, "Could not rename approved report from " + report + " to " + approvedReport);
             }
         }
     }
