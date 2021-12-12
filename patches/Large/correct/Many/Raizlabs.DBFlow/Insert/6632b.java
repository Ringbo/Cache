diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/Insert.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/Insert.java
index 0523fe8..865dedb 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/Insert.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/Insert.java
@@ -269,7 +269,7 @@
 
             queryBuilder.append(" VALUES(");
             for (int i = 0; i < valuesList.size(); i++) {
-                if (i > 1) {
+                if (i > 0) {
                     queryBuilder.append(",(");
                 }
                 queryBuilder.appendModelArray(valuesList.get(i)).append(")");
