diff --git a/server/sonar-ce/src/test/java/org/sonar/ce/container/ComputeEngineContainerImplTest.java b/server/sonar-ce/src/test/java/org/sonar/ce/container/ComputeEngineContainerImplTest.java
index 6e9e5db..b56bd13 100644
--- a/server/sonar-ce/src/test/java/org/sonar/ce/container/ComputeEngineContainerImplTest.java
+++ b/server/sonar-ce/src/test/java/org/sonar/ce/container/ComputeEngineContainerImplTest.java
@@ -96,7 +96,7 @@
         + 22 // level 1
         + 47 // content of DaoModule
         + 1 // content of EsSearchModule
-        + 58 // content of CorePropertyDefinitions
+        + 56 // content of CorePropertyDefinitions
         + 1 // content of CePropertyDefinitions
     );
     assertThat(picoContainer.getParent().getParent().getParent().getParent()).isNull();
