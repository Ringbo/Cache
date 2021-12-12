diff --git a/model/sessions-infinispan/src/main/java/org/keycloak/models/sessions/infinispan/ClientSessionAdapter.java b/model/sessions-infinispan/src/main/java/org/keycloak/models/sessions/infinispan/ClientSessionAdapter.java
index 0dc6299..0b804b4 100755
--- a/model/sessions-infinispan/src/main/java/org/keycloak/models/sessions/infinispan/ClientSessionAdapter.java
+++ b/model/sessions-infinispan/src/main/java/org/keycloak/models/sessions/infinispan/ClientSessionAdapter.java
@@ -178,7 +178,7 @@
         if (entity.getUserSessionNotes() == null) {
             entity.setUserSessionNotes(new HashMap<String, String>());
         }
-        entity.getNotes().put(name, value);
+        entity.getUserSessionNotes().put(name, value);
         update();
 
     }
