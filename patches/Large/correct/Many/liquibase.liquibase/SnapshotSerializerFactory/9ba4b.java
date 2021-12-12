diff --git a/liquibase-core/src/main/java/liquibase/serializer/SnapshotSerializerFactory.java b/liquibase-core/src/main/java/liquibase/serializer/SnapshotSerializerFactory.java
index 11e9a14..c676be8 100644
--- a/liquibase-core/src/main/java/liquibase/serializer/SnapshotSerializerFactory.java
+++ b/liquibase-core/src/main/java/liquibase/serializer/SnapshotSerializerFactory.java
@@ -11,11 +11,11 @@
 
     private Map<String, List<SnapshotSerializer>> serializers = new HashMap<String, List<SnapshotSerializer>>();
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new SnapshotSerializerFactory();
     }
 
-    public static SnapshotSerializerFactory getInstance() {
+    public static synchronized SnapshotSerializerFactory getInstance() {
         if (instance == null) {
             instance = new SnapshotSerializerFactory();
         }
