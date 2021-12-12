diff --git a/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGML.java b/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGML.java
index bf649bf..a619921 100644
--- a/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGML.java
+++ b/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGML.java
@@ -235,7 +235,7 @@
             } else if ("target".equals(key)) {
                 NodeDraft target = container.getNode(value.toString());
                 edgeDraft.setTarget(target);
-            } else if ("value".equals(key)) {
+            } else if ("value".equals(key) || "weight".equals(key)) {
                 if (value instanceof Double) {
                     edgeDraft.setWeight(((Double) value).floatValue());
                 }
@@ -253,7 +253,7 @@
         for (int i = 0; i < list.size(); i += 2) {
             String key = (String) list.get(i);
             Object value = list.get(i + 1);
-            if ("source".equals(key) || "target".equals(key) || "value".equals(key) || "label".equals(key)) {
+            if ("source".equals(key) || "target".equals(key) || "value".equals(key) || "weight".equals(key) || "label".equals(key)) {
                 continue; // already parsed
             }
             if (value instanceof ArrayList) {
