diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/util/dao/ResourcePurgeDaoImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/util/dao/ResourcePurgeDaoImpl.java
index 2e88395..2b83ac3 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/util/dao/ResourcePurgeDaoImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/util/dao/ResourcePurgeDaoImpl.java
@@ -155,7 +155,7 @@
         for (List<Long> idSetToExclude : listsOfExcludeIds) {
             inRestrictions.add(builder.not(root.get("id").in(idSetToExclude)));
         }
-        restrictions.add(builder.or(inRestrictions.toArray(new Predicate[inRestrictions.size()])));
+        restrictions.add(builder.and(inRestrictions.toArray(new Predicate[inRestrictions.size()])));
     }
     
     protected <T> TypedQuery<T> buildCartQuery(String[] names, OrderStatus[] statuses, Date dateCreatedMinThreshold, Boolean isPreview, Class<T> returnType,
