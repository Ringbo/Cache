diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeMethodReferenceInspection.java b/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeMethodReferenceInspection.java
index d6d8923..e5a4047 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeMethodReferenceInspection.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeMethodReferenceInspection.java
@@ -36,7 +36,7 @@
 public class AnonymousCanBeMethodReferenceInspection extends BaseJavaBatchLocalInspectionTool {
   public static final Logger LOG = Logger.getInstance("#" + AnonymousCanBeMethodReferenceInspection.class.getName());
 
-  public boolean reportNotAnnotatedInterfaces = false;
+  public boolean reportNotAnnotatedInterfaces = true;
 
   @Nls
   @NotNull
