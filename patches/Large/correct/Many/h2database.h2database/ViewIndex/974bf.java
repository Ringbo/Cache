diff --git a/h2/src/main/org/h2/index/ViewIndex.java b/h2/src/main/org/h2/index/ViewIndex.java
index b8da4c2..552dc7a 100644
--- a/h2/src/main/org/h2/index/ViewIndex.java
+++ b/h2/src/main/org/h2/index/ViewIndex.java
@@ -173,7 +173,7 @@
         Prepared p;
         session.pushSubQueryInfo(masks, filters, filter, sortOrder);
         try {
-            p = session.prepare(sql, true, false);
+            p = session.prepare(sql, true, true);
         } finally {
             session.popSubQueryInfo();
         }
