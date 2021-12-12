diff --git a/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java b/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
index 97d4ff4..8c9e511 100644
--- a/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
+++ b/AngularJS/src/org/angularjs/index/AngularJSIndexingHandler.java
@@ -445,7 +445,7 @@
       final int start = line.indexOf(PARAM);
       if (start >= 0) {
         final JSDocumentationUtils.DocTag docTag = JSDocumentationUtils.getDocTag(line.substring(start));
-        if (docTag != null) {
+        if (docTag != null && docTag.matchName != null) {
           for (String paramName : StringUtil.split(docTag.matchName, "|")) {
             if (restrict.equals(DEFAULT_RESTRICTIONS) || restrict.contains("A")) {
               result.add(Pair.pair(paramName, "A;" + tag + (directiveName.equals(paramName) ? "" : "=" + directiveName) + ";"
