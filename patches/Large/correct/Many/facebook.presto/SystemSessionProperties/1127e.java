diff --git a/presto-main/src/main/java/com/facebook/presto/SystemSessionProperties.java b/presto-main/src/main/java/com/facebook/presto/SystemSessionProperties.java
index 2e0f289..2464b59 100644
--- a/presto-main/src/main/java/com/facebook/presto/SystemSessionProperties.java
+++ b/presto-main/src/main/java/com/facebook/presto/SystemSessionProperties.java
@@ -258,8 +258,8 @@
                 booleanSessionProperty(
                         LEGACY_ORDER_BY,
                         "Use legacy rules for column resolution in ORDER BY clause",
-                        false,
-                        featuresConfig.isLegacyOrderBy()));
+                        featuresConfig.isLegacyOrderBy(),
+                        false));
     }
 
     public List<PropertyMetadata<?>> getSessionProperties()
