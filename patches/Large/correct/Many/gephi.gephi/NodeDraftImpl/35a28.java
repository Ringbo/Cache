diff --git a/ImportAPI/src/org/gephi/io/importer/impl/NodeDraftImpl.java b/ImportAPI/src/org/gephi/io/importer/impl/NodeDraftImpl.java
index d97f266..8ef6eb0 100644
--- a/ImportAPI/src/org/gephi/io/importer/impl/NodeDraftImpl.java
+++ b/ImportAPI/src/org/gephi/io/importer/impl/NodeDraftImpl.java
@@ -247,7 +247,8 @@
         Double end = Double.POSITIVE_INFINITY;
         if (dateFrom != null && !dateFrom.isEmpty()) {
             try {
-                if (container.getTimeFormat().equals(TimeFormat.DATE)) {
+                if (container.getTimeFormat().equals(TimeFormat.DATE) ||
+                        container.getTimeFormat().equals(TimeFormat.DATETIME)) {
                     start = DynamicUtilities.getDoubleFromXMLDateString(dateFrom);
                 } else {
                     start = Double.parseDouble(dateFrom);
@@ -258,7 +259,8 @@
         }
         if (dateTo != null && !dateTo.isEmpty()) {
             try {
-                if (container.getTimeFormat().equals(TimeFormat.DATE)) {
+                if (container.getTimeFormat().equals(TimeFormat.DATE) ||
+                        container.getTimeFormat().equals(TimeFormat.DATETIME)) {
                     end = DynamicUtilities.getDoubleFromXMLDateString(dateTo);
                 } else {
                     end = Double.parseDouble(dateTo);
