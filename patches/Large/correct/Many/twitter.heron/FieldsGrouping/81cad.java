diff --git a/heron/simulator/src/java/com/twitter/heron/simulator/grouping/FieldsGrouping.java b/heron/simulator/src/java/com/twitter/heron/simulator/grouping/FieldsGrouping.java
index 6938250..b1b008c 100644
--- a/heron/simulator/src/java/com/twitter/heron/simulator/grouping/FieldsGrouping.java
+++ b/heron/simulator/src/java/com/twitter/heron/simulator/grouping/FieldsGrouping.java
@@ -29,7 +29,7 @@
     super(taskIds);
 
     for (int i = 0; i < schema.getKeysCount(); i++) {
-      for (int j = 0; i < inputStream.getGroupingFields().getKeysCount(); j++) {
+      for (int j = 0; j < inputStream.getGroupingFields().getKeysCount(); j++) {
         Boolean keysEqual = schema.getKeys(i).getKey().equals(
             inputStream.getGroupingFields().getKeys(j).getKey());
         if (keysEqual) {
