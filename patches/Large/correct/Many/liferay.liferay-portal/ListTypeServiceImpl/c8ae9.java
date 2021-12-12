diff --git a/portal-impl/src/com/liferay/portal/service/impl/ListTypeServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/ListTypeServiceImpl.java
index 02aa858..c5fe328 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/ListTypeServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/ListTypeServiceImpl.java
@@ -52,9 +52,9 @@
 	public void validate(int listTypeId, String type)
 		throws PortalException, SystemException {
 
-		ListType listType = listTypePersistence.findByPrimaryKey(listTypeId);
+		ListType listType = listTypePersistence.fetchByPrimaryKey(listTypeId);
 
-		if (!listType.getType().equals(type)) {
+		if (listType == null || !listType.getType().equals(type)) {
 			NoSuchListTypeException nslte = new NoSuchListTypeException();
 
 			nslte.setType(type);
