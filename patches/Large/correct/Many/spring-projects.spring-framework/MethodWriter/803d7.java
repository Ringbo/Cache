diff --git a/spring-core/src/main/java/org/springframework/asm/MethodWriter.java b/spring-core/src/main/java/org/springframework/asm/MethodWriter.java
index 20035da..e8b226d 100644
--- a/spring-core/src/main/java/org/springframework/asm/MethodWriter.java
+++ b/spring-core/src/main/java/org/springframework/asm/MethodWriter.java
@@ -2032,7 +2032,7 @@
         }
         int size = 8;
         if (code.length > 0) {
-            if (code.length > 65536) {
+            if (code.length > 65535) {
                 throw new RuntimeException("Method code too large!");
             }
             cw.newUTF8("Code");
