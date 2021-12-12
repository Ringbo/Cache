diff --git a/spring-boot-tools/spring-boot-loader/src/main/java/org/springframework/boot/loader/JarLauncher.java b/spring-boot-tools/spring-boot-loader/src/main/java/org/springframework/boot/loader/JarLauncher.java
index ec7b0bc..2776d6f 100644
--- a/spring-boot-tools/spring-boot-loader/src/main/java/org/springframework/boot/loader/JarLauncher.java
+++ b/spring-boot-tools/spring-boot-loader/src/main/java/org/springframework/boot/loader/JarLauncher.java
@@ -44,7 +44,7 @@
 	@Override
 	protected boolean isNestedArchive(Archive.Entry entry) {
 		if (entry.isDirectory()) {
-			return entry.getName().startsWith(BOOT_INF_CLASSES);
+			return entry.getName().equals(BOOT_INF_CLASSES);
 		}
 		return entry.getName().startsWith(BOOT_INF_LIB);
 	}
