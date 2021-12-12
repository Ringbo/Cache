diff --git a/src/main/java/org/ansj/library/DATDictionary.java b/src/main/java/org/ansj/library/DATDictionary.java
index 0316a3b..94c0c69 100644
--- a/src/main/java/org/ansj/library/DATDictionary.java
+++ b/src/main/java/org/ansj/library/DATDictionary.java
@@ -146,7 +146,7 @@
 
 	public static AnsjItem getItem(String str) {
 		AnsjItem item = DAT.getItem(str);
-		if (item == null) {
+		if (item == null || item.getStatus()<2) {
 			return AnsjItem.NULL;
 		}
 
