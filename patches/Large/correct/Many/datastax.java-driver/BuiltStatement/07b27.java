diff --git a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/BuiltStatement.java b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/BuiltStatement.java
index c76062f..32b32bb 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/BuiltStatement.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/BuiltStatement.java
@@ -70,7 +70,7 @@
             return;
 
         for (int i = 0; i < partitionKey.size(); i++) {
-            if (name.equals(partitionKey.get(i).getName()) && !Utils.isRawValue(value)) {
+            if (name.equals(partitionKey.get(i).getName()) && Utils.isRawValue(value)) {
                 routingKey[i] = partitionKey.get(i).getType().parse(Utils.toRawString(value));
                 return;
             }
