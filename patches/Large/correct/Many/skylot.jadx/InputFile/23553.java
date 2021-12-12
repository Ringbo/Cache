diff --git a/jadx-core/src/main/java/jadx/core/utils/files/InputFile.java b/jadx-core/src/main/java/jadx/core/utils/files/InputFile.java
index cd6623f..0202118 100644
--- a/jadx-core/src/main/java/jadx/core/utils/files/InputFile.java
+++ b/jadx-core/src/main/java/jadx/core/utils/files/InputFile.java
@@ -176,7 +176,7 @@
 		File outFile = FileUtils.createTempFile("cls.jar");
 		try (JarOutputStream jo = new JarOutputStream(new FileOutputStream(outFile))) {
 			String clsName = AsmUtils.getNameFromClassFile(file);
-			if (clsName == null || ZipSecurity.isValidZipEntryName(clsName)) {
+			if (clsName == null || !ZipSecurity.isValidZipEntryName(clsName)) {
 				throw new IOException("Can't read class name from file: " + file);
 			}
 			FileUtils.addFileToJar(jo, file, clsName + ".class");
