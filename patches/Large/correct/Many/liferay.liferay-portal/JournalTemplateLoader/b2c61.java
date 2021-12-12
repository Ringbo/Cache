diff --git a/portal-impl/src/com/liferay/portal/freemarker/JournalTemplateLoader.java b/portal-impl/src/com/liferay/portal/freemarker/JournalTemplateLoader.java
index 31d628e..4e0256f 100644
--- a/portal-impl/src/com/liferay/portal/freemarker/JournalTemplateLoader.java
+++ b/portal-impl/src/com/liferay/portal/freemarker/JournalTemplateLoader.java
@@ -75,7 +75,7 @@
 			return null;
 		}
 		catch (SystemException se) {
-			throw new IOException(se);
+			throw new IOException("", se);
 		}
 
 		return null;
