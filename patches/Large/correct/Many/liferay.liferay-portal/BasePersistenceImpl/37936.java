diff --git a/portal-service/src/com/liferay/portal/service/persistence/impl/BasePersistenceImpl.java b/portal-service/src/com/liferay/portal/service/persistence/impl/BasePersistenceImpl.java
index 4c5e43d..2742d8d 100644
--- a/portal-service/src/com/liferay/portal/service/persistence/impl/BasePersistenceImpl.java
+++ b/portal-service/src/com/liferay/portal/service/persistence/impl/BasePersistenceImpl.java
@@ -133,7 +133,7 @@
 	}
 
 	@Override
-	public <T> List<T> findWithDynamicQuery(DynamicQuery dynamicQuery) {
+	public <V> List<V> findWithDynamicQuery(DynamicQuery dynamicQuery) {
 		Session session = null;
 
 		try {
@@ -152,7 +152,7 @@
 	}
 
 	@Override
-	public <T> List<T> findWithDynamicQuery(
+	public <V> List<V> findWithDynamicQuery(
 		DynamicQuery dynamicQuery, int start, int end) {
 
 		Session session = null;
@@ -175,9 +175,9 @@
 	}
 
 	@Override
-	public <T> List<T> findWithDynamicQuery(
+	public <V> List<V> findWithDynamicQuery(
 		DynamicQuery dynamicQuery, int start, int end,
-		OrderByComparator<T> orderByComparator) {
+		OrderByComparator<V> orderByComparator) {
 
 		OrderFactoryUtil.addOrderByComparator(dynamicQuery, orderByComparator);
 
