diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/AbstractGenerator.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/AbstractGenerator.java
index 849651b..abf77b5 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/AbstractGenerator.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/AbstractGenerator.java
@@ -56,7 +56,7 @@
             if (is == null) {
                 is = new FileInputStream(new File(name)); // May throw but never return a null value
             }
-            return new InputStreamReader(is);
+            return new InputStreamReader(is, "UTF-8");
         } catch (Exception e) {
             LOGGER.error(e.getMessage());
         }
