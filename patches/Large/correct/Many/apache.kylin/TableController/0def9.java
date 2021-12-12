diff --git a/server-base/src/main/java/org/apache/kylin/rest/controller/TableController.java b/server-base/src/main/java/org/apache/kylin/rest/controller/TableController.java
index eefeba8..c4af5f4 100644
--- a/server-base/src/main/java/org/apache/kylin/rest/controller/TableController.java
+++ b/server-base/src/main/java/org/apache/kylin/rest/controller/TableController.java
@@ -90,7 +90,7 @@
      */
     @RequestMapping(value = "", method = { RequestMethod.GET })
     @ResponseBody
-    public List<TableDesc> getHiveTables(@RequestParam(value = "ext", required = false) boolean withExt, @RequestParam(value = "project", required = false) String project) {
+    public List<TableDesc> getHiveTables(@RequestParam(value = "ext", required = false) boolean withExt, @RequestParam(value = "project", required = true) String project) {
         long start = System.currentTimeMillis();
         List<TableDesc> tables = null;
         try {
