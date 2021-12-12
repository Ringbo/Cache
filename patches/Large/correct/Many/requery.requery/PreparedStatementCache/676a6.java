diff --git a/requery/src/main/java/io/requery/sql/PreparedStatementCache.java b/requery/src/main/java/io/requery/sql/PreparedStatementCache.java
index e0e7ccb..e298ec8 100644
--- a/requery/src/main/java/io/requery/sql/PreparedStatementCache.java
+++ b/requery/src/main/java/io/requery/sql/PreparedStatementCache.java
@@ -55,7 +55,7 @@
     private final LinkedHashMap<String, PreparedStatement> elements;
     private boolean closed;
 
-    public PreparedStatementCache(final int count) {
+    PreparedStatementCache(final int count) {
         elements = new LinkedHashMap<String, PreparedStatement>(count, 0.75f, true) {
             @Override
             protected boolean removeEldestEntry(Map.Entry eldest) {
