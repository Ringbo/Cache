diff --git a/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java b/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java
index e770619..e0b2c4a 100644
--- a/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java
+++ b/jOOQ-test/src/org/jooq/test/_/testcases/FunctionTests.java
@@ -920,7 +920,7 @@
                     .mul(tanh(1.0))
                     .mul(power(coth(1.0), 2).add(0.1));
 
-                record = create().select(t1, t2, t3, t4, t6, t7, t8, t9, tb).fetchOne();
+                record = create().select(t1, t2, t3, t4, t6, t7, t8, t9, ta, tb).fetchOne();
 
                 // Rounding issues are circumvented by using substring()
                 assertNotNull(record);
