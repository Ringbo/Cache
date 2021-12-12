diff --git a/core/src/main/java/org/springframework/security/providers/encoding/Md4PasswordEncoder.java b/core/src/main/java/org/springframework/security/providers/encoding/Md4PasswordEncoder.java
index 5888b83..788f1d6 100644
--- a/core/src/main/java/org/springframework/security/providers/encoding/Md4PasswordEncoder.java
+++ b/core/src/main/java/org/springframework/security/providers/encoding/Md4PasswordEncoder.java
@@ -51,7 +51,7 @@
 		try {
 			passBytes = saltedPass.getBytes("UTF-8");
 		} catch (UnsupportedEncodingException e) {
-			throw new IllegalStateException("UTF-8 not supported!", e);
+			throw new IllegalStateException("UTF-8 not supported!");
 		}
 		
 		Md4 md4 = new Md4();
