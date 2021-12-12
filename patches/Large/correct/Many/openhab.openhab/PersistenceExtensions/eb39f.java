diff --git a/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java b/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java
index f76d1bf..c906bc0 100644
--- a/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java
+++ b/bundles/core/org.openhab.core.persistence/src/main/java/org/openhab/core/persistence/extensions/PersistenceExtensions.java
@@ -539,7 +539,7 @@
 			filter.setItemName(item.getName());
 			filter.setOrdering(Ordering.DESCENDING);
 
-			filter.setPageSize(3);
+			filter.setPageSize(1000);
 			int startPage = 0;
 			filter.setPageNumber(startPage);
 
