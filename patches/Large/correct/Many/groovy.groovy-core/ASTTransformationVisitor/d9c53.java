diff --git a/src/main/org/codehaus/groovy/transform/ASTTransformationVisitor.java b/src/main/org/codehaus/groovy/transform/ASTTransformationVisitor.java
index 44028f6..f0380cd 100644
--- a/src/main/org/codehaus/groovy/transform/ASTTransformationVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/ASTTransformationVisitor.java
@@ -258,7 +258,7 @@
             Class.forName("java.lang.annotation.Annotation"); // test for 1.5 JVM
         } catch (Exception e) {
             // we failed, notify the user
-            StringBuffer sb = new StringBuffer();
+            StringBuilder sb = new StringBuilder();
             sb.append("Global ASTTransformations are not enabled in retro builds of groovy.\n");
             sb.append("The following transformations will be ignored:");
             for (Map.Entry<String, URL> entry : transformNames.entrySet()) {
