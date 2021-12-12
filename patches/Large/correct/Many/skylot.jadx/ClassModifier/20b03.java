diff --git a/jadx-core/src/main/java/jadx/core/dex/visitors/ClassModifier.java b/jadx-core/src/main/java/jadx/core/dex/visitors/ClassModifier.java
index 3cb19bc..ed1e6a7 100644
--- a/jadx-core/src/main/java/jadx/core/dex/visitors/ClassModifier.java
+++ b/jadx-core/src/main/java/jadx/core/dex/visitors/ClassModifier.java
@@ -42,7 +42,8 @@
 		}
 		if (cls.getAccessFlags().isSynthetic()
 				&& cls.getFields().isEmpty()
-				&& cls.getMethods().isEmpty()) {
+				&& cls.getMethods().isEmpty()
+				&& cls.getInnerClasses().isEmpty()) {
 			cls.add(AFlag.DONT_GENERATE);
 			return false;
 		}
