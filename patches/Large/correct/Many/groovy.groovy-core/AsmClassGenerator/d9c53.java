diff --git a/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java b/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
index f9862e4..85799ed 100644
--- a/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
+++ b/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
@@ -740,7 +740,7 @@
 
     private static String makeFieldClassName(ClassNode type) {
         String internalName = BytecodeHelper.getClassInternalName(type);
-        StringBuffer ret = new StringBuffer(internalName.length());
+        StringBuilder ret = new StringBuilder(internalName.length());
         for (int i = 0; i < internalName.length(); i++) {
             char c = internalName.charAt(i);
             if (c == '/') {
