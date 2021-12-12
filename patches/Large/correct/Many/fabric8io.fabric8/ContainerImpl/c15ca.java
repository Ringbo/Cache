diff --git a/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java b/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java
index 5ac46da..7f6464e 100644
--- a/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java
+++ b/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java
@@ -695,7 +695,7 @@
         HashMap<String, String> answer = new HashMap<String, String>();
         answer.put(DataStore.ContainerAttribute.ProvisionStatus.name(), getProvisionStatus());
         answer.put(DataStore.ContainerAttribute.BlueprintStatus.name(), getBlueprintStatus().name());
-        answer.put(DataStore.ContainerAttribute.SpringStatus.name(), getBlueprintStatus().name());
+        answer.put(DataStore.ContainerAttribute.SpringStatus.name(), getSpringStatus().name());
         return answer;
     }
 
