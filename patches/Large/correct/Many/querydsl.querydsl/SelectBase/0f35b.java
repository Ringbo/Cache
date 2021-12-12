diff --git a/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java b/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java
index 3b3a76c..491344f 100644
--- a/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java
+++ b/querydsl-sql/src/test/java/com/querydsl/sql/SelectBase.java
@@ -233,7 +233,7 @@
 
     @Test
     public void Case() {
-        NumberExpression<Float> numExpression = employee.salary.floatValue().divide(employee2.salary.floatValue()).multiply(100);
+        NumberExpression<Float> numExpression = employee.salary.floatValue().divide(employee2.salary.floatValue()).multiply(100.1);
         NumberExpression<Float> numExpression2 = employee.id.when(0).then(0.0F).otherwise(numExpression);
         assertEquals(ImmutableList.of(87, 90, 88, 87, 83, 80, 75),
                 query().from(employee, employee2)
