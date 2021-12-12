diff --git a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java
index eb533b2..60ebc25 100644
--- a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java
+++ b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java
@@ -792,7 +792,8 @@
         nestedDefinitions.put(new AntTypeId(nestedElement), className);
       }
     }
-    return new AntTypeDefinitionImpl(id, typeClass.getName(), isTask, attributes, nestedDefinitions);
+
+    return new AntTypeDefinitionImpl(id, typeClass.getName(), isTask, attributes, nestedDefinitions, helper.getExtensionPointTypes(), null);
   }
   
   @Nullable
