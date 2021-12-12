diff --git a/hutool-core/src/main/java/cn/hutool/core/util/NumberUtil.java b/hutool-core/src/main/java/cn/hutool/core/util/NumberUtil.java
index 4cbbf84..9d8fdec 100644
--- a/hutool-core/src/main/java/cn/hutool/core/util/NumberUtil.java
+++ b/hutool-core/src/main/java/cn/hutool/core/util/NumberUtil.java
@@ -2035,7 +2035,7 @@
 	}
 
 	/**
-	 * 把给定的总是平均分成N份，返回每份的个数<br>
+	 * 把给定的总数平均分成N份，返回每份的个数<br>
 	 * 当除以分数有余数时每份+1
 	 * 
 	 * @param total 总数
@@ -2048,7 +2048,7 @@
 	}
 
 	/**
-	 * 把给定的总是平均分成N份，返回每份的个数<br>
+	 * 把给定的总数平均分成N份，返回每份的个数<br>
 	 * 如果isPlusOneWhenHasRem为true，则当除以分数有余数时每份+1，否则丢弃余数部分
 	 * 
 	 * @param total 总数
@@ -2060,7 +2060,7 @@
 	public static int partValue(int total, int partCount, boolean isPlusOneWhenHasRem) {
 		int partValue = 0;
 		if (total % partCount == 0) {
-			total = total / partCount;
+			partValue = total / partCount;
 		} else {
 			partValue = (int) Math.floor(total / partCount);
 			if (isPlusOneWhenHasRem) {
