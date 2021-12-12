diff --git a/src/main/java/com/xiaoleilu/hutool/convert/impl/PrimitiveConverter.java b/src/main/java/com/xiaoleilu/hutool/convert/impl/PrimitiveConverter.java
index 2c5596d..8627c68 100644
--- a/src/main/java/com/xiaoleilu/hutool/convert/impl/PrimitiveConverter.java
+++ b/src/main/java/com/xiaoleilu/hutool/convert/impl/PrimitiveConverter.java
@@ -139,7 +139,7 @@
 				case "yes":
 					return true;
 				case "ok":
-					return false;
+					return true;
 				case "no":
 					return false;
 				case "1":
