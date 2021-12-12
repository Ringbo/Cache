diff --git a/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java b/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java
index 1a15216..a49d01f 100755
--- a/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java
+++ b/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java
@@ -386,7 +386,7 @@
                }
                
                superClass = superClass.getSuperclass();
-               if (superClass == Object.class) {
+               if (superClass == Object.class || superClass == null) {
                    break;
                }
             }
@@ -467,7 +467,7 @@
                }
                
                superClass = superClass.getSuperclass();
-               if (superClass == Object.class) {
+               if (superClass == Object.class || superClass == null) {
                    break;
                }
             }
