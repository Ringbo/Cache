diff --git a/src/org/traccar/model/DatabaseDataManager.java b/src/org/traccar/model/DatabaseDataManager.java
index 5c1b292..adcddd7 100644
--- a/src/org/traccar/model/DatabaseDataManager.java
+++ b/src/org/traccar/model/DatabaseDataManager.java
@@ -212,7 +212,7 @@
             String query = queryUpdateLatestPositionTemplate;
             query = query.replace("_database_", this.getDeviceById(position.getDeviceId()).getDatabase());
             if (query != null) {
-                queryAddPosition = new NamedParameterStatement(globalConnection, query);
+                queryUpdateLatestPosition = new NamedParameterStatement(globalConnection, query);
             }
         }
 
