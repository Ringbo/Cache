diff --git a/requery/src/main/java/io/requery/sql/ParameterInliner.java b/requery/src/main/java/io/requery/sql/ParameterInliner.java
index 1ba045d..b1edfb6 100644
--- a/requery/src/main/java/io/requery/sql/ParameterInliner.java
+++ b/requery/src/main/java/io/requery/sql/ParameterInliner.java
@@ -78,7 +78,7 @@
         final Consumer<Object> collect = new Consumer<Object>() {
             @Override
             public void accept(Object o) {
-                newParameters.add(o);
+                newParameters.add(0, o);
             }
         };
         // Iterate backwards to avoid modifying the indices of parameters in the front
