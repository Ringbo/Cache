diff --git a/src/fit/SummaryFixture.java b/src/fit/SummaryFixture.java
index 5f2985a..1786a65 100644
--- a/src/fit/SummaryFixture.java
+++ b/src/fit/SummaryFixture.java
@@ -22,10 +22,10 @@
 
   protected Parse rows(Iterator<String> keys) {
     if (keys.hasNext()) {
-      Object key = keys.next();
+      String key = keys.next();
       Parse result =
         tr(
-          td(key.toString(),
+          td(key,
             td(summary.get(key).toString(),
               null)),
           rows(keys));
