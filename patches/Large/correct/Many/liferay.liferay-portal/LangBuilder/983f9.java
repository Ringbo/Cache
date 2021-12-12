diff --git a/modules/util/lang-builder/src/main/java/com/liferay/lang/builder/LangBuilder.java b/modules/util/lang-builder/src/main/java/com/liferay/lang/builder/LangBuilder.java
index 72352d88..a98a7365 100644
--- a/modules/util/lang-builder/src/main/java/com/liferay/lang/builder/LangBuilder.java
+++ b/modules/util/lang-builder/src/main/java/com/liferay/lang/builder/LangBuilder.java
@@ -453,7 +453,7 @@
 			}
 		}
 
-		sb.setIndex(sb.index() - 2);
+		sb.setIndex(sb.index() - 1);
 
 		content = sb.toString();
 
