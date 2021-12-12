diff --git a/ql/src/java/org/apache/hadoop/hive/ql/plan/MapWork.java b/ql/src/java/org/apache/hadoop/hive/ql/plan/MapWork.java
index e7256cc..d5a30da 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/plan/MapWork.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/plan/MapWork.java
@@ -201,7 +201,7 @@
   public void addPathToAlias(Path path, String newAlias){
     ArrayList<String> aliases = pathToAliases.get(path);
     if (aliases == null) {
-      aliases = new ArrayList<>();
+      aliases = new ArrayList<>(1);
       StringInternUtils.internUriStringsInPath(path);
       pathToAliases.put(path, aliases);
     }
