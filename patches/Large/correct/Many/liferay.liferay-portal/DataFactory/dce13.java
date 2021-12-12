diff --git a/modules/util/portal-tools-sample-sql-builder/src/com/liferay/portal/tools/sample/sql/builder/DataFactory.java b/modules/util/portal-tools-sample-sql-builder/src/com/liferay/portal/tools/sample/sql/builder/DataFactory.java
index c7de0d5..9e871ed 100644
--- a/modules/util/portal-tools-sample-sql-builder/src/com/liferay/portal/tools/sample/sql/builder/DataFactory.java
+++ b/modules/util/portal-tools-sample-sql-builder/src/com/liferay/portal/tools/sample/sql/builder/DataFactory.java
@@ -2621,7 +2621,7 @@
 		ddmTemplateModel.setClassNameId(
 			_classNameModelsMap.get(DDMStructure.class.getName()));
 		ddmTemplateModel.setClassPK(structureId);
-		ddmTemplateModel.setResourceClassNameId(structureId);
+		ddmTemplateModel.setResourceClassNameId(sourceClassNameId);
 		ddmTemplateModel.setTemplateKey(String.valueOf(_counter.get()));
 		ddmTemplateModel.setVersion(DDMTemplateConstants.VERSION_DEFAULT);
 		ddmTemplateModel.setVersionUserId(userId);
