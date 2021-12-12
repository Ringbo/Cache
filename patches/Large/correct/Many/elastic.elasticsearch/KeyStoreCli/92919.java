diff --git a/core/src/main/java/org/elasticsearch/common/settings/KeyStoreCli.java b/core/src/main/java/org/elasticsearch/common/settings/KeyStoreCli.java
index c2345f2..1681834 100644
--- a/core/src/main/java/org/elasticsearch/common/settings/KeyStoreCli.java
+++ b/core/src/main/java/org/elasticsearch/common/settings/KeyStoreCli.java
@@ -32,7 +32,7 @@
         subcommands.put("create", new CreateKeyStoreCommand());
         subcommands.put("list", new ListKeyStoreCommand());
         subcommands.put("add", new AddStringKeyStoreCommand());
-        subcommands.put("add-file", new AddStringKeyStoreCommand());
+        subcommands.put("add-file", new AddFileKeyStoreCommand());
         subcommands.put("remove", new RemoveSettingKeyStoreCommand());
     }
 
