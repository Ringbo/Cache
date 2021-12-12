diff --git a/src/main/java/org/acra/util/JSONReportBuilder.java b/src/main/java/org/acra/util/JSONReportBuilder.java
index d0a19fa..f478a70 100644
--- a/src/main/java/org/acra/util/JSONReportBuilder.java
+++ b/src/main/java/org/acra/util/JSONReportBuilder.java
@@ -84,7 +84,7 @@
                             addJSONFromProperty(subObject, line);
                         }
                     } catch (IOException e) {
-                        ACRA.log.e(LOG_TAG, "Error while converting " + key.name() + " to JSON.", e);
+                        ACRA.log.w(LOG_TAG, "Error while converting " + key.name() + " to JSON.", e);
                     }
                     jsonReport.accumulate(key.name(), subObject);
                 } else {
@@ -215,7 +215,7 @@
                     }
 
                     if (intermediate == null) {
-                        ACRA.log.e(LOG_TAG, "Unknown json subtree type, see issue #186");
+                        ACRA.log.w(LOG_TAG, "Unknown json subtree type, see issue #186");
                         // We should never get here, but if we do, drop this value to still send the report
                         return;
                     }
