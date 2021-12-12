diff --git a/src/com/ichi2/libanki/Models.java b/src/com/ichi2/libanki/Models.java
index 9ab3fa4..956792e 100644
--- a/src/com/ichi2/libanki/Models.java
+++ b/src/com/ichi2/libanki/Models.java
@@ -81,7 +81,7 @@
 		"'ord': None, " +
 		"'qfmt': \"\", " +
 		"'afmt': \"\", " +
-		"'did': None " +
+		"'did': None, " +
 		// added in beta 13
 		"'bqfmt': \"\"," +
 		"'bafmt': \"\" }";
@@ -602,7 +602,7 @@
 
     // not in libanki
     public Template[] getCmpldTemplate(long modelId, int ord, ArrayList<String> args) {
-    	if (args != null) {
+    	if (args != null && args.size() != 0) {
     		// TODO: cache this for browser too
     		return compileTemplate(modelId, ord, args);
     	}
@@ -624,7 +624,7 @@
 		try {
 			String qfmt;
 			String afmt;
-			if (args != null) {
+			if (args != null && args.size() > 1) {
 				qfmt = args.get(0);
 				afmt = args.get(1);
 			} else {
