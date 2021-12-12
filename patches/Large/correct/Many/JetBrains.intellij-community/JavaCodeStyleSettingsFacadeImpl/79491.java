diff --git a/java/java-impl/src/com/intellij/psi/codeStyle/JavaCodeStyleSettingsFacadeImpl.java b/java/java-impl/src/com/intellij/psi/codeStyle/JavaCodeStyleSettingsFacadeImpl.java
index 12abb23..adccd055 100644
--- a/java/java-impl/src/com/intellij/psi/codeStyle/JavaCodeStyleSettingsFacadeImpl.java
+++ b/java/java-impl/src/com/intellij/psi/codeStyle/JavaCodeStyleSettingsFacadeImpl.java
@@ -23,7 +23,7 @@
 public class JavaCodeStyleSettingsFacadeImpl extends JavaCodeStyleSettingsFacade {
   private final CodeStyleSettingsManager myManager;
 
-  public JavaCodeStyleSettingsFacadeImpl(CodeStyleSettingsManager manager) {
+  public JavaCodeStyleSettingsFacadeImpl(ProjectCodeStyleSettingsManager manager) {
     myManager = manager;
   }
 
