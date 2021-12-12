diff --git a/config-model/src/main/java/com/yahoo/vespa/model/InstanceResolver.java b/config-model/src/main/java/com/yahoo/vespa/model/InstanceResolver.java
index f71e6d1..272569f 100644
--- a/config-model/src/main/java/com/yahoo/vespa/model/InstanceResolver.java
+++ b/config-model/src/main/java/com/yahoo/vespa/model/InstanceResolver.java
@@ -61,7 +61,7 @@
             if (targetDef != null) applyDef(builder, targetDef);
             Class<? extends ConfigInstance> clazz = getConfigClass(defKey, builder.getClass().getClassLoader());
             return clazz.getConstructor(builder.getClass()).newInstance(builder);
-        } catch (Exception e) {
+        } catch (Throwable e) { // We might get an Error here if there are class loading issues, so catch Throwable
             throw new ConfigurationRuntimeException(e);
         }
     }
