diff --git a/core/java/com/android/internal/app/ChooserActivity.java b/core/java/com/android/internal/app/ChooserActivity.java
index 9708cce..c6b340b 100644
--- a/core/java/com/android/internal/app/ChooserActivity.java
+++ b/core/java/com/android/internal/app/ChooserActivity.java
@@ -920,7 +920,7 @@
         @Override
         public int compare(ChooserTarget lhs, ChooserTarget rhs) {
             // Descending order
-            return (int) Math.signum(lhs.getScore() - rhs.getScore());
+            return (int) Math.signum(rhs.getScore() - lhs.getScore());
         }
     }
 
