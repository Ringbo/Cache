diff --git a/liquibase-core/src/main/java/liquibase/serializer/ChangeLogSerializerFactory.java b/liquibase-core/src/main/java/liquibase/serializer/ChangeLogSerializerFactory.java
index d6f7f12..422c264 100644
--- a/liquibase-core/src/main/java/liquibase/serializer/ChangeLogSerializerFactory.java
+++ b/liquibase-core/src/main/java/liquibase/serializer/ChangeLogSerializerFactory.java
@@ -11,11 +11,11 @@
 
     private Map<String, List<ChangeLogSerializer>> serializers = new HashMap<String, List<ChangeLogSerializer>>();
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new ChangeLogSerializerFactory();
     }
 
-    public static ChangeLogSerializerFactory getInstance() {
+    public static synchronized ChangeLogSerializerFactory getInstance() {
         if (instance == null) {
             instance = new ChangeLogSerializerFactory();
         }
