diff --git a/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/presentation/AdvancedValidationITest.java b/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/presentation/AdvancedValidationITest.java
index cec12a4..1e05c93 100644
--- a/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/presentation/AdvancedValidationITest.java
+++ b/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/presentation/AdvancedValidationITest.java
@@ -75,6 +75,6 @@
                 body("price.sum()", is(38.0d)).
                 body("dimensions.width.min()", is(1.0f)).
                 body("name.collect { it.length() }.max()", is(16)).
-                body("dimensions.multiply(2).height.sum()", is(21));
+                body("dimensions.multiply(2).height.sum()", is(21.0));
     }
 }
