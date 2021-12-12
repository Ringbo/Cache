diff --git a/javaparser-core/src/main/java/com/github/javaparser/resolution/declarations/ResolvedMethodLikeDeclaration.java b/javaparser-core/src/main/java/com/github/javaparser/resolution/declarations/ResolvedMethodLikeDeclaration.java
index 90aa2e7..97f35f5 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/resolution/declarations/ResolvedMethodLikeDeclaration.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/resolution/declarations/ResolvedMethodLikeDeclaration.java
@@ -61,7 +61,7 @@
      * The signature of the method.
      */
     default String getSignature() {
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         sb.append(getName());
         sb.append("(");
         for (int i = 0; i < getNumberOfParams(); i++) {
