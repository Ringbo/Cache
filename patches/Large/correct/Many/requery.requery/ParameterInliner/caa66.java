diff --git a/requery/src/main/java/io/requery/sql/ParameterInliner.java b/requery/src/main/java/io/requery/sql/ParameterInliner.java
index fef9461..20e91d9 100644
--- a/requery/src/main/java/io/requery/sql/ParameterInliner.java
+++ b/requery/src/main/java/io/requery/sql/ParameterInliner.java
@@ -118,7 +118,7 @@
                 ArrayFunctions.forEach(array, collect(list));
                 expand(sb, index, array.length);
             } else {
-                list.add(parameter);
+                list.add(0, parameter);
             }
         }
         sql = sb.toString();
