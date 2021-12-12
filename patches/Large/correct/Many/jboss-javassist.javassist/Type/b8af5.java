diff --git a/src/main/javassist/bytecode/analysis/Type.java b/src/main/javassist/bytecode/analysis/Type.java
index 38df93f..234f050 100644
--- a/src/main/javassist/bytecode/analysis/Type.java
+++ b/src/main/javassist/bytecode/analysis/Type.java
@@ -206,9 +206,9 @@
         if (!isArray()) return 0;
 
         String name = clazz.getName();
-        int pos = name.length() - 2;
+        int pos = name.length() - 1;
         int count = 0;
-        while (name.charAt(pos) == '[' ) {
+        while (name.charAt(pos) == ']' ) {
             pos -= 2;
             count++;
         }
