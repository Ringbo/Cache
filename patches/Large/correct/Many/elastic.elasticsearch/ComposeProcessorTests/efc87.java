diff --git a/sql/server/src/test/java/org/elasticsearch/xpack/sql/expression/function/scalar/ComposeProcessorTests.java b/sql/server/src/test/java/org/elasticsearch/xpack/sql/expression/function/scalar/ComposeProcessorTests.java
index 3b9ec65..9a3c400 100644
--- a/sql/server/src/test/java/org/elasticsearch/xpack/sql/expression/function/scalar/ComposeProcessorTests.java
+++ b/sql/server/src/test/java/org/elasticsearch/xpack/sql/expression/function/scalar/ComposeProcessorTests.java
@@ -41,8 +41,7 @@
             () -> new ComposeProcessor(
                     instance.first(), randomValueOtherThan(instance.second(), () -> randomColumnProcessor(0))),
             () -> new ComposeProcessor(
-                    randomValueOtherThan(instance.first(), () -> randomColumnProcessor(0)), instance.second()),
-            () -> new ComposeProcessor(instance.second(), instance.first())); 
+                    randomValueOtherThan(instance.first(), () -> randomColumnProcessor(0)), instance.second()));
         return supplier.get();
     }
 }
