diff --git a/code/mathematical-algorithms/sum_of_digits/SumOfDigits.java b/code/mathematical-algorithms/sum_of_digits/SumOfDigits.java
index 940f394..37712b1 100644
--- a/code/mathematical-algorithms/sum_of_digits/SumOfDigits.java
+++ b/code/mathematical-algorithms/sum_of_digits/SumOfDigits.java
@@ -2,7 +2,7 @@
 public class SumOfDigits {
     public static int sumDigits(long n) {
         int sum = 0;
-        while (n >= 0) {
+        while (n > 0) {
             sum += n % 10;
             n = n / 10;
         }
