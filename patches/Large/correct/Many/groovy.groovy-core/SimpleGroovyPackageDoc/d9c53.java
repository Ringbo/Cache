diff --git a/subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyPackageDoc.java b/subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyPackageDoc.java
index 59be4d6..5b9b914 100644
--- a/subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyPackageDoc.java
+++ b/subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyPackageDoc.java
@@ -132,7 +132,7 @@
 
     public String getRelativeRootPath() {
         StringTokenizer tokenizer = new StringTokenizer(name(), "" + FS);
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         while (tokenizer.hasMoreTokens()) {
             tokenizer.nextToken();
             sb.append("../");
