diff --git a/source/com/intellij/psi/impl/source/html/ScriptSupportUtil.java b/source/com/intellij/psi/impl/source/html/ScriptSupportUtil.java
index dd6bf0b..b550184 100644
--- a/source/com/intellij/psi/impl/source/html/ScriptSupportUtil.java
+++ b/source/com/intellij/psi/impl/source/html/ScriptSupportUtil.java
@@ -25,7 +25,7 @@
  */
 public class ScriptSupportUtil {
   private static final Key<XmlTag[]> CachedScriptTagsKey = Key.create("script tags");
-  private static final Key<String> ProcessingDeclarationsKey = Key.create("processingDeclarationd");
+  private static final ThreadLocal<String> ProcessingDeclarationsFlag = new ThreadLocal<String>();
   private static final @NonNls String SCRIPT_TAG = "script";
 
   public static void clearCaches(XmlFile element) {
@@ -62,10 +62,10 @@
       element.putUserData(CachedScriptTagsKey, myCachedScriptTags);
     }
 
-    if (element.getUserData(ProcessingDeclarationsKey) != null) return true;
+    if (ProcessingDeclarationsFlag.get() != null) return true;
     
     try {
-      element.putUserData(ProcessingDeclarationsKey, "");
+      ProcessingDeclarationsFlag.set("");
 
       for (XmlTag tag : myCachedScriptTags) {
         final XmlTagChild[] children = tag.getValue().getChildren();
@@ -95,7 +95,7 @@
         }
       }
     } finally {
-      element.putUserData(ProcessingDeclarationsKey, null);
+      ProcessingDeclarationsFlag.set(null);
     }
 
     return true;
