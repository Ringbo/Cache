diff --git a/ImportAPI/src/org/gephi/io/importer/impl/EdgeDraftImpl.java b/ImportAPI/src/org/gephi/io/importer/impl/EdgeDraftImpl.java
index 0938fb4..6f2ac2c 100644
--- a/ImportAPI/src/org/gephi/io/importer/impl/EdgeDraftImpl.java
+++ b/ImportAPI/src/org/gephi/io/importer/impl/EdgeDraftImpl.java
@@ -203,7 +203,8 @@
         Double end = Double.POSITIVE_INFINITY;
         if (dateFrom != null && !dateFrom.isEmpty()) {
             try {
-                if (container.getTimeFormat().equals(TimeFormat.DATE)) {
+                if (container.getTimeFormat().equals(TimeFormat.DATE) ||
+                        container.getTimeFormat().equals(TimeFormat.DATETIME)) {
                     start = DynamicUtilities.getDoubleFromXMLDateString(dateFrom);
                 } else {
                     start = Double.parseDouble(dateFrom);
@@ -214,7 +215,8 @@
         }
         if (dateTo != null && !dateTo.isEmpty()) {
             try {
-                if (container.getTimeFormat().equals(TimeFormat.DATE)) {
+                if (container.getTimeFormat().equals(TimeFormat.DATE) ||
+                        container.getTimeFormat().equals(TimeFormat.DATETIME)) {
                     end = DynamicUtilities.getDoubleFromXMLDateString(dateTo);
                 } else {
                     end = Double.parseDouble(dateTo);
