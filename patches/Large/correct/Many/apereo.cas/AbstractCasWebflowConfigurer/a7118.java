diff --git a/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/configurer/AbstractCasWebflowConfigurer.java b/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/configurer/AbstractCasWebflowConfigurer.java
index 4a5357c..ca34fd0 100644
--- a/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/configurer/AbstractCasWebflowConfigurer.java
+++ b/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/configurer/AbstractCasWebflowConfigurer.java
@@ -713,7 +713,7 @@
             c.add(def.getExecutionCriteria());
             return c;
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
