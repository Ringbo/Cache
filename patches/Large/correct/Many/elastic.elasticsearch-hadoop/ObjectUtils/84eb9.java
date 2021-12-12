diff --git a/src/main/java/org/elasticsearch/hadoop/util/ObjectUtils.java b/src/main/java/org/elasticsearch/hadoop/util/ObjectUtils.java
index 4fb9a4e..244f012 100644
--- a/src/main/java/org/elasticsearch/hadoop/util/ObjectUtils.java
+++ b/src/main/java/org/elasticsearch/hadoop/util/ObjectUtils.java
@@ -29,7 +29,7 @@
         }
         try {
             return (T) clz.newInstance();
-        } catch (ReflectiveOperationException e) {
+        } catch (Exception e) {
             throw new IllegalStateException(String.format("Cannot instantiate class [%s]", className), e);
         }
     }
