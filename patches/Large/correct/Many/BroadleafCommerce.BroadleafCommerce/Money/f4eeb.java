diff --git a/common/src/main/java/org/broadleafcommerce/common/money/Money.java b/common/src/main/java/org/broadleafcommerce/common/money/Money.java
index 7346b73..3004289 100644
--- a/common/src/main/java/org/broadleafcommerce/common/money/Money.java
+++ b/common/src/main/java/org/broadleafcommerce/common/money/Money.java
@@ -236,7 +236,7 @@
     }
 
     public Money divide(BigDecimal divisor, RoundingMode roundingMode) {
-        return new Money(amount.divide(divisor, amount.precision(), roundingMode), currency, amount.scale() == 0 ? BankersRounding.getScaleForCurrency(currency) : amount.scale());
+        return new Money(amount.divide(divisor, amount.scale(), roundingMode), currency, amount.scale() == 0 ? BankersRounding.getScaleForCurrency(currency) : amount.scale());
     }
 
     public Money abs() {
