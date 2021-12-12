diff --git a/hive/src/main/java/org/elasticsearch/hadoop/hive/HiveFieldExtractor.java b/hive/src/main/java/org/elasticsearch/hadoop/hive/HiveFieldExtractor.java
index 9984fa2..435a451 100644
--- a/hive/src/main/java/org/elasticsearch/hadoop/hive/HiveFieldExtractor.java
+++ b/hive/src/main/java/org/elasticsearch/hadoop/hive/HiveFieldExtractor.java
@@ -40,7 +40,7 @@
 
     @Override
     protected Object extractField(Object target) {
-        List<String> flNames = getFieldNames();
+        List<String> flNames = fieldNames;
 
         for (int i = 0; i < flNames.size(); i++) {
             String fl = flNames.get(i);
@@ -52,7 +52,7 @@
                     StructField field = soi.getStructFieldRef(fl);
                     ObjectInspector foi = field.getFieldObjectInspector();
                     Assert.isTrue(foi.getCategory() == ObjectInspector.Category.PRIMITIVE,
-                            String.format("Field [%s] needs to be a primitive; found [%s]", fieldNames, foi.getTypeName()));
+                            String.format("Field [%s] needs to be a primitive; found [%s]", fl, foi.getTypeName()));
 
                     // expecting a writeable - simply do a toString
                     target = soi.getStructFieldData(type.getObject(), field);
