diff --git a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
index adab950..0e29378 100644
--- a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
@@ -1093,7 +1093,7 @@
 				}
 			}
 
-			return getXml(map, key, defaultLanguageId);
+			return getXml(map, defaultLanguageId, key);
 		}
 
 		for (Locale locale : availableLocales) {
