diff --git a/subprojects/platform-base/src/main/java/org/gradle/language/base/sources/BaseLanguageSourceSet.java b/subprojects/platform-base/src/main/java/org/gradle/language/base/sources/BaseLanguageSourceSet.java
index e1d1e04..b5dd444 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/language/base/sources/BaseLanguageSourceSet.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/language/base/sources/BaseLanguageSourceSet.java
@@ -98,11 +98,11 @@
 
     private static ThreadLocal<SourceSetInfo> nextSourceSetInfo = new ThreadLocal<SourceSetInfo>();
 
-    public static <T extends LanguageSourceSet> T create(Class<T> type, String name, String parentName, FileResolver fileResolver, Instantiator instantiator) {
+    public static <T extends LanguageSourceSet> T create(Class<? extends LanguageSourceSet> publicType, Class<T> type, String name, String parentName, FileResolver fileResolver, Instantiator instantiator) {
         if (type.equals(BaseLanguageSourceSet.class)) {
             throw new ModelInstantiationException("Cannot create instance of abstract class BaseLanguageSourceSet.");
         }
-        nextSourceSetInfo.set(new SourceSetInfo(name, parentName, type.getSimpleName(), fileResolver));
+        nextSourceSetInfo.set(new SourceSetInfo(name, parentName, publicType.getSimpleName(), fileResolver));
         try {
             try {
                 return instantiator.newInstance(type);
