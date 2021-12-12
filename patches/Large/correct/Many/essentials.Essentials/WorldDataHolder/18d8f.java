diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
index d68e8ef..9b9b03d 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
@@ -558,7 +558,7 @@
         Yaml yamlUsers = new Yaml(new SafeConstructor());
         Map<String, Object> usersRootDataNode;
         if (!groupsFile.exists()) {
-            throw new IllegalArgumentException("The file which should contain permissions does not exist!\n" + groupsFile.getPath());
+            throw new IllegalArgumentException("The file which should contain permissions does not exist!\n" + usersFile.getPath());
         }
         FileInputStream usersInputStream = new FileInputStream(usersFile);
         try {
@@ -567,7 +567,7 @@
                 throw new NullPointerException();
             }
         } catch (Exception ex) {
-            throw new IllegalArgumentException("The following file couldn't pass on Parser.\n" + groupsFile.getPath(), ex);
+            throw new IllegalArgumentException("The following file couldn't pass on Parser.\n" + usersFile.getPath(), ex);
         } finally {
             usersInputStream.close();
         }
