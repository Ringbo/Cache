diff --git a/src/org/geometerplus/zlibrary/core/util/ZLNetworkUtil.java b/src/org/geometerplus/zlibrary/core/util/ZLNetworkUtil.java
index 54bb3ce..62ea9ab 100644
--- a/src/org/geometerplus/zlibrary/core/util/ZLNetworkUtil.java
+++ b/src/org/geometerplus/zlibrary/core/util/ZLNetworkUtil.java
@@ -55,7 +55,7 @@
 		StringBuilder encodedString = new StringBuilder();
 		for (int i = 0; i < stringToEncode.length(); ++i) {
 			final char ch = stringToEncode.charAt(i);
-			if (Character.isLetter(ch) ||
+			if (Character.isLetterOrDigit(ch) ||
 					(ch == '.') ||
 					(ch == '~') ||
 					(ch == '-') ||
