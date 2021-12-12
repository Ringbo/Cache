diff --git a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/model/Application.java b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/model/Application.java
index a3cdcd9..bec6c23 100644
--- a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/model/Application.java
+++ b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/model/Application.java
@@ -318,7 +318,7 @@
 		private static Pattern[] createPatterns(String... keys) {
 			Pattern[] patterns = new Pattern[keys.length];
 			for (int i = 0; i < keys.length; i++) {
-				patterns[i] = Pattern.compile(keys[i]);
+				patterns[i] = Pattern.compile(keys[i], Pattern.CASE_INSENSITIVE);
 			}
 			return patterns;
 		}
