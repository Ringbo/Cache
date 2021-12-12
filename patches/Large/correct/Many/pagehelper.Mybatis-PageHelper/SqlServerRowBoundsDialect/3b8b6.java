diff --git a/src/main/java/com/github/pagehelper/dialect/rowbounds/SqlServerRowBoundsDialect.java b/src/main/java/com/github/pagehelper/dialect/rowbounds/SqlServerRowBoundsDialect.java
index a36a4b3..61126d9 100644
--- a/src/main/java/com/github/pagehelper/dialect/rowbounds/SqlServerRowBoundsDialect.java
+++ b/src/main/java/com/github/pagehelper/dialect/rowbounds/SqlServerRowBoundsDialect.java
@@ -81,7 +81,7 @@
                 this.replaceSql = (ReplaceSql) Class.forName(replaceSql).newInstance();
             } catch (Exception e) {
                 throw new RuntimeException("replaceSql 参数配置的值不符合要求，可选值为 simple 和 regex，或者是实现了 "
-                        + ReplaceSql.class.getCanonicalName() + " 接口的全限定类名");
+                        + ReplaceSql.class.getCanonicalName() + " 接口的全限定类名", e);
             }
         }
     }
