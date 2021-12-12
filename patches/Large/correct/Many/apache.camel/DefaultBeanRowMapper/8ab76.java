diff --git a/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/DefaultBeanRowMapper.java b/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/DefaultBeanRowMapper.java
index 0416573..393bcb4 100644
--- a/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/DefaultBeanRowMapper.java
+++ b/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/DefaultBeanRowMapper.java
@@ -39,7 +39,7 @@
                 continue;
             }
             if (toUpper) {
-                char upper = Character.toLowerCase(ch);
+                char upper = Character.toUpperCase(ch);
                 sb.append(upper);
                 // reset flag
                 toUpper = false;
