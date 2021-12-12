diff --git a/portal-service/src/com/liferay/portal/service/persistence/BasePersistence.java b/portal-service/src/com/liferay/portal/service/persistence/BasePersistence.java
index c39aca2..6894e4a 100644
--- a/portal-service/src/com/liferay/portal/service/persistence/BasePersistence.java
+++ b/portal-service/src/com/liferay/portal/service/persistence/BasePersistence.java
@@ -139,7 +139,7 @@
 	 * @param  dynamicQuery the dynamic query
 	 * @return the matching rows
 	 */
-	public <T> List<T> findWithDynamicQuery(DynamicQuery dynamicQuery);
+	public <V> List<V> findWithDynamicQuery(DynamicQuery dynamicQuery);
 
 	/**
 	 * Performs a dynamic query on the database and returns a range of the
@@ -163,7 +163,7 @@
 	 *         com.liferay.portal.kernel.dao.orm.Query,
 	 *         com.liferay.portal.kernel.dao.orm.Dialect, int, int)
 	 */
-	public <T> List<T> findWithDynamicQuery(
+	public <V> List<V> findWithDynamicQuery(
 		DynamicQuery dynamicQuery, int start, int end);
 
 	/**
@@ -187,9 +187,9 @@
 	 *         (optionally <code>null</code>)
 	 * @return the ordered range of matching rows
 	 */
-	public <T> List<T> findWithDynamicQuery(
+	public <V> List<V> findWithDynamicQuery(
 		DynamicQuery dynamicQuery, int start, int end,
-		OrderByComparator<T> orderByComparator);
+		OrderByComparator<V> orderByComparator);
 
 	public void flush();
 
