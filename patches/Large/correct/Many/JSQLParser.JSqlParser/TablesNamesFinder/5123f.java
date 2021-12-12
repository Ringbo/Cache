diff --git a/src/main/java/net/sf/jsqlparser/util/TablesNamesFinder.java b/src/main/java/net/sf/jsqlparser/util/TablesNamesFinder.java
index 4d4b3a7..e1d9387 100644
--- a/src/main/java/net/sf/jsqlparser/util/TablesNamesFinder.java
+++ b/src/main/java/net/sf/jsqlparser/util/TablesNamesFinder.java
@@ -466,7 +466,10 @@
     public void visit(ValuesList valuesList) {
     }
 
-    private void init() {
+    /**
+     * Initializes table names collector.
+     */
+    protected void init() {
         otherItemNames = new ArrayList<String>();
         tables = new ArrayList<String>();
     }
