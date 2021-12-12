diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/CommandUtil.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/CommandUtil.java
index a40df9a..5c56cb2 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/CommandUtil.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/CommandUtil.java
@@ -169,9 +169,9 @@
 
   public static void putChangeLists(@NotNull List<String> parameters, @Nullable Iterable<String> changeLists) {
     if (changeLists != null) {
-      for (Object changeList : changeLists) {
+      for (String changeList : changeLists) {
         parameters.add("--cl");
-        parameters.add((String) changeList);
+        parameters.add(changeList);
       }
     }
   }
