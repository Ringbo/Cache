diff --git a/saripaar/src/main/java/com/mobsandgeeks/saripaar/rule/DigitsRule.java b/saripaar/src/main/java/com/mobsandgeeks/saripaar/rule/DigitsRule.java
index 455df18..9b10c00 100644
--- a/saripaar/src/main/java/com/mobsandgeeks/saripaar/rule/DigitsRule.java
+++ b/saripaar/src/main/java/com/mobsandgeeks/saripaar/rule/DigitsRule.java
@@ -32,7 +32,7 @@
         int integer = mRuleAnnotation.integer();
         int fraction = mRuleAnnotation.fraction();
 
-        String digitsRegex = String.format("(\\d{0,%d})(\\.\\d{1,%d})?", integer, fraction);
+        String digitsRegex = String.format(Locale.US, "(\\d{0,%d})(\\.\\d{1,%d})?", integer, fraction);
         return digits.matches(digitsRegex);
     }
 }
