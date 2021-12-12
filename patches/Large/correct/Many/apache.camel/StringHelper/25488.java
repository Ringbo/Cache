diff --git a/camel-core/src/main/java/org/apache/camel/util/StringHelper.java b/camel-core/src/main/java/org/apache/camel/util/StringHelper.java
index 54579af..46bdf8c 100644
--- a/camel-core/src/main/java/org/apache/camel/util/StringHelper.java
+++ b/camel-core/src/main/java/org/apache/camel/util/StringHelper.java
@@ -154,7 +154,8 @@
             return false;
         }
 
-        if (expression.indexOf("${") >= 0) {
+        // for the simple language the expression start token could be "${"
+        if ("simple".equalsIgnoreCase(language) && expression.indexOf("${") >= 0) {
             return true;
         }
 
