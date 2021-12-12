diff --git a/subprojects/groovy-bsf/src/main/java/org/codehaus/groovy/bsf/GroovyEngine.java b/subprojects/groovy-bsf/src/main/java/org/codehaus/groovy/bsf/GroovyEngine.java
index a9e4262..587fbb6 100644
--- a/subprojects/groovy-bsf/src/main/java/org/codehaus/groovy/bsf/GroovyEngine.java
+++ b/subprojects/groovy-bsf/src/main/java/org/codehaus/groovy/bsf/GroovyEngine.java
@@ -50,7 +50,7 @@
         if (inName.startsWith("scriptdef_")) inName = inName.substring(10);
         if (inName.equals("")) return "_";
 
-        StringBuffer output = new StringBuffer(inName.length());
+        StringBuilder output = new StringBuilder(inName.length());
         boolean firstChar = true;
         for (int i = 0; i < inName.length(); ++i) {
             char ch = inName.charAt(i);
