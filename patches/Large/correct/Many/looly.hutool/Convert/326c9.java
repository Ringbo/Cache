diff --git a/hutool-core/src/main/java/com/xiaoleilu/hutool/convert/Convert.java b/hutool-core/src/main/java/com/xiaoleilu/hutool/convert/Convert.java
index 701a567..9d0bae2 100644
--- a/hutool-core/src/main/java/com/xiaoleilu/hutool/convert/Convert.java
+++ b/hutool-core/src/main/java/com/xiaoleilu/hutool/convert/Convert.java
@@ -392,7 +392,7 @@
 	 * @return 结果
 	 */
 	public static BigInteger toBigInteger(Object value, BigInteger defaultValue) {
-		return convert(BigInteger.class, defaultValue, defaultValue);
+		return convert(BigInteger.class, value, defaultValue);
 	}
 
 	/**
@@ -417,7 +417,7 @@
 	 * @return 结果
 	 */
 	public static BigDecimal toBigDecimal(Object value, BigDecimal defaultValue) {
-		return convert(BigDecimal.class, defaultValue, defaultValue);
+		return convert(BigDecimal.class, value, defaultValue);
 	}
 
 	/**
