diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/comparator/JavaTermComparator.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/comparator/JavaTermComparator.java
index 268117a..88bb7d5 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/comparator/JavaTermComparator.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/comparator/JavaTermComparator.java
@@ -229,7 +229,7 @@
 			}
 		}
 
-		if (parameters1.size() == parameters1.size()) {
+		if (parameters1.size() == parameters2.size()) {
 			return 0;
 		}
 
