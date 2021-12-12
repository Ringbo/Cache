diff --git a/common/src/main/java/org/broadleafcommerce/common/util/dao/HibernateMappingProvider.java b/common/src/main/java/org/broadleafcommerce/common/util/dao/HibernateMappingProvider.java
index eebde81..1a6d1bd 100644
--- a/common/src/main/java/org/broadleafcommerce/common/util/dao/HibernateMappingProvider.java
+++ b/common/src/main/java/org/broadleafcommerce/common/util/dao/HibernateMappingProvider.java
@@ -94,7 +94,7 @@
         if (metadata == null) {
             return propertyNames;
         }
-        Iterator propertyIterator = metadata.getPropertyIterator();
+        Iterator propertyIterator = metadata.getPropertyClosureIterator();
         while (propertyIterator.hasNext()) {
             org.hibernate.mapping.Property prop = (org.hibernate.mapping.Property) propertyIterator.next();
             propertyNames.add(prop.getName());
@@ -115,7 +115,7 @@
         if (metadata == null) {
             return propertyTypes;
         }
-        Iterator propertyIterator = metadata.getPropertyIterator();
+        Iterator propertyIterator = metadata.getPropertyClosureIterator();
         while (propertyIterator.hasNext()) {
             org.hibernate.mapping.Property prop = (org.hibernate.mapping.Property) propertyIterator.next();
             propertyTypes.add(prop.getType());
