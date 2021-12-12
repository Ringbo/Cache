diff --git a/src/main/java/eu/siacs/conversations/persistance/FileBackend.java b/src/main/java/eu/siacs/conversations/persistance/FileBackend.java
index 7bb2e94..8fcda7c 100644
--- a/src/main/java/eu/siacs/conversations/persistance/FileBackend.java
+++ b/src/main/java/eu/siacs/conversations/persistance/FileBackend.java
@@ -451,11 +451,11 @@
 				return null;
 			}
 			ByteArrayOutputStream mByteArrayOutputStream = new ByteArrayOutputStream();
-			Base64OutputStream mBase64OutputSttream = new Base64OutputStream(
+			Base64OutputStream mBase64OutputStream = new Base64OutputStream(
 					mByteArrayOutputStream, Base64.DEFAULT);
 			MessageDigest digest = MessageDigest.getInstance("SHA-1");
 			DigestOutputStream mDigestOutputStream = new DigestOutputStream(
-					mBase64OutputSttream, digest);
+					mBase64OutputStream, digest);
 			if (!bm.compress(format, 75, mDigestOutputStream)) {
 				return null;
 			}
