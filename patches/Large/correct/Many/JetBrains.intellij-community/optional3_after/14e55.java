diff --git a/java/typeMigration/testData/inspections/guava/optional3_after.java b/java/typeMigration/testData/inspections/guava/optional3_after.java
index 764fc40..db95e65 100644
--- a/java/typeMigration/testData/inspections/guava/optional3_after.java
+++ b/java/typeMigration/testData/inspections/guava/optional3_after.java
@@ -6,7 +6,7 @@
 public class Main7 {
 
   public static void main(String[] args) {
-    Optional<? extends String> image = new ArrayList<String>().stream().filter(getPredicate()::test).findFirst();
+    Optional<? extends String> image = new ArrayList<String>().stream().filter(getPredicate()::apply).findFirst();
     if (image.isPresent()) {
       System.out.println(image.get());
     }
