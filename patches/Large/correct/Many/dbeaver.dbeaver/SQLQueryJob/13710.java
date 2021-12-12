diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
index bb3f15b..abe0b4a 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
@@ -571,7 +571,7 @@
         for (int i = parameters.size(); i > 0; i--) {
             SQLQueryParameter parameter = parameters.get(i - 1);
             String paramValue = parameter.getValue();
-            if (paramValue.isEmpty()) {
+            if (paramValue == null || paramValue.isEmpty()) {
                 paramValue = SQLConstants.NULL_VALUE;
             }
             query = query.substring(0, parameter.getTokenOffset()) + paramValue + query.substring(parameter.getTokenOffset() + parameter.getTokenLength());
