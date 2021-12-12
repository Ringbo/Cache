diff --git a/common/src/main/java/org/broadleafcommerce/common/util/dao/TQRestriction.java b/common/src/main/java/org/broadleafcommerce/common/util/dao/TQRestriction.java
index 8a8ae67..e9aaf9e 100644
--- a/common/src/main/java/org/broadleafcommerce/common/util/dao/TQRestriction.java
+++ b/common/src/main/java/org/broadleafcommerce/common/util/dao/TQRestriction.java
@@ -101,7 +101,7 @@
             if (parameter != null) {
                 sb.append(' ');
                 String pname = ':' + parameterName;
-                if (operation.equals("in")) {
+                if (operation.equals("in") || operation.equals("not in")) {
                     pname = "(" + pname + ")";
                 }
                 sb.append(pname);
