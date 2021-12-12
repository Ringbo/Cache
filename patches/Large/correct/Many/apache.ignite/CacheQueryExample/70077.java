diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheQueryExample.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheQueryExample.java
index e041244..9fe9faf 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheQueryExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheQueryExample.java
@@ -109,10 +109,8 @@
 
     /**
      * Example for SQL queries based on salary ranges.
-     *
-     * @throws IgniteCheckedException In case of error.
      */
-    private static void sqlQuery() throws IgniteCheckedException {
+    private static void sqlQuery() {
         IgniteCache<CacheAffinityKey<UUID>, Person> cache = Ignition.ignite().jcache(CACHE_NAME);
 
         // SQL clause which selects salaries based on range.
@@ -131,10 +129,8 @@
 
     /**
      * Example for SQL queries based on all employees working for a specific organization.
-     *
-     * @throws IgniteCheckedException In case of error.
      */
-    private static void sqlQueryWithJoin() throws IgniteCheckedException {
+    private static void sqlQueryWithJoin() {
         IgniteCache<CacheAffinityKey<UUID>, Person> cache = Ignition.ignite().jcache(CACHE_NAME);
 
         // SQL clause query which joins on 2 types to select people for a specific organization.
@@ -152,10 +148,8 @@
 
     /**
      * Example for TEXT queries using LUCENE-based indexing of people's resumes.
-     *
-     * @throws IgniteCheckedException In case of error.
      */
-    private static void textQuery() throws IgniteCheckedException {
+    private static void textQuery() {
         IgniteCache<CacheAffinityKey<UUID>, Person> cache = Ignition.ignite().jcache(CACHE_NAME);
 
         //  Query for all people with "Master Degree" in their resumes.
@@ -173,10 +167,8 @@
     /**
      * Example for SQL-based fields queries that return only required
      * fields instead of whole key-value pairs.
-     *
-     * @throws IgniteCheckedException In case of error.
      */
-    private static void sqlFieldsQuery() throws IgniteCheckedException {
+    private static void sqlFieldsQuery() {
         IgniteCache<?, ?> cache = Ignition.ignite().jcache(CACHE_NAME);
 
         // Create query to get names of all employees.
@@ -194,10 +186,8 @@
     /**
      * Example for SQL-based fields queries that return only required
      * fields instead of whole key-value pairs.
-     *
-     * @throws IgniteCheckedException In case of error.
      */
-    private static void sqlFieldsQueryWithJoin() throws IgniteCheckedException {
+    private static void sqlFieldsQueryWithJoin() {
         IgniteCache<?, ?> cache = Ignition.ignite().jcache(CACHE_NAME);
 
         // Execute query to get names of all employees.
@@ -214,11 +204,8 @@
 
     /**
      * Populate cache with test data.
-     *
-     * @throws IgniteCheckedException In case of error.
-     * @throws InterruptedException In case of error.
      */
-    private static void initialize() throws IgniteCheckedException, InterruptedException {
+    private static void initialize() {
         IgniteCache cache = Ignition.ignite().jcache(CACHE_NAME);
 
         // Organizations.
