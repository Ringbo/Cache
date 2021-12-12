diff --git a/src/org/pentaho/di/core/plugins/JobEntryPluginType.java b/src/org/pentaho/di/core/plugins/JobEntryPluginType.java
index 6b431ae..46add75 100644
--- a/src/org/pentaho/di/core/plugins/JobEntryPluginType.java
+++ b/src/org/pentaho/di/core/plugins/JobEntryPluginType.java
@@ -152,7 +152,7 @@
 
 	    Map<Class<?>, String> classMap = new HashMap<Class<?>, String>();
 	    
-	    classMap.put(JobEntry.class, clazz.getName());
+	    classMap.put(JobEntryInterface.class, clazz.getName());
 	    
 	    PluginClassTypes classTypesAnnotation = clazz.getAnnotation(PluginClassTypes.class);
 	    if(classTypesAnnotation != null){
@@ -164,7 +164,7 @@
 	      }
 	    }
 		
-		PluginInterface stepPlugin = new Plugin(ids, this.getClass(), JobEntry.class, category, name, description, jobEntry.image(), false, nativeJobEntry, classMap, libraries, null);
+		PluginInterface stepPlugin = new Plugin(ids, this.getClass(), JobEntryInterface.class, category, name, description, jobEntry.image(), false, nativeJobEntry, classMap, libraries, null);
 		registry.registerPlugin(this.getClass(), stepPlugin);
 	}
 
