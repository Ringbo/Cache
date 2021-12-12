diff --git a/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcStruct.java b/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcStruct.java
index a056822..ffd14e0 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcStruct.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcStruct.java
@@ -216,7 +216,7 @@
     @Override
     public StructField getStructFieldRef(String s) {
       for(StructField field: fields) {
-        if (field.getFieldName().equals(s)) {
+        if (field.getFieldName().equalsIgnoreCase(s)) {
           return field;
         }
       }
@@ -304,7 +304,7 @@
         for(int i = 0; i < fields.size(); ++i) {
           StructField left = other.get(i);
           StructField right = fields.get(i);
-          if (!(left.getFieldName().equals(right.getFieldName()) &&
+          if (!(left.getFieldName().equalsIgnoreCase(right.getFieldName()) &&
                 left.getFieldObjectInspector().equals
                     (right.getFieldObjectInspector()))) {
             return false;
