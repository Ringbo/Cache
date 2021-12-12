diff --git a/hutool-core/src/main/java/com/xiaoleilu/hutool/date/Season.java b/hutool-core/src/main/java/com/xiaoleilu/hutool/date/Season.java
index 6511264..5c67b59 100644
--- a/hutool-core/src/main/java/com/xiaoleilu/hutool/date/Season.java
+++ b/hutool-core/src/main/java/com/xiaoleilu/hutool/date/Season.java
@@ -5,7 +5,7 @@
  * 
  * @see #SPRING
  * @see #SUMMER
- * @see #ANTUMN
+ * @see #AUTUMN
  * @see #WINTER
  * 
  * @author Looly
@@ -18,7 +18,7 @@
 	/** 夏季（第二季度） */
 	SUMMER(2),
 	/** 秋季（第三季度） */
-	ANTUMN(3),
+	AUTUMN(3),
 	/** 冬季（第四季度） */
 	WINTER(4);
 	
@@ -38,7 +38,7 @@
 	 * 
 	 * @see #SPRING
 	 * @see #SUMMER
-	 * @see #ANTUMN
+	 * @see #AUTUMN
 	 * @see #WINTER
 	 * 
 	 * @param intValue 季度int表示
@@ -51,7 +51,7 @@
 			case 2:
 				return SUMMER;
 			case 3:
-				return ANTUMN;
+				return AUTUMN;
 			case 4:
 				return WINTER;
 			default:
