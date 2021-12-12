diff --git a/drools-core/src/main/java/org/drools/core/process/core/datatype/impl/type/ObjectDataType.java b/drools-core/src/main/java/org/drools/core/process/core/datatype/impl/type/ObjectDataType.java
index 6cf27d1..34935f5 100644
--- a/drools-core/src/main/java/org/drools/core/process/core/datatype/impl/type/ObjectDataType.java
+++ b/drools-core/src/main/java/org/drools/core/process/core/datatype/impl/type/ObjectDataType.java
@@ -61,7 +61,7 @@
             return true;
         }
         try {
-            Class<?> clazz = Class.forName(className);
+            Class<?> clazz = Class.forName(className, true, value.getClass().getClassLoader());
             if (clazz.isInstance(value)) {
                 return true;
             }
