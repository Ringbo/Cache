diff --git a/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuPropertiesFilterCriterionProvider.java b/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuPropertiesFilterCriterionProvider.java
index 057270b..f2cc791 100644
--- a/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuPropertiesFilterCriterionProvider.java
+++ b/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuPropertiesFilterCriterionProvider.java
@@ -75,7 +75,7 @@
     @Override
     public FilterCriterionProvider getEqProvider(AssociationPath path) {
         if (!path.equals(AssociationPath.ROOT)) {
-            return super.getLikeProvider(path);
+            return super.getEqProvider(path);
         }
             return new SimpleFilterCriterionProvider(FilterDataStrategy.NONE, 1) {
 
@@ -92,7 +92,7 @@
     @Override
     public FilterCriterionProvider getIsNullProvider(AssociationPath path) {
         if (!path.equals(AssociationPath.ROOT)) {
-            return super.getLikeProvider(path);
+            return super.getIsNullProvider(path);
         }
             return new SimpleFilterCriterionProvider(FilterDataStrategy.NONE, 1) {
 
@@ -109,7 +109,7 @@
     @Override
     public FilterCriterionProvider getLessThanOrEqualProvider(AssociationPath path) {
         if (!path.equals(AssociationPath.ROOT)) {
-            return super.getLikeProvider(path);
+            return super.getLessThanOrEqualProvider(path);
         }
             return new SimpleFilterCriterionProvider(FilterDataStrategy.DIRECT, 1) {
 
@@ -126,7 +126,7 @@
     @Override
     public FilterCriterionProvider getBetweenProvider(AssociationPath path) {
         if (!path.equals(AssociationPath.ROOT)) {
-            return super.getLikeProvider(path);
+            return super.getBetweenProvider(path);
         }
             return new SimpleFilterCriterionProvider(FilterDataStrategy.NONE, 2) {
 
@@ -149,7 +149,7 @@
     @Override
     public FilterCriterionProvider getBetweenDateProvider(AssociationPath path) {
         if (!path.equals(AssociationPath.ROOT)) {
-            return super.getLikeProvider(path);
+            return super.getBetweenDateProvider(path);
         }
             return new SimpleFilterCriterionProvider(FilterDataStrategy.NONE, 2) {
 
@@ -180,7 +180,7 @@
     @Override
     public FilterCriterionProvider getCollectionSizeEqualsProvider(AssociationPath path) {
         if (!path.equals(AssociationPath.ROOT)) {
-            return super.getLikeProvider(path);
+            return super.getCollectionSizeEqualsProvider(path);
         }
             return new SimpleFilterCriterionProvider(FilterDataStrategy.DIRECT, 1) {
 
