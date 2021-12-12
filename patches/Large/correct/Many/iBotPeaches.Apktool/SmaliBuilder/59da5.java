diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliBuilder.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliBuilder.java
index ceeef83..3d7c232 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliBuilder.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliBuilder.java
@@ -74,7 +74,7 @@
 		StringBuilder out = new StringBuilder();
 		List<String> lines = IOUtils.readLines(inStream);
 
-		if (!mFlags.containsKey("debug")) {
+		if (!mFlags.get("debug")) {
 			final String[] linesArray = lines.toArray(new String[0]);
 			for (int i = 1; i < linesArray.length - 1; i++) {
 				out.append(linesArray[i].split("//", 2)[1]).append('\n');
