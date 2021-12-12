diff --git a/core/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java b/core/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java
index 9427e83..b6fe900 100644
--- a/core/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java
+++ b/core/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java
@@ -1247,7 +1247,7 @@
         }
 
         public Builder inputRange(@IntRange(from = 0, to = Integer.MAX_VALUE) int minLength,
-                                  @IntRange(from = 1, to = Integer.MAX_VALUE) int maxLength) {
+                                  @IntRange(from = -1, to = Integer.MAX_VALUE) int maxLength) {
             return inputRange(minLength, maxLength, 0);
         }
 
