diff --git a/solr/core/src/java/org/apache/solr/schema/AbstractSpatialFieldType.java b/solr/core/src/java/org/apache/solr/schema/AbstractSpatialFieldType.java
index 96facfb..90c9b94 100644
--- a/solr/core/src/java/org/apache/solr/schema/AbstractSpatialFieldType.java
+++ b/solr/core/src/java/org/apache/solr/schema/AbstractSpatialFieldType.java
@@ -75,12 +75,12 @@
   //--------------------------------------------------------------
 
   @Override
-  public final StorableField createField(SchemaField field, Object val, float boost) {
+  public final Field createField(SchemaField field, Object val, float boost) {
     throw new IllegalStateException("should be calling createFields because isPolyField() is true");
   }
 
   @Override
-  public final StorableField[] createFields(SchemaField field, Object val, float boost) {
+  public final Field[] createFields(SchemaField field, Object val, float boost) {
     String shapeStr = null;
     Shape shape = null;
     if (val instanceof Shape) {
