diff --git a/Medium/CombinationSum3.java b/Medium/CombinationSum3.java
index 7dd3ee8..22c242d 100644
--- a/Medium/CombinationSum3.java
+++ b/Medium/CombinationSum3.java
@@ -52,8 +52,8 @@
         for (int i = start; i <= 9; i++) {
             if (n - i >= 0) { // n < i can be skipped
                 comb.add(i);
-                helper(ans, comb, k, i + 1, n - i);
-                comb.remove(comb.size() - 1); // remove the last number added
+                backtrack(ans, comb, k, i + 1, n - i);
+                comb.remove(comb.size() - 1);
             }
         }
     }
