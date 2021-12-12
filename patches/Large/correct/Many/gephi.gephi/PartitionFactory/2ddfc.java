diff --git a/PartitionAPI/src/org/gephi/partition/impl/PartitionFactory.java b/PartitionAPI/src/org/gephi/partition/impl/PartitionFactory.java
index ad2d9e2..0e85330 100644
--- a/PartitionAPI/src/org/gephi/partition/impl/PartitionFactory.java
+++ b/PartitionAPI/src/org/gephi/partition/impl/PartitionFactory.java
@@ -63,7 +63,7 @@
                 }
                 values.add(value);
             }
-            if (values.size() < 2f / 3f * nonNullvalues) {      //If #different values is < 2:3 of total non-null values
+            if (values.size() < 9f / 10f * nonNullvalues) {      //If #different values is < 2:3 of total non-null values
                 return true;
             }
         }
