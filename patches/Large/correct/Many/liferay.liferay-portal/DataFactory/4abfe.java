diff --git a/modules/util/portal-tools-sample-sql-builder/src/main/java/com/liferay/portal/tools/sample/sql/builder/DataFactory.java b/modules/util/portal-tools-sample-sql-builder/src/main/java/com/liferay/portal/tools/sample/sql/builder/DataFactory.java
index e4f7f26..1a8728d 100644
--- a/modules/util/portal-tools-sample-sql-builder/src/main/java/com/liferay/portal/tools/sample/sql/builder/DataFactory.java
+++ b/modules/util/portal-tools-sample-sql-builder/src/main/java/com/liferay/portal/tools/sample/sql/builder/DataFactory.java
@@ -2747,7 +2747,7 @@
 		ddmTemplateModel.setMode(DDMTemplateConstants.TEMPLATE_MODE_CREATE);
 		ddmTemplateModel.setLanguage(TemplateConstants.LANG_TYPE_FTL);
 		ddmTemplateModel.setScript("${content.getData()}");
-		ddmTemplateModel.setCacheable(false);
+		ddmTemplateModel.setCacheable(true);
 		ddmTemplateModel.setSmallImage(false);
 		ddmTemplateModel.setLastPublishDate(nextFutureDate());
 
