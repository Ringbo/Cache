diff --git a/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGraphML.java b/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGraphML.java
index 283a029..2fb28bc 100644
--- a/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGraphML.java
+++ b/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGraphML.java
@@ -202,7 +202,7 @@
             positionKey2E.setAttribute("attr.type", "float");
             positionKey2E.setAttribute("for", "node");
             root.appendChild(positionKey2E);
-            if (minZ != 0f && maxZ != 0f) {
+            if (minZ != 0f || maxZ != 0f) {
                 Element positionKey3E = document.createElement("key");
                 positionKey3E.setAttribute("id", "z");
                 positionKey3E.setAttribute("attr.name", "z");
@@ -388,7 +388,7 @@
             nodeE.appendChild(positionXE);
             Element positionYE = createNodePositionY(document, n);
             nodeE.appendChild(positionYE);
-            if (minZ != 0f && maxZ != 0f) {
+            if (minZ != 0f || maxZ != 0f) {
                 Element positionZE = createNodePositionZ(document, n);
                 nodeE.appendChild(positionZE);
             }
