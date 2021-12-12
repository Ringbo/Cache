diff --git a/src/eu/siacs/conversations/services/ImageProvider.java b/src/eu/siacs/conversations/services/ImageProvider.java
index 15b8680..af8ab4b 100644
--- a/src/eu/siacs/conversations/services/ImageProvider.java
+++ b/src/eu/siacs/conversations/services/ImageProvider.java
@@ -31,7 +31,7 @@
 			if (uuids == null) {
 				throw new FileNotFoundException();
 			}
-			String[] uuidsSplited = uuids.split("/");
+			String[] uuidsSplited = uuids.split("/",2);
 			if (uuidsSplited.length != 3) {
 				throw new FileNotFoundException();
 			}
