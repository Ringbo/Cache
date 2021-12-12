diff --git a/src/persistence/org/codehaus/groovy/grails/metaclass/DataBindingDynamicConstructor.java b/src/persistence/org/codehaus/groovy/grails/metaclass/DataBindingDynamicConstructor.java
index ab53fe5..cb4162b 100644
--- a/src/persistence/org/codehaus/groovy/grails/metaclass/DataBindingDynamicConstructor.java
+++ b/src/persistence/org/codehaus/groovy/grails/metaclass/DataBindingDynamicConstructor.java
@@ -64,13 +64,13 @@
 			GrailsParameterMap parameterMap = (GrailsParameterMap)map;
 			HttpServletRequest request = parameterMap.getRequest();
 			
-			ServletRequestDataBinder dataBinder = GrailsDataBinder.createBinder(map, instance.getClass().getName(),request); 
+			ServletRequestDataBinder dataBinder = GrailsDataBinder.createBinder(instance, instance.getClass().getName(),request); 
 			dataBinder.bind(request);
 			return instance;
 		}
 		else if (map instanceof HttpServletRequest) {
 			HttpServletRequest request = (HttpServletRequest)map;
-			ServletRequestDataBinder dataBinder = GrailsDataBinder.createBinder(map, instance.getClass().getName(),request); 
+			ServletRequestDataBinder dataBinder = GrailsDataBinder.createBinder(instance, instance.getClass().getName(),request); 
 			dataBinder.bind(request);
 			return instance;			
 		}
