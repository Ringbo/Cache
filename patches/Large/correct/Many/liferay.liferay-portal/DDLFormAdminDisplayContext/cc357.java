diff --git a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/internal/display/context/DDLFormAdminDisplayContext.java b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/internal/display/context/DDLFormAdminDisplayContext.java
index b2acadb..f46ac3e 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/internal/display/context/DDLFormAdminDisplayContext.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/internal/display/context/DDLFormAdminDisplayContext.java
@@ -740,7 +740,7 @@
 				new Locale[availableLocales.size()]);
 		}
 		catch (PortalException pe) {
-			_log.error(pe);
+			_log.error(pe, pe);
 
 			return null;
 		}
@@ -759,7 +759,7 @@
 			return LocaleUtil.toLanguageId(ddmForm.getDefaultLocale());
 		}
 		catch (PortalException pe) {
-			_log.error(pe);
+			_log.error(pe, pe);
 
 			return null;
 		}
