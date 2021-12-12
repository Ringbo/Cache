diff --git a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/source/ConfigurationPropertyName.java b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/source/ConfigurationPropertyName.java
index f13b3fb..f4b31f8 100644
--- a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/source/ConfigurationPropertyName.java
+++ b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/source/ConfigurationPropertyName.java
@@ -348,7 +348,7 @@
 		}
 		while (i2 < l2) {
 			char ch2 = e2.charAt(i, i2++);
-			if (indexed2 || !ElementsParser.isAlphaNumeric(ch2)) {
+			if (indexed2 || ElementsParser.isAlphaNumeric(ch2)) {
 				return false;
 			}
 		}
