diff --git a/jadx-core/src/main/java/jadx/core/dex/nodes/ClassNode.java b/jadx-core/src/main/java/jadx/core/dex/nodes/ClassNode.java
index 7a7efac..e55606a 100644
--- a/jadx-core/src/main/java/jadx/core/dex/nodes/ClassNode.java
+++ b/jadx-core/src/main/java/jadx/core/dex/nodes/ClassNode.java
@@ -152,7 +152,7 @@
 		if (offset != 0) {
 			try {
 				new AnnotationsParser(this).parse(offset);
-			} catch (DecodeException e) {
+			} catch (Exception e) {
 				LOG.error("Error parsing annotations in {}", this, e);
 			}
 		}
