diff --git a/driver-embedded/src/main/com/mongodb/embedded/client/MongoClientSettings.java b/driver-embedded/src/main/com/mongodb/embedded/client/MongoClientSettings.java
index 7efb3c5..9554029 100644
--- a/driver-embedded/src/main/com/mongodb/embedded/client/MongoClientSettings.java
+++ b/driver-embedded/src/main/com/mongodb/embedded/client/MongoClientSettings.java
@@ -120,7 +120,7 @@
                             connectionString.getHosts().get(0)));
                 }
             } else {
-                throw new MongoClientException(format("Connection String contains invalid hosts: %s", connectionString.getHosts()));
+                throw new MongoClientEmbeddedException(format("Connection String contains invalid hosts: %s", connectionString.getHosts()));
             }
             return this;
         }
