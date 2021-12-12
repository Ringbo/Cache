diff --git a/spring-core/src/main/java/org/springframework/util/StringUtils.java b/spring-core/src/main/java/org/springframework/util/StringUtils.java
index c1c9d7d..8a185a9 100644
--- a/spring-core/src/main/java/org/springframework/util/StringUtils.java
+++ b/spring-core/src/main/java/org/springframework/util/StringUtils.java
@@ -688,7 +688,7 @@
 		validateLocalePart(language);
 		validateLocalePart(country);
 		String variant = "";
-		if (parts.length >= 2) {
+		if (parts.length > 2) {
 			// There is definitely a variant, and it is everything after the country
 			// code sans the separator between the country code and the variant.
 			int endIndexOfCountryCode = localeString.lastIndexOf(country) + country.length();
