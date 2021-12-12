diff --git a/core/src/main/java/org/apache/calcite/runtime/SqlFunctions.java b/core/src/main/java/org/apache/calcite/runtime/SqlFunctions.java
index 256d15a..652fb85 100644
--- a/core/src/main/java/org/apache/calcite/runtime/SqlFunctions.java
+++ b/core/src/main/java/org/apache/calcite/runtime/SqlFunctions.java
@@ -544,7 +544,9 @@
 
   /** SQL <code>/</code> operator applied to BigDecimal values. */
   public static BigDecimal divide(BigDecimal b0, BigDecimal b1) {
-    return (b0 == null || b1 == null) ? null : b0.divide(b1);
+    return (b0 == null || b1 == null)
+        ? null
+        : b0.divide(b1, MathContext.DECIMAL64);
   }
 
   // *
