diff --git a/platform/platform-impl/src/com/intellij/ide/ui/laf/IntelliJLookAndFeelInfo.java b/platform/platform-impl/src/com/intellij/ide/ui/laf/IntelliJLookAndFeelInfo.java
index 76ef1ab..22615ef 100644
--- a/platform/platform-impl/src/com/intellij/ide/ui/laf/IntelliJLookAndFeelInfo.java
+++ b/platform/platform-impl/src/com/intellij/ide/ui/laf/IntelliJLookAndFeelInfo.java
@@ -22,13 +22,13 @@
 /**
  * @author Konstantin Bulenkov
  */
-public class IntelliJLookAndFeelInfo extends UIManager.LookAndFeelInfo {
+public final class IntelliJLookAndFeelInfo extends UIManager.LookAndFeelInfo {
   public IntelliJLookAndFeelInfo(){
     super(IdeBundle.message("idea.intellij.look.and.feel"), IntelliJLaf.class.getName());
   }
 
   public boolean equals(Object obj){
-    return (obj instanceof IdeaLookAndFeelInfo);
+    return (obj instanceof IntelliJLookAndFeelInfo);
   }
 
   public int hashCode(){
