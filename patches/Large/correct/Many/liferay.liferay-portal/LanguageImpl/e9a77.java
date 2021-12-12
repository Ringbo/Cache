diff --git a/portal-impl/src/com/liferay/portal/language/LanguageImpl.java b/portal-impl/src/com/liferay/portal/language/LanguageImpl.java
index dd85a96..202ff99 100644
--- a/portal-impl/src/com/liferay/portal/language/LanguageImpl.java
+++ b/portal-impl/src/com/liferay/portal/language/LanguageImpl.java
@@ -429,7 +429,7 @@
 	public String getTimeDescription(
 		PageContext pageContext, long milliseconds, boolean approximate) {
 
-		String description = Time.getDescription(milliseconds);
+		String description = Time.getDescription(milliseconds, approximate);
 
 		String value = null;
 
